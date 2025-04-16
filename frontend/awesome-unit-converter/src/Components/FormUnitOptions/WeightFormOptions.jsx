function WeightFormOptions() {
	return (
		<>
			<option value="default">--Select--</option>
			<optgroup label="Metric Units">
				<option value="t">Tonne</option>
				<option value="kg">Kilogram</option>
				<option value="g">Gram</option>
				<option value="mg">Milligram</option>
			</optgroup>
			<optgroup label="Imperial Units">
				<option value="tl_uk">UK Long Ton</option>
				<option value="ts_us">US Short Ton</option>
				<option value="qtr">Quarter</option>
				<option value="st">Stone</option>
				<option value="lb">Pound</option>
				<option value="oz">Ounce</option>
				<option value="gr">Grain</option>
			</optgroup>
			<optgroup label="Troy Weight System">
				<option value="lb_t">Troy Pound</option>
				<option value="oz_t">Troy Ounce</option>
				<option value="pwt">Pennyweight</option>
			</optgroup>
		</>
	);
}

export default WeightFormOptions;
