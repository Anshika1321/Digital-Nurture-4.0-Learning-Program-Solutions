## ReactJS Hands-On Lab – 1. ReactJS-HOL

# 📁 Folder Structure

<pre>1.ReactJS-HOL/
│
├── 📂 codes/             # Contains source code snippets used in each exercise
│   └── App.js            # Modified App.js to display heading as instructed
│
├── 📂 output/            # Screenshots captured during execution
│   ├── app-creation-success.png          # Screenshot of app creation in CMD
│   ├── webpack-complied-success.png         # Screenshot of Webpack build success in VS Code
│   └── browser-output.png          # Screenshot of the output in browser
│
├── 📂 myfirstreact/      # Fully working React project created during lab
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   └── App.js        # Updated App.js with welcome message
│   └── package.json
│
├── 📄 1. ReactJS-HOL.docx # Word file containing answers to objective questions
└── 📄 README.md            # This file</pre>

# 📌 Objective
This hands-on lab teaches the basics of setting up and running a ReactJS Single-Page Application (SPA).

# ✅ What You'll Learn
- What is SPA and MPA

- Benefits and differences between SPA and MPA

- What is React and its features

- What is Virtual DOM

- Setting up a basic React project using create-react-app

📝 A detailed Word document answering the objective questions is provided in the file: 1. ReactJS-HOL.docx.

# ⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

# 🚀 Steps Followed
- Install Node.js and np
  
Visit: https://nodejs.org/en/download/

- Install create-react-app globally
  
npm install -g create-react-app

- Create the App

npx create-react-app myfirstreact

- Navigate into the App Folder

cd myfirstreact

- Open in Visual Studio Code
code .

- Modify App.js
Open src/App.js

Replace existing content with:

function App() {
  return (
    <div className="App">
      <h1>Welcome to the first session of React</h1>
    </div>
  );
}

export default App;

- Run the App

npm start

- View Output

Open browser and go to: http://localhost:3000

# 📷 Output Screenshots
- Found in /output/ folder:

    - app-creation-success.png – CLI showing successful app creation

    - webpack-complied-success.png – Webpack build completed in VS Code

    - browser-output.png – Final rendered result in the browser

# ✅ Completion Status
- Project successfully created

- Welcome message displayed as expected

- All objective questions answered in 1. ReactJS-HOL.docx

- All steps and screenshots provided for reference

