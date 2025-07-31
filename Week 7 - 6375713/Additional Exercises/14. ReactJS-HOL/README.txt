Here is the **README.md** file for **14. ReactJS-HOL**, generated based on the content from `14. ReactJS-HOL.docx`, and following your provided reference format:

---

# ReactJS Hands-On Lab – 14. ReactJS-HOL

## 📁 Folder Structure

<pre>14.ReactJS-HOL/
│
├── 📂 codes/                         # Key component source files before/after refactoring
│   ├── App.js                       
│   ├── EmployeesList.js             
│   ├── EmployeeCard.js              
│   └── ThemeContext.js              # New context definition file
│
├── 📂 output/                        # Screenshots captured during execution
│   ├── app-creation-success.png     
│   ├── npm-install-output.png       
│   ├── before-context-output.png    
│   ├── after-context-output.png     
│   └── theme-switch-preview.png     
│
├── 📂 employeeapp/                   # Complete working app using React Context API
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js                   
│   │   ├── components/
│   │   │   ├── EmployeesList.js     
│   │   │   ├── EmployeeCard.js      
│   │   │   └── ThemeContext.js      
│   └── package.json
│
├── 📄 14. ReactJS-HOL.docx           # Word file with use case and step-by-step tasks
└── 📄 README.md                      # This file</pre>

---

## 📌 Objective

This lab introduces the **React Context API** as a scalable solution to avoid "prop drilling" when sharing data (like themes) across deeply nested components.

---

## ✅ What You'll Learn

* Why and when to use **React Context API**
* How to use `createContext()` and `useContext()`
* Replacing prop-based state sharing with a cleaner context provider-consumer model
* Applying **theme switching** logic using context
* Working with `ThemeContext`, `Provider`, and `Consumer` patterns

> *📝 All exercises and details are explained in `14. ReactJS-HOL.docx`.*

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### - Download & Setup the Application

1. Unzip the provided project (Employee Management App).
2. Open the folder in VS Code.
3. Run the following command to restore dependencies:

<pre>npm install</pre>

### - Start the Application

<pre>npm start</pre>

Observe how the theme is passed via props before implementing context.

---

### - Refactor with Context API

1. **Create `ThemeContext.js`**

   * Use `createContext('light')`
   * Export the context as default

2. **Modify `App.js`**

   * Import `ThemeContext`
   * Wrap the entire JSX in `ThemeContext.Provider`
   * Pass theme state as `value`
   * Remove `theme` prop from `<EmployeesList />`

3. **Update `EmployeesList.js`**

   * Remove `theme` prop from child component call

4. **Update `EmployeeCard.js`**

   * Import `useContext` and `ThemeContext`
   * Retrieve theme value:

   ```js
   const theme = useContext(ThemeContext);
   ```

   * Apply it to the button's class name

---

## 📷 Output Screenshots

Available in the `/output/` folder:

* `app-creation-success.png` – Project setup confirmation
* `npm-install-output.png` – Node modules restored
* `before-context-output.png` – UI before refactor using props
* `after-context-output.png` – Final result after Context API usage
* `theme-switch-preview.png` – Themed buttons in light/dark mode

---

## ✅ Completion Status

* App successfully refactored to use React Context API
* All props removed in favor of context-based value sharing
* Theme class passed using `useContext()`
* Screenshots and code implementation verified
* Instructions and context explanation included in `14. ReactJS-HOL.docx`

---

Ready when you are for the next one!
