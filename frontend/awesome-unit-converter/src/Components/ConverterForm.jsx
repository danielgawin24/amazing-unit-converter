import LengthFormOptions from "./FormUnitOptions/LengthFormOptions";
import WeightFormOptions from "./FormUnitOptions/WeightFormOptions";
import TempFormOptions from "./FormUnitOptions/TempFormOptions";
import NavBar from "./NavBar";
import { useRef } from "react";

function ConverterForm(props) {
	function style(error) {
		if (error) {
			return { backgroundColor: "rgba(255, 0, 0, 0.5)" };
		}
	}

	function resetForm() {
		props.setValueError(false);
		props.setFromUnitError(false);
		props.setToUnitError(false);
		props.setValue("");
		props.setFromUnit("");
		props.setToUnit("");
	}
	function swapUnits() {
		props.setToUnit(props.fromUnit);
		props.setFromUnit(props.toUnit);
	}

	const unitTypeMap = new Map([
		["length", <LengthFormOptions />],
		["weight", <WeightFormOptions />],
		["temperature", <TempFormOptions />],
	]);

	return (
		<div className="converterContainer">
			<NavBar unitType={props.unitType} />
			<form
				className="converter-form"
				name="converter-form"
				onSubmit={props.handleSubmit}
				method="post"
			>
				<label htmlFor="length-input">
					<>Enter the {props.unitType} to convert</>
				</label>
				<input
					type="text"
					id="length-input"
					placeholder="Enter the number"
					inputMode="decimal"
					onChange={(event) => {
						const newValueIsValid =
							!event.target.validity.patternMismatch;
						if (props.valueError) {
							if (newValueIsValid) {
								props.setValueError(false);
							}
						}
						props.setValue(event.target.value);
					}}
					pattern="^-?[0-9]*(?:[.,][0-9]+)?$"
					title="Input cannot be a word/letter"
					value={props.value}
					style={style(props.valueError)}
				/>
				{props.valueError === true && (
					<p className="errorMsg">
						Please type a correct{" "}
						<b>
							<em>number</em>
						</b>
					</p>
				)}

				<label htmlFor="from-unit">Unit to Convert from</label>
				<select
					id="from-unit"
					value={props.fromUnit}
					onChange={(event) => {
						if (event.target.value != "") {
							props.setFromUnitError(false);
						}
						props.setFromUnit(event.target.value);
					}}
					style={style(props.fromUnitError)}
				>
					{unitTypeMap.get(props.unitType)}
				</select>
				{props.fromUnitError === true && (
					<p className="errorMsg">
						Please select a correct{" "}
						<b>
							<em>unit</em>
						</b>
					</p>
				)}

				<label htmlFor="to-unit">Unit to Convert to</label>
				<select
					id="to-unit"
					value={props.toUnit}
					onChange={(event) => {
						if (event.target.value != "") {
							props.setToUnitError(false);
						}
						props.setToUnit(event.target.value);
					}}
					style={style(props.toUnitError)}
				>
					{unitTypeMap.get(props.unitType)}
				</select>
				{props.toUnitError === true && (
					<p className="errorMsg">
						Please select a correct{" "}
						<b>
							<em>unit</em>
						</b>
					</p>
				)}

				<input
					className="convertBtnInput"
					type="submit"
					value="Convert"
					name="submit"
				/>

				<section className="functionButtons">
					<button
						type="button"
						className="functionButton"
						onClick={resetForm}
					>
						Reset
					</button>
					<button
						type="button"
						className="functionButton"
						onClick={swapUnits}
					>
						Swap units
					</button>
				</section>
			</form>
		</div>
	);
}

export default ConverterForm;
