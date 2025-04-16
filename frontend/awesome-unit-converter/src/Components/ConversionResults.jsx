function ConversionResults(props) {
	const value = props.value;
	const fromUnit = props.fromUnit;
	const result = props.conversionResult;
	const toUnit = props.toUnit;

	return (
		<div className="converterContainer">
			<p>Result of your calculation</p>
			<h2>
				{value} {fromUnit} = {result} {toUnit}
			</h2>
			<button onClick={() => props.setIsConverting(false)}>Reset</button>
		</div>
	);
}

export default ConversionResults;
