import React from "react";
import { useParams, Link } from "react-router-dom";
import TrainersMock from "./TrainersMock";

function TrainerDetails() {
  const { id } = useParams();
  const trainer = TrainersMock.find((t) => t.TrainerId === id);

  if (!trainer) {
    return (
      <div style={{ padding: "20px" }}>
        <h2>Trainer not found</h2>
        <Link to="/trainers">Back to Trainers List</Link>
      </div>
    );
  }

  return (
    <div style={{ padding: "20px" }}>
      <h2>Trainer Details</h2>
      <table cellPadding="8">
        <tbody>
          <tr>
            <td>
              <b>Trainer ID</b>
            </td>
            <td>{trainer.TrainerId}</td>
          </tr>
          <tr>
            <td>
              <b>Name</b>
            </td>
            <td>{trainer.Name}</td>
          </tr>
          <tr>
            <td>
              <b>Email</b>
            </td>
            <td>{trainer.Email}</td>
          </tr>
          <tr>
            <td>
              <b>Phone</b>
            </td>
            <td>{trainer.Phone}</td>
          </tr>
          <tr>
            <td>
              <b>Technology</b>
            </td>
            <td>{trainer.Technology}</td>
          </tr>
          <tr>
            <td>
              <b>Skills</b>
            </td>
            <td>{trainer.Skills}</td>
          </tr>
        </tbody>
      </table>
      <br />
      <Link to="/trainers">Back to Trainers List</Link>
    </div>
  );
}

export default TrainerDetails;
