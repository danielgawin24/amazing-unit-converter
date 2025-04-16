import { Routes, Route } from "react-router-dom";
import LengthConverter from "./Pages/LengthConverter";
import WeightConverter from "./Pages/WeightConverter";
import TempConverter from "./Pages/TempConverter";
import Home from "./Pages/Home";

function App() {
	return (
		<>
			<Routes>
				<Route path="/" element={<Home />} />
				<Route path="/length" element={<LengthConverter />} />
				<Route path="/weight" element={<WeightConverter />} />
				<Route path="/temperature" element={<TempConverter />} />
			</Routes>
		</>
	);
}

export default App;
