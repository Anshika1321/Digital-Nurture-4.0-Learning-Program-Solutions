Here is the **README.md** file for **15. ReactJS-HOL**, created based on your Word document `15. ReactJS-HOL.docx` and using your previous format:

---

# ReactJS Hands-On Lab – 15. ReactJS-HOL

## 📁 Folder Structure

<pre>15.ReactJS-HOL/
│
├── 📂 codes/                         # Component source code
│   ├── App.js                       
│   └── ComplaintRegister.js         # Form component for raising complaints
│
├── 📂 output/                        # Screenshots of application execution
│   ├── app-creation-success.png     
│   ├── form-rendered.png            
│   ├── complaint-submitted.png      
│   └── reference-generated.png      
│
├── 📂 ticketraisingapp/             # Complete working React application
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js                   
│   │   └── components/
│   │       └── ComplaintRegister.js
│   └── package.json
│
├── 📄 15. ReactJS-HOL.docx           # Word document with lab instructions
└── 📄 README.md                      # This file</pre>

---

## 📌 Objective

This hands-on lab focuses on implementing and managing **forms in ReactJS**, using controlled components to handle input and submission.

---

## ✅ What You'll Learn

* What are **controlled components** in React
* How to use **form elements** like `input`, `textarea`, and `button`
* Managing form state and updates via React hooks
* Submitting forms and handling `onSubmit` events
* Generating dynamic **Reference IDs** for submitted complaints

> *📝 Full explanation and steps are provided in `15. ReactJS-HOL.docx`.*

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### - Create the React App

<pre>npx create-react-app ticketraisingapp</pre>

### - Navigate to the App Folder

<pre>cd ticketraisingapp</pre>

### - Open the Project in VS Code

<pre>code .</pre>

---

### - Create and Implement `ComplaintRegister` Component

📁 Inside `src/components/ComplaintRegister.js`, create a form with:

* `input` field for **Employee Name**
* `textarea` for **Complaint Message**
* `Submit` button using `onClick` or `onSubmit`

### - Example: Basic Form with Controlled Components

```jsx
const ComplaintRegister = () => {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const refNo = Math.floor(Math.random() * 100000);
    alert(`Complaint submitted by ${name}. Reference No: ${refNo}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>Employee Name:</label><br/>
      <input type="text" value={name} onChange={(e) => setName(e.target.value)} /><br/>
      <label>Complaint:</label><br/>
      <textarea value={complaint} onChange={(e) => setComplaint(e.target.value)} /><br/>
      <button type="submit">Submit</button>
    </form>
  );
};
```

---

### - Update `App.js` to Render `ComplaintRegister`

```jsx
import ComplaintRegister from './components/ComplaintRegister';

function App() {
  return (
    <div>
      <h2>Raise Your Complaint</h2>
      <ComplaintRegister />
    </div>
  );
}

export default App;
```

---

### - Run the App

<pre>npm start</pre>

### - Access in Browser

<pre>http://localhost:3000</pre>

---

## 📷 Output Screenshots

Found in `/output/`:

* `app-creation-success.png` – App initialized successfully
* `form-rendered.png` – Complaint form rendered in browser
* `complaint-submitted.png` – Form submitted with data
* `reference-generated.png` – Reference number shown via alert

---

## ✅ Completion Status

* Form successfully implemented with controlled components
* Input handling and submission functional
* Complaint submitted with alert reference ID
* Screenshots provided for validation
* Full details covered in `15. ReactJS-HOL.docx`

---

Let me know when you're ready to proceed with the next one!
