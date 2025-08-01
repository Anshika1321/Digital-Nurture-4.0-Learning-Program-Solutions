# ReactJS Hands-On Lab – 11. ReactJS-HOL

## 📁 Folder Structure

```

<pre>11.ReactJS-HOL/
├── 📂 codes/                        # Raw/separate component snippets (with JSX tags)
│   ├── App.js                         # Root component rendering all other components
│   ├── ClickMe.js                     # Handles onClick event to display a message
│   ├── Counter.js                     # Handles increment/decrement with method binding
│   ├── Welcome.js                     # Button passing a string argument to a handler
│   └── CurrencyConvertor.js           # Converts INR to Euro using a button click
│
├── 📂 output/                       # Screenshots showing app outputs
│   ├── app-creation-success.png
│   ├── webpack-compiled-success.png
│   ├── counter-output.png
│   ├── clickme-button-output.png
│   ├── increment-button-output.png
│   ├── welcome-button-output.png
│   └── currency-convertor-output.png
│
├── 📂 eventexamplesapp/             # Main React app folder
│   ├── package.json                 # Project metadata and dependencies
│   ├── public/                      # Static files (HTML, icons, etc.)
│   └── src/
│       ├── App.js                   # Root React component
│       └── components/
│           ├── ClickMe.js               # onClick event example
│           ├── Counter.js               # Counter with multiple method binding
│           ├── Welcome.js               # Button with function argument
│           └── CurrencyConvertor.js     # Input and conversion logic
│
├── 📄 11. ReactJS-HOL.docx           # Lab guide with objectives and steps
└── 📄 README.md                      # This file</pre>

````

---

## 📌 Objective

This lab focuses on **React event handling**, including using synthetic events, passing arguments to handlers, handling input, and applying the `this` keyword with method binding.

---

## ✅ What You'll Learn

- How React handles events
- What is a synthetic event in React
- How to define and use event handlers
- Naming conventions in React events
- Using the `this` keyword and function binding
- Passing arguments to event handlers

>*📝 Refer to `11. ReactJS-HOL.docx` for theoretical background and steps.*

---

## ⚙️ Prerequisites

- Node.js
- npm
- Visual Studio Code

---

## 🚀 Steps Followed

### 1. Install Node.js and npm  
👉 Download from: https://nodejs.org/en/download  

### 2. Create the React App  
```bash
npx create-react-app eventexamplesapp
````

### 3. Navigate to the Project Folder

```bash
cd eventexamplesapp
```

### 4. Open in VS Code

```bash
code .
```

---

### 5. Create Components in `src/components/`

* **Counter.js**

  * Two buttons: *Increment* and *Decrement*
  * `Increment` button invokes:

    * Function to increase count
    * Function to say hello (demonstrates multiple handlers + method binding)

* **Welcome.js**

  * A button labeled "Say Welcome"
  * Calls a function with `"welcome"` passed as an argument

* **ClickMe.js**

  * Button with `onClick` that shows `"I was clicked"` (synthetic event)

* **CurrencyConvertor.js**

  * Input for INR and a Convert button
  * Converts value to Euro using a click event

---

### 6. Combine Components in `App.js`

Import and render all created components on a single page.

---

### 7. Run the App

```bash
npm start
```

### 8. View in Browser

Go to: [http://localhost:3000](http://localhost:3000)

---

## 📷 Output Screenshots

Located in `/output/` folder:

* `app-creation-success.png` – App scaffold created
* `webpack-compiled-success.png` – Successful Webpack compilation
* `counter-output.png` – Working increment/decrement buttons
* `increment-button-output.png` – Increment triggering multiple functions
* `clickme-button-output.png` – Output from synthetic `onClick` event
* `welcome-button-output.png` – Button with argument-passing function
* `currency-convertor-output.png` – INR to Euro conversion result

---

## ✅ Completion Status

* ✅ React app `eventexamplesapp` created and configured
* ✅ All components built and tested
* ✅ Event handling through multiple patterns demonstrated
* ✅ `this` keyword and method binding used appropriately
* ✅ Input + synthetic events handled
* ✅ Screenshots included for verification
* ✅ Theory completed in `11. ReactJS-HOL.docx`

---
