# ReactJS Hands-On Lab – 10. ReactJS-HOL

## 📁 Folder Structure

<pre>10.ReactJS-HOL/
│
├── 📂 codes/                         # Contains source code snippets for JSX elements
│   ├── app.js                       # Main file using JSX to render office space info
│   ├── office.png                   
│
├── 📂 output/                       # Screenshots captured during execution
│   ├── app-creation-success.png     # CLI screenshot of successful app creation
│   ├── browser-output.png        # Output showing JSX rendering on browser
│   ├── webpack-compiled-success.png       # Screenshot of successful JSX to DOM rendering
│
├── 📂 officespacerentalapp/         # Full React project created during the lab
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── app.js                   # Root component rendering all JSX elements
│   │   ├── office.png   
│   └── package.json
│
├── 📄 10. ReactJS-HOL.docx          # Word file explaining JSX, ECMA Script, and DOM rendering
└── 📄 README.md                     # This file</pre>

---

## 📌 Objective

This lab focuses on using JSX syntax in React applications to create elements, apply attributes, render objects/lists, and apply inline CSS dynamically.

---

## ✅ What You'll Learn

* JSX Syntax and Rendering
* `React.createElement()` vs JSX
* Rendering JSX to the DOM
* Using JavaScript expressions in JSX
* Using inline CSS conditionally
* Looping through a list of objects and rendering dynamically

> 📝 Refer to **10. ReactJS-HOL.docx** for theoretical concepts and written answers.

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### 1. Install Node.js and npm

👉 Download from: [https://nodejs.org/en/download](https://nodejs.org/en/download)

### 2. Create React App

```bash
npx create-react-app officespacerentalapp
```

### 3. Navigate to Project

```bash
cd officespacerentalapp
```

### 4. Open in VS Code

```bash
code .
```

### 5. Add Office Image

* **Office.png**: Renders image using JSX attributes.

### 6. Modify `App.js` to Use All Components

Use JSX to call and render all created components in a single view.

### 7. Run the App

```bash
npm start
```

### 8. View in Browser

Open: [http://localhost:3000](http://localhost:3000)

---

## 📷 Output Screenshots

Available in the `/output/` folder:

* `app-creation-success.png` – App successfully created
* `browser-output.png` – JSX rendering in browser
* `webpack-compiled-success.png` – Successful DOM rendering from JSX

---

## ✅ Completion Status

* React app "officespacerentalapp" created successfully
* JSX-based rendering completed
* DOM rendered successfully with JSX
* Dynamic styling and looping implemented
* All objectives addressed and documented in `10. ReactJS-HOL.docx`

---

