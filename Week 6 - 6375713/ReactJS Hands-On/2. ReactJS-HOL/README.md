ReactJS Hands-On Lab – 2. ReactJS-HOL

📁 Folder Structure

2.ReactJS-HOL/
│
├── 📂 codes/             # Contains individual component source files
│   ├── Home.js           # Home component code
│   ├── About.js          # About component code
│   ├── Contact.js        # Contact component code
│   └── App.js            # Calls all Components
│
├── 📂 output/            # Screenshots showing component outputs
│   ├── app-creation-success.png          # Screenshot of app creation in CMD
│   ├── webpack-complied-success.png         # Screenshot of Webpack build success in VS Code
│   └── browser-output.png          # Screenshot of the output in browser
│
├── 📂 StudentApp/        # Fully working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── Components/
│   │   │   ├── Home.js
│   │   │   ├── About.js
│   │   │   └── Contact.js
│   │   └── App.js        # Calls all components
│   └── package.json
│
├── 📄 2. ReactJS-HOL.docx # Word file containing answers to objective questions
└── 📄 README.md           # This file

📌 Objective
- This lab focuses on understanding and implementing React components, including:

- Class and function components

- Component constructors

- render() method

- Creating and rendering multiple components

✅ What You'll Learn
- What are React components and their types

- Differences between components and regular JS functions

- How to structure and render components in a React app

📝 The Word document 2. ReactJS-HOL.docx contains detailed answers to all theoretical objectives.

⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

🚀 Steps Followed
- Create React App
npx create-react-app StudentApp

- Navigate into Project
cd StudentApp

- Create Components Folder
Under src/, create a folder called Components/

- Create Component Files
    - Home.js
import React from "react";

function Home() {
  return <h2>Welcome to the Home page of Student Management Portal</h2>;
}

export default Home;

    - About.js
import React from "react";

function About() {
  return <h2>Welcome to the About page of the Student Management Portal</h2>;
}

export default About;

    - Contact.js
import React from "react";

function Contact() {
  return <h2>Welcome to the Contact page of the Student Management Portal</h2>;
}

export default Contact;

- Edit App.js
import React from "react";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contact";

function App() {
  return (
    <div className="App">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;

- Run the Application
npm start

- View in Browser
Go to: http://localhost:3000

📷 Output Screenshots
- Found in /output/ folder:

    - app-creation-success.png – React app created successfully

    - browser-output.png – Home, About, and Contact messages displayed in browser

    - webpack-compiled-output - Webpack build completed in VS Code

✅ Completion Status
- React app created and components implemented

- Components successfully rendered in browser

- Word file contains all theory responses

- Output screenshots and codes included for reference

