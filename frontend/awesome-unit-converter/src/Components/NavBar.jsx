function NavBar(props) {
	const unitType = props.unitType;
	return (
		<section className="selectionContainer">
			<a
				href="/length"
				className={
					unitType === "length" ? "navBarLinkActive" : "navBarLink"
				}
			>
				Length
			</a>
			<a
				href="/weight"
				className={
					unitType === "weight" ? "navBarLinkActive" : "navBarLink"
				}
			>
				Weight
			</a>
			<a
				href="/temperature"
				className={
					unitType === "temperature"
						? "navBarLinkActive"
						: "navBarLink"
				}
			>
				Temperature
			</a>
		</section>
	);
}

export default NavBar;
