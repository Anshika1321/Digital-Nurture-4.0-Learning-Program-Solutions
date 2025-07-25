# ReactJS Hands-On Lab – 6. ReactJS-HOL

## 📁 Folder Structure

<pre>6.ReactJS-HOL/
│
├── 📂 codes/                              # Contains source code components and mock data
│   ├── Trainer.js                         # Trainer class definition
│   ├── TrainersMock.js                    # Mock trainer data
│   ├── Home.js                            # Home component
│   ├── TrainerList.js                     # List view with navigation links
│   ├── TrainerDetails.js                  # Detailed trainer info using URL param
│   └── App.js                             # Main component with routing configuration
│
├── 📂 output/                             # Screenshots captured during execution
│   ├── home-output.png           # Screenshot of Home component
│   ├── trainers-list-output.png      # Screenshot of Trainers List
│   ├── trainer-details-output.png    # Screenshot of Trainer Details
│   ├── app-creation-success.png      # React app created successfully
│   └── webpack-compiled-output       # Webpack build completed in VS Code
│
├── 📂 TrainersApp/                        # Fully working React Router project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── Trainer.js
│   │   ├── TrainersMock.js
│   │   ├── Home.js
│   │   ├── TrainerList.js
│   │   ├── TrainerDetails.js
│   │   └── App.js
│   └── package.json
│
├── 📄 6. ReactJS-HOL.docx                  # Word file containing answers to objective questions  
└── 📄 README.md                            # This file</pre>

## 📌 Objective
This hands-on lab demonstrates how to create a Single Page Application (SPA) using React Router, enabling routing and parameter passing for components.

## ✅ What You'll Learn

- Importance and benefits of using React Router

- Router components: BrowserRouter, Route, Routes, Link

- URL parameter passing with useParams

- Building navigation with reusable and routed components

.*📝 A detailed Word document answering the objective questions is provided in the file: 6. ReactJS-HOL.docx.*

## ⚙️ Prerequisites

- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed

### - Create App
<pre>npx create-react-app trainersapp</pre>
<pre>cd trainersapp</pre>
<pre>code .</pre>

### - Install React Router
<pre>npm install react-router-dom</pre>

### - Define Trainer Class
****File: Trainer.js****
```jsx
class Trainer {
  constructor(trainerId, name, email, phone, technology, skills) {
    this.trainerId = trainerId;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.technology = technology;
    this.skills = skills;
  }
}

export default Trainer;
```
- Mock Data
  ****File: TrainersMock.js****
  Create an array of Trainer objects and export it for use in list/details components.
```jsx
const trainers = [
  {
    TrainerId: 1,
    Name: "John Doe",
    Email: "john@example.com",
    Phone: "1234567890",
    Technology: "React",
    Skills: "Hooks, Router"
  },
  {
    TrainerId: 2,
    Name: "Jane Smith",
    Email: "jane@example.com",
    Phone: "9876543210",
    Technology: "React",
    Skills: "Redux, Context"
  }
];

export default trainers;
```
- Create Components

    ****- Home.js:**** Displays a welcome/home message.
```jsx
import React from 'react';

function Home() {
  return (
    <div>
      <h2>Welcome to Trainers Application</h2>
    </div>
  );
}

export default Home;
```

    - TrainerList.js

       - Accepts data as props and displays trainer names as clickable Link elements.

      - Uses react-router-dom's Link to route to each trainer's detail view.


    - TrainerDetails.js

      - Uses useParams to extract trainer ID from URL.

      - Finds trainer in mock data and displays detailed info.

- Configure Routes
****File: App.js****
```jsx
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import TrainerList from "./TrainerList";
import TrainerDetails from "./TrainerDetails";

function App() {
  return (
    <BrowserRouter>
      <nav>
        <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainerList />} />
        <Route path="/trainers/:id" element={<TrainerDetails />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
```
### - Run the App
<pre>npm start</pre>

### - View Output
<pre>Open browser and go to: http://localhost:3000</pre>

## 📷 Output Screenshots

- Found in /output/ folder:

    - home-output.png – Home component view

    - trainers-list-output.png – Clickable list of trainer names

    - trainer-details-output.png – Detailed trainer info from URL param
    
    - app-creation-success.png – React app created successfully

    - webpack-compiled-output - Webpack build completed in VS Code


## ✅ Completion Status

- Routing system setup and navigation links configured

- Data passed via URL using useParams

- Trainer list and details rendered successfully

- All objectives met and documented in 6. ReactJS-HOL.docx

- Code, screenshots, and structure provided for validation

