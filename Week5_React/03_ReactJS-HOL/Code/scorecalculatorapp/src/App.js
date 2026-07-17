import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Aditya"}
        School={"LNCT"}
        total={476}
        goal={5}
      />
    </div>
  );
}

export default App;
