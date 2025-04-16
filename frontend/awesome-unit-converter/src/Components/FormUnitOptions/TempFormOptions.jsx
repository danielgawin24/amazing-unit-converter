function TempFormOptions() {
	return (
		<>
			<option value="default">--Select--</option>
			<optgroup label="Temperatures">
				<option value="°C">Celsius - °C</option>
				<option value="°F">Fahrenheit - °F</option>
				<option value="K">Kelvin - K</option>
				<option value="°R">Rankine - °R</option>
			</optgroup>
		</>
	);
}

export default TempFormOptions;
