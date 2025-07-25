# ReactJS Hands-On Lab – Function Component with Styling – 3. ReactJS-HOL

## 📁 Folder Structure

<pre>3.ReactJS-HOL/
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
└── 📄 README.md                    # This file</pre>

## 📌 Objective
This lab focuses on functional components and how to apply CSS styling to them in a ReactJS application.

## ✅ What You'll Learn
- Create and use functional components in React

- Accept and handle props (Name, School, Total, Goal)

- Calculate and display average score

- Apply external stylesheets to React components

>*📝 All theoretical answers are included in the file: 3. ReactJS-HOL.docx*

## ⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed
### - Create the React App
<pre>npx create-react-app scorecalculatorapp</pre>

### - Navigate into Project
<pre>cd scorecalculatorapp</pre>

### - Create Component Folder
Under src/, create a folder named Components/

- Add ****CalculateScore.js**** with the following content:

```jsx
import '../Stylesheets/mystyle.css'

const percentToDecimal = (decimal) => {
  return (decimal.toFixed(2) + '%')
}

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal)
}

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="formatstyle">
    <h1><font color="Brown">Student Details:</font></h1>

    <div className="Name">
      <b><span>Name: </span></b>
      <span>{Name}</span>
    </div>

    <div className="School">
      <b><span>School: </span></b>
      <span>{School}</span>
    </div>

    <div className="Total">
      <b><span>Total: </span></b>
      <span>{total}</span>
      <span>Marks</span>
    </div>

    <div className="Score">
      <b>Score:</b>
      <span>
        {calcScore(
          total,
          goal
        )}
      </span>
    </div>
  </div>
)
```

### - Create Styles Folder
Under src/, create a folder named Stylesheets/

- Add ****mystyle.css**** with sample styling like:

```css
..Name {
  font-weight: 300;
  color: blue;
}

.School {
  color: crimson;
}

.Total {
  color: darkmagenta;
}

.formatstyle {
  text-align: center;
  font-size: large;
}

.Score {
  color: forestgreen;
}
```

### - Update App.js

```jsx
import { CalculateScore } from '../src/Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"Steeve"} 
        School={"DNV Public School"} 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;
```

### - Run the App
<pre>npm start</pre>

### - Open in Browser
<pre>Go to: http://localhost:3000</pre>

## 📷 Output Screenshots
- Found in /output/ folder:

    - app-creation-success.png – App created via terminal

    - webpack-complied-success.png – Webpack build completed in VS Code

    - browser-output.png – Component rendered with applied styles

## ✅ Completion Status
- Functional component successfully created and rendered

- Props used to calculate and display average

- External CSS styles applied effectively

- All steps completed as per instructions

- Answers to objectives provided in 3. ReactJS-HOL.docx
