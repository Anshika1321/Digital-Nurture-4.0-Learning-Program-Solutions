# ReactJS Hands-On Lab – Styling Components – 5. ReactJS-HOL

## 📁 Folder Structure

<pre>5.ReactJS-HOL/
│
├── 📂 codes/                            # Code used for component styling
│   ├── Cohort.js                        # Defines cohort info (data or logic)
│   ├── CohortDetails.js                 # React component to display the cohort info
│   ├── CohortDetails.module.css         # CSS Module with class and tag selectors
│   └── App.js                           # Calls all Components
│
├── 📂 output/                           # Screenshots of final UI and steps
│   ├── webpack-complied-success.png         # Screenshot of Webpack build success in VS Code
│   └── browser-output.png          # Screenshot of the output in browser
│
├── 📂 cohorttracker-app/             # Complete working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── Cohort.js  
│   │   ├── CohortDetails.js
│   │   ├── CohortDetails.module.css
│   │   └── App.js
│   └── package.json
│
├── 📄 5. ReactJS-HOL.docx                # Word file answering objective questions
└── 📄 README.md                          # This file</pre>

## 📌 Objective
This lab helps understand how to apply styles in React using both CSS Modules and inline styles in components.

## ✅ What You'll Learn
- The need for styling in React apps

- Creating and using CSS Modules

- Styling using className and style props

- Conditional styling based on data

>*📝 All objective answers are available in 5. ReactJS-HOL.docx.*

## ⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed
### - Unzip and Set Up the React App

### - Unzip the given project folder.

### - Open terminal and run:
<pre>npm install</pre>

### - Create CSS Module
Inside src/, create a new file:
****CohortDetails.module.css****

Add the following styles:

```css
.box {
  width: 300px;
  display: inline-block;
  margin: 10px;
  padding: 10px 20px;
  border: 1px solid black;
  border-radius: 10px;
}

dt {
  font-weight: 500;
}
```

- Edit ****CohortDetails.js**** Component
 
```jsx
import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
  const headingColor =
    cohort.currentStatus.toLowerCase() === 'ongoing' ? 'green' : 'blue';

  return (
    <div className={styles.box}>
      <h3 style={{ color: headingColor }}>
        {cohort.cohortCode}
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>

        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>

        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>

        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
```

### - Render in App.js

```jsx
import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>
      {CohortsData.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
```

### - Run the App
<pre>npm start</pre>

### - View in Browser
<pre>Visit: http://localhost:3000</pre>

## 📷 Output Screenshots
- Found in /output/ folder:

    - browser-output.png – Final rendered result in the browser

    - webpack-compiled-output - Webpack build completed in VS Code

## ✅ Completion Status
- CSS Module created and used

- className and style props applied

- Conditional styling implemented based on status

- Visual output matches expected format

- All theoretical and practical tasks completed

- Answers and working code provided

