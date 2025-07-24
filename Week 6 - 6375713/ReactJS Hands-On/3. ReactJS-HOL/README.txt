ReactJS Hands-On Lab – Function Component with Styling – 3. ReactJS-HOL

📁 Folder Structure

3.ReactJS-HOL/
│
├── 📂 codes/                      # Contains source code snippets used in the lab
│   ├── CalculateScore.js          # Functional component code
│   ├── mystyle.css                # CSS stylesheet used for styling
│   └── App.js                     # Main file to render CalculateScore
│
├── 📂 output/                     # Screenshots captured during execution
│   ├── app-creation-success.png          # Screenshot of app creation in CMD
│   ├── webpack-complied-success.png         # Screenshot of Webpack build success in VS Code
│   └── browser-output.png          # Screenshot of the output in browser
│
├── 📂 scorecalculatorapp/         # Full working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── Components/
│   │   │   └── CalculateScore.js
│   │   ├── Stylesheets/
│   │   │   └── mystyle.css
│   │   └── App.js
│   └── package.json
│
├── 📄 3. ReactJS-HOL.docx          # Word file answering theoretical objectives
└── 📄 README.md                    # This file

📌 Objective
This lab focuses on functional components and how to apply CSS styling to them in a ReactJS application.

✅ What You'll Learn
- Create and use functional components in React

- Accept and handle props (Name, School, Total, Goal)

- Calculate and display average score

- Apply external stylesheets to React components

📝 All theoretical answers are included in the file: 3. ReactJS-HOL.docx

⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

🚀 Steps Followed
- Create the React App
npx create-react-app scorecalculatorapp

- Navigate into Project
cd scorecalculatorapp

- Create Component Folder
Under src/, create a folder named Components/

- Add CalculateScore.js with the following content:
import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const avg = props.total / props.goal;

  return (
    <div className="score-card">
      <h2>{props.name} - {props.school}</h2>
      <p>Total Score: {props.total}</p>
      <p>Goal: {props.goal}</p>
      <p className="highlight">Average Score: {avg}</p>
    </div>
  );
}

export default CalculateScore;

- Create Styles Folder
Under src/, create a folder named Stylesheets/

- Add mystyle.css with sample styling like:
.score-card {
  background-color: #f2f2f2;
  padding: 20px;
  border-radius: 10px;
  font-family: Arial, sans-serif;
}

.highlight {
  color: green;
  font-weight: bold;
}

- Update App.js
import React from "react";
import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div className="App">
      <CalculateScore name="John" school="Greenwood High" total={450} goal={5} />
    </div>
  );
}

export default App;

- Run the App
npm start

- Open in Browser
Go to: http://localhost:3000

📷 Output Screenshots
- Found in /output/ folder:

    - app-creation-success.png – App created via terminal

    - webpack-complied-success.png – Webpack build completed in VS Code

    - browser-output.png – Component rendered with applied styles

✅ Completion Status
- Functional component successfully created and rendered

- Props used to calculate and display average

- External CSS styles applied effectively

- All steps completed as per instructions

- Answers to objectives provided in 3. ReactJS-HOL.docx