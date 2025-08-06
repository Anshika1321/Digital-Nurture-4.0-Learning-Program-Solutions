# 🚀 ReactJS Hands-On Lab – 15. Complaint Registration App

## 📁 Folder Structure

```
15.ReactJS-HOL/
│
├── 📂 codes/                         
│   ├── App.js                      # Main entry point rendering ComplaintRegister component
│   └── ComplaintRegister.js        # Form component with textbox, textarea, and submit button
│
├── 📂 output/                      
│   ├── App Creation Success.png     # App created successfully
│   ├── Form Rendered.png            # Initial form render in browser
│   ├── Complaint Submitted.png      # Alert after complaint submission
│   └── Webpack Compiled Success.png # Webpack compiled the app successfully
│
├── 📂 ticketraisingapp/            
│   ├── node_modules/                # Installed node packages
│   ├── public/                      # Static files
│   ├── src/                         
│   │   ├── App.js                   # Root React component
│   │   └── components/
│   │       └── ComplaintRegister.js # Form component
│   └── package.json                 # Project configuration and dependencies
│
├── 📄 15. ReactJS-HOL.docx           # Step-by-step lab guide
└── 📄 README.md                      # Overview and execution steps
```

---

## 🎯 Objective

This hands-on lab demonstrates how to build and manage **forms in ReactJS** using **controlled components** and React hooks.

---

## ✅ Learning Outcomes

* Understand React forms
* Define and implement controlled components
* Use input controls like textbox, textarea, and buttons
* Manage form state with `useState`
* Handle form submission events
* Generate dynamic complaint **Reference IDs**
* Display confirmation using alert box

> 🔎 *Refer to `15. ReactJS-HOL.docx` for detailed explanation and troubleshooting.*

---

## ⚙️ Prerequisites

* Node.js
* NPM
* Visual Studio Code

---

## 🛠️ Step-by-Step Implementation

### 1️⃣ Create React App

```bash
npx create-react-app ticketraisingapp
cd ticketraisingapp
code .
```

---

### 2️⃣ Create `ComplaintRegister` Component

📄 **Path**: `src/components/ComplaintRegister.js`

```jsx
import React, { Component } from "react";

class ComplaintRegister extends Component {
  constructor() {
    super();
    this.state = {
      ename: "",
      complaint: "",
      NumberHolder: Math.floor(Math.random() * 100), // Random ID
    };
  }

  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  };

  handleSubmit = (event) => {
    const msg = `Thanks ${this.state.ename}
Your Complaint was Submitted.
Transaction ID is: ${this.state.NumberHolder}`;
    alert(msg);
    event.preventDefault();
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h2 style={{ color: "red" }}>Register your complaints here!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name:</label>{" "}
            <input
              type="text"
              name="ename"
              value={this.state.ename}
              onChange={this.handleChange}
              required
            />
          </div>
          <br />
          <div>
            <label>Complaint:</label>{" "}
            <textarea
              name="complaint"
              value={this.state.complaint}
              onChange={this.handleChange}
              required
            />
          </div>
          <br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;
```

---

### 3️⃣ Update `App.js` to Use the Component

📄 **Path**: `src/App.js`

```jsx
import React from "react";
import ComplaintRegister from "./ComplaintRegister";

function App() {
  return (
    <div>
      <ComplaintRegister />
    </div>
  );
}

export default App;
```

---

### 4️⃣ Run the App

```bash
npm start
```

Open in browser: [http://localhost:3000](http://localhost:3000)

---

## 📸 Output Screenshots

Located in `/output/` folder:

* ✅ **App Creation Success.png** – React app scaffolded
* ✅ **Form Rendered.png** – Form displayed correctly in browser
* ✅ **Complaint Submitted.png** – Alert shown with Reference ID
* ✅ **Webpack Compiled Success.png** – App compiled successfully

---

## 🏁 Completion Checklist

* [x] React app named `ticketraisingapp` created
* [x] `ComplaintRegister` component implemented with form
* [x] Controlled components for inputs
* [x] Form state managed using `useState`
* [x] Submission handled via `onSubmit`
* [x] Random reference ID generated and displayed
* [x] Final confirmation alert shown
* [x] All output screenshots captured and saved

---
