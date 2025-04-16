function LengthFormOptions() {
	return (
		<>
			<option value="default">--Select--</option>
			<optgroup label="Metric Units">
				<option value="mm">Millimeter</option>
				<option value="cm">Centimeter</option>
				<option value="dm">Decimeter</option>
				<option value="m">Meter</option>
				<option value="km">Kilometer</option>
			</optgroup>
			<optgroup label="Imperial Units">
				<option value="in">Inch</option>
				<option value="ft">Foot</option>
				<option value="yd">Yard</option>
				<option value="mi">Mile</option>
			</optgroup>
			<optgroup label="Astronomical Units">
				<option value="nmi">Nautical Mile</option>
				<option value="ly">Light Year</option>
				<option value="au">Astronomical Unit</option>
			</optgroup>
		</>
	);
}

export default LengthFormOptions;
