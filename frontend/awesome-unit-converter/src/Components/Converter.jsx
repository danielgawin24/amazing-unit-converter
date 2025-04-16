import { useState } from "react";
import ConverterForm from "./ConverterForm";
import ConversionResults from "./ConversionResults";

function Converter(props) {
	const [unitType, setUnitType] = useState(props.units);
	const [isConverting, setIsConverting] = useState(false);
	const [value, setValue] = useState("");
	const [valueError, setValueError] = useState(false);
	const [fromUnit, setFromUnit] = useState("");
	const [fromUnitError, setFromUnitError] = useState(false);
	const [toUnit, setToUnit] = useState("");
	const [toUnitError, setToUnitError] = useState(false);
	const [requestResult, setRequestResult] = useState("");

	let addOn = "";
	switch (unitType) {
		case "length":
			addOn = "LengthWeight";
			break;
		case "weight":
			addOn = "LengthWeight";
			break;
		case "temperature":
			addOn = "Temperature";
			break;
	}
	const url = "http://localhost:8080/api/convert" + addOn;

	const fetchData = async () => {
		try {
			const response = await fetch(url, {
				method: "POST",
				headers: {
					"Content-Type": "application/json",
				},
				body: JSON.stringify({
					type: unitType,
					value: value,
					fromUnit: fromUnit,
					toUnit: toUnit,
					conversionResult: null,
				}),
			});
			// if (!response.ok) {
			// 	throw new Error(
			// 		`Could not fetch resources. Status: ${response.status}`
			// 	);
			// }
			const json = await response.json();
			setRequestResult(json);
		} catch (error) {
			console.error("Fetch error: ", error);
		}
	};

	function handleSubmit(event) {
		event.preventDefault();
		if (value === "") {
			setValueError(true);
		}
		if (fromUnit === "") {
			setFromUnitError(true);
		}
		if (toUnit === "") {
			setToUnitError(true);
		}
		if (value != "" && fromUnit != "" && toUnit != "") {
			fetchData();
			setIsConverting(true);
		}
	}

	return (
		<>
			<h1>Awesome Unit Converter</h1>
			{isConverting === false && (
				<ConverterForm
					value={value}
					setValue={setValue}
					fromUnit={fromUnit}
					setFromUnit={setFromUnit}
					toUnit={toUnit}
					setToUnit={setToUnit}
					unitType={unitType}
					setUnitType={setUnitType}
					handleSubmit={handleSubmit}
					valueError={valueError}
					setValueError={setValueError}
					fromUnitError={fromUnitError}
					setFromUnitError={setFromUnitError}
					toUnitError={toUnitError}
					setToUnitError={setToUnitError}
				/>
			)}
			{isConverting === true && (
				<ConversionResults
					value={requestResult.value}
					fromUnit={requestResult.fromUnit}
					conversionResult={requestResult.conversionResult}
					toUnit={requestResult.toUnit}
					setIsConverting={setIsConverting}
				/>
			)}
		</>
	);
}

export default Converter;
