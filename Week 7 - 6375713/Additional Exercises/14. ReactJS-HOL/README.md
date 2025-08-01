# ReactJS Hands-On Lab – 14. ReactJS-HOL

## 📁 Folder Structure

<pre>14.ReactJS-HOL/
│
├── 📂 codes/                         # Key component source files before/after refactoring
│   ├── App.js                         # The main application component, where ThemeContext.Provider will be used.
│   ├── EmployeesList.js               # A parent component that previously passed theme via props, now updated to consume context implicitly.
│   ├── EmployeeCard.js                # A child component that will use useContext() to retrieve the theme directly from context.
│   └── ThemeContext.js                # New context definition file, where ThemeContext is created and exported.
│
├── 📂 output/                         # Screenshots captured during execution
│   ├── Webpack Compiled Success.png      # Output screenshot indicating successful webpack compilation
│   ├── npm install output.png            # Output screenshot showing the result of npm install
│   ├── Before Context Output.png         # Output screenshot showing UI before Context API refactor
│   ├── After Context Output.Output.png   # Output screenshot showing UI after Context API refactor
│   ├── Theme Switch Output.png           # Output screenshot demonstrating theme switching
│   └── Employees List Output.png         # Output screenshot of the Employees List component
│
├── 📂 employeeapp/                    # Complete working app using React Context API
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
├── 📄 14. ReactJS-HOL.docx            # Word file with use case and step-by-step tasks
└── 📄 README.md                       # This file</pre>


---

### 📌 Objective

This lab introduces the **React Context API** as a scalable solution to avoid "prop drilling" when sharing data (like themes) across deeply nested components. 

---

### ✅ What You'll Learn

* Explain the need and benefits of React Context API. 
* Working with `createContext()`. 
* Create a context to be used by child components.
* Create a provider and consumer of the context.
* List the types of Router Components.
* Replacing prop-based state sharing with a cleaner context provider-consumer model.
* Applying **theme switching** logic using context. 
* Working with `ThemeContext`, `Provider`, and `Consumer` patterns.

> *📝 All exercises and details are explained in `14. ReactJS-HOL.docx`.*

---

### ⚙️ Prerequisites

The following is required to complete this hands-on lab:
* Node.js
* NPM 
* Visual Studio Code

---

### 🚀 Steps Followed

The estimated time to complete this lab: 30 minutes. 

#### - Download & Setup the Application

1.  Unzip the application and open it using VS Code.
2.  Go to the terminal and execute the `npm install` command to restore all the node modules. 

    ```bash
    npm install
    ``` 

#### - Start the Application

- Run the application once to see the output. Use `npm start` command.

```bash
npm start
```
- Create ThemeContext.js 
    - Define a new context in the file with the name as ThemeContext and assign it a default value of ‘light’ and export it as default form the module. 

- Modify App.js 
    - Import the ThemeContext in App component. 

    - Define the theme context provider to be the entire JSX of the App component. 

    - Assign the value for the theme provider from the state of the component. 

    - Modify the call to EmployeeList component so that theme name is no longer passed as props. 

- Update EmployeesList.js 
    - Go to EmployeeList component present in EmployeeList.js file and modify it so that theme name is not passed explicitly to its child component. 

- Update EmployeeCard.js 
    - Go to EmployeeCard component inside EmployeeCard.js file. 

    - Import the ThemeContext into the component file. 

    - Retrieve the value of the context with the help of useContext() and store it in a variable. 

    - Use the variable to pass the className for the buttons. 

📷 Output Screenshots
Available in the /output/ folder:

    - Webpack Compiled Success.png – Project setup confirmation

    - npm install output.png – Node modules restored

    - Before Context Output.png – UI before refactor using props

    - After Context Output.png – Final result after Context API usage

    - Theme Switch Output.png – Themed buttons in light/dark mode

    - Employees List Output.png – Specific view of the Employees List component

✅ Completion Status
- App successfully refactored to use React Context API.

- All props removed in favor of context-based value sharing.

- Theme class passed using useContext().

- Screenshots and code implementation verified.

- Instructions and context explanation included in 14. ReactJS-HOL.docx.
