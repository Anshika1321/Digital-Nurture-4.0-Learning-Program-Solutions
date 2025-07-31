# ReactJS Hands-On Lab – 11. ReactJS-HOL

## 📁 Folder Structure

```
11.ReactJS-HOL/
├──📂 codes/                       # Raw or separate code snippets (optional)
│   ├── App.js
│   ├── ClickMe.js
│   ├── Counter.js
│   ├── Welcome.js
│   └── CurrencyConvertor.js
│
├──📂 output/                      # Screenshots of working outputs
│   ├── app-creation-success.png
│   ├── webpack-compiled-success.png
│   ├── counter-output.png
│   ├── clickme-button-output.png
│   ├── increment-button-output.png
│   ├── welcome-button-output.png
│   └── currency-convertor-output.png
│
├──📂 eventexamplesapp/            # Main React project folder
│   ├── package.json             # Project metadata and dependencies
│   ├── public/                  # Static files (HTML, icons, etc.)
│   └── src/
│       ├── App.js               # Root React component
│       └── components/          # All custom React components
│           ├── ClickMe.js           # Synthetic event (onClick) example
│           ├── Counter.js           # Increment/Decrement counter
│           ├── Welcome.js           # Function with argument example
│           └── CurrencyConvertor.js # Currency conversion component
│
├──📄 README.md                     # Summary and setup instructions
├──📄 11. ReactJS-HOL.docx         # Lab guide with objectives and steps

```

---

## 📌 Objective

This lab focuses on React event handling concepts such as using event listeners, synthetic events, passing arguments in event handlers, and method binding using the `this` keyword.

---

## ✅ What You'll Learn

* What are React events and event handlers
* React's SyntheticEvent system
* Naming conventions for React events
* Handling user interactions via `onClick`, `onChange`, etc.
* Using `this` and method binding in event handlers

> 📝 Refer to **11. ReactJS-HOL.docx** for theoretical concepts and explanations.

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### 1. Install Node.js and npm

Download from: [https://nodejs.org/en/download](https://nodejs.org/en/download)

### 2. Create React App

```bash
npx create-react-app eventexamplesapp
```

### 3. Navigate to Project

```bash
cd eventexamplesapp
```

### 4. Open in VS Code

```bash
code .
```

### 5. Create Components

* **Counter.js**

  * Two buttons: "Increment" and "Decrement"
  * `Increment` button triggers multiple functions: increment logic and a greeting message
  * Demonstrates use of `this` keyword and method binding

* **Welcome.js**

  * A button labeled "Say Welcome"
  * Calls a function with "welcome" passed as an argument

* **ClickMe.js**

  * Button triggers an `onClick` event to show "I was clicked"

* **CurrencyConvertor.js**

  * Input for INR and conversion button
  * Handles click event to convert INR to Euro

### 6. Combine Components in `App.js`

Render all components in a single page layout.

### 7. Run the App

```bash
npm start
```

### 8. View Output

Open browser at: [http://localhost:3000](http://localhost:3000)

---

## 📷 Output Screenshots

Located in the `/output/` folder:

* `app-creation-success.png` – App created successfully
* `counter-output.png` – Shows working increment/decrement
* `welcome-button-output.png` – Button with argument-based event handler
* `clickme-button-output.png` – "i was clicked" message display
* `increment-button-output.png`- increment button invoking multiple methods (e.g., increase value + log message)
* `currency-convertor-output.png` – Currency conversion result

---

## ✅ Completion Status

* React app **eventexamplesapp** successfully created
* All components created and event handlers implemented
* Functional event handling demonstrated using React’s SyntheticEvent
* `this` keyword usage and method binding explained
* Outputs validated with screenshots
* Objective responses covered in `11. ReactJS-HOL.docx`

---

