import React from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import TrainersList from "./Trainerlist";
import TrainerDetails from "./TrainerDetails";
import "./App.css";

function App() {
  return (
    <BrowserRouter>
      <nav className="nav-bar">
        <Link to="/">Home</Link>
        <Link to="/trainers">Trainers</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainersList />} />
        <Route path="/trainer/:id" element={<TrainerDetails />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
