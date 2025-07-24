ReactJS Hands-On Lab – 8. ReactJS-HOL

📁 Folder Structure

8.ReactJS-HOL/
│
├── 📂 codes/                             # Source code for component logic
│   ├── CountPeople.js                    # Component with state management
│   └── index.js                            # Main app file to render CountPeople
│
├── 📂 output/                            # Screenshots captured during execution
│   ├── app-creation-success.png             # React app created successfully
│   ├── webpack-compiled-success.png             # App launch confirmation
│   └── counterapp-browser-output.png     # Final browser view with counters and buttons
│
├── 📂 counterapp/                        # Full working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── CountPeople.js
│   │   └── App.js
│   └── package.json
│
├── 📄 8. ReactJS-HOL.docx                # Word file containing objective answers  
└── 📄 README.md                          # This file

📌 Objective
This hands-on lab demonstrates the use of React State and event handlers to update and manage values in a functional interface.

✅ What You'll Learn

- How to declare and use state in a class-based component

- How to update state using methods and event handlers

- Implementing simple interactive UI with dynamic state rendering

📝 A detailed Word document answering the objective questions is provided in the file: 8. ReactJS-HOL.docx.

⚙️ Prerequisites

- Node.js and npm

- Visual Studio Code

🚀 Steps Followed

- Create React App
npx create-react-app counterapp
cd counterapp
code .

- Create CountPeople.js Component
import React from "react";

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState({ entryCount: this.state.entryCount + 1 });
  };

  updateExit = () => {
    this.setState({ exitCount: this.state.exitCount + 1 });
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>People Counter</h1>
        <p>People Entered: {this.state.entryCount}</p>
        <p>People Exited: {this.state.exitCount}</p>
        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit} style={{ marginLeft: "10px" }}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;

- Update index.js
import React from "react";
import CountPeople from "./CountPeople";

function App() {
  return (
    <div className="App">
      <CountPeople />
    </div>
  );
}

export default App;

- Run the App
npm start

- View Output
Open browser and go to: http://localhost:3000

📷 Output Screenshots

- Found in /output/ folder:
    - app-creationo-success.png - React app created successfully

    - webpack-compiled-output.png – Confirmation of successful launch

    - counterapp-browser-output.png – Display of entry and exit counts with buttons

✅ Completion Status

- React app created successfully

- State initialized and updated using setState()

- UI updates in real-time on button click

- Objective completed as per instructions in 8. ReactJS-HOL.docx

- Screenshots and source code provided for verification