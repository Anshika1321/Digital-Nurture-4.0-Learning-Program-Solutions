# ReactJS Hands-On Lab – 9. ReactJS-HOL

## 📁 Folder Structure
<pre>9.ReactJS-HOL/ 
│ ├── 📂 codes/ # Contains source code snippets of React components 
│ ├── App.js # Main component with conditional rendering using flag 
│ ├── EvenPlayers.js # Renders players in even team using ES6 destructuring 
│ ├── ListofIndianPlayers.js # Merges and displays T20 and Ranji players 
│ ├── ListofPlayers.js # Displays all players and their scores using map() 
│ ├── OddPlayers.js # Renders players in odd team using ES6 destructuring 
│ └── Scorebelow70.js # Filters players with score < 70 using arrow functions 
│
│ ├── 📂 output/ # Screenshots captured during execution 
│ ├── app-creation-success.png # CLI screenshot of successful app creation 
│ ├── flag-true-output.png # Output when flag is set to true 
│ ├── flag-false-output.png # Output when flag is set to false 
│ └── webpack-compiled-success.png # Webpack successfully compiled the app 
│
│ ├── 📂 cricketapp/ # Full React project created during the lab 
│ ├── node_modules/ 
│ ├── public/ 
│ ├── src/ 
│ │ ├── App.js # App root file with conditional rendering 
│ │ ├── ListofPlayers.js # Displays list of players and their scores 
│ │ └── IndianPlayers.js # Displays odd/even team using destructuring 
│ └── package.json 
│
│ ├── 📄 9. ReactJS-HOL.docx # Word file containing objective answers and instructions 
└── 📄 README.md # This file</pre>

## 📌 Objective

This lab focuses on hands-on application of ES6 features within a ReactJS app to manage and display cricket player data.

## ✅ What You'll Learn

* ES6 Features:

  * `let`, `const`
  * `class` and inheritance
  * Arrow functions
  * Destructuring
  * `map()` method
  * `set()` and `map()` objects

* React concepts:

  * Functional components
  * Conditional rendering
  * JSX rendering of arrays and objects

> *📝 For a detailed explanation, refer to: 9. ReactJS-HOL.docx*

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

## 🚀 Steps Followed

### - Install Node.js and npm

<pre>https://nodejs.org/en/download</pre>

### - Create React App

<pre>npx create-react-app cricketapp</pre>

### - Navigate to the project

<pre>cd cricketapp</pre>

### - Open in VS Code

<pre>code .</pre>

### - Create Components

#### `ListofPlayers.js`

* Declare an array with 11 player objects
* Use `map()` to list players and scores
* Filter scores below 70 using arrow functions

#### `IndianPlayers.js`

* Create two arrays: T20 players and Ranji Trophy players
* Merge using ES6 spread operator
* Use destructuring to display Odd and Even team members

### - Modify `App.js`

* Use a `flag` variable
* Conditionally render either `ListofPlayers` or `IndianPlayers` using simple if-else logic

### - Run the App

<pre>npm start</pre>

### - View Output

Open browser at: <pre>[http://localhost:3000](http://localhost:3000)</pre>

## 📷 Output Screenshots

* Found in `/output/` folder:

  * `flag-true-output.png` – Output with flag set to true
  * `flag-false-output.png` – Output with flag set to false
  * `app-view.png` – Final combined view

## ✅ Completion Status

* React app “cricketapp” created
* ES6 features successfully implemented
* Conditional component rendering demonstrated
* Output matches lab objectives
* All instructions and explanations included in `9. ReactJS-HOL.docx`

