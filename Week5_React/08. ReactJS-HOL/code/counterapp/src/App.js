import React from 'react';
import './App.css';

export class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
      c: 0
    };

    this.updateEntry = this.updateEntry.bind(this);
    this.updateExit = this.updateExit.bind(this);
  }

  updateEntry() {
    this.setState((prevState) => {
      return { entrycount: prevState.entrycount + 1 }
    });
  }

  updateExit() {
    this.setState((prevState) => {
      return { exitcount: prevState.exitcount + 1 }
    });
  }

  render() {
    return (
      <div className="main-container">
        <div className="counter-wrapper">
          <button className="action-btn" onClick={this.updateEntry}>
            Login
          </button>
          <span> {this.state.entrycount} People Entered!!!</span>
        </div>

        <div className="counter-wrapper">
          <button className="action-btn" onClick={this.updateExit}>
            Exit
          </button>
          <span> {this.state.exitcount} People Left!!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;