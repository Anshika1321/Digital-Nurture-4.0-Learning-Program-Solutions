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
import { useState } from 'react';

const ComplaintRegister = () => {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const refNo = Math.floor(Math.random() * 100000);
    alert(`Thanks ${name}\nYour Complaint was Submitted.\nTransaction ID is: ${refNo}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>Name:</label><br />
      <input
        type="text"
        name="ename"
        value={name}
        onChange={(e) => setName(e.target.value)}
      /><br />
      <label>Complaint:</label><br />
      <textarea
        name="complaint"
        value={complaint}
        onChange={(e) => setComplaint(e.target.value)}
      /><br />
      <button type="submit">Submit</button>
    </form>
  );
};

export default ComplaintRegister;
```

---

### 3️⃣ Update `App.js` to Use the Component

📄 **Path**: `src/App.js`

```jsx
import ComplaintRegister from './components/ComplaintRegister';

function App() {
  return (
    <div>
      <h2>Register your complaints here!!!</h2>
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
