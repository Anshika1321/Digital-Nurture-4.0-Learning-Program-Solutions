# ReactJS Hands-On Lab – 12. ReactJS-HOL

## 📁 Folder Structure  
<pre>📁 Folder Structure  
12.ReactJS-HOL/  
│  
├── 📂 codes/                         # Contains component-wise source code for conditional rendering  
│   ├── App.js                       # Root component managing login state  
│   ├── Greeting.js                  # Wrapper to decide between guest/user greetings  
│   ├── GuestGreeting.js             # Greeting shown to guest users  
│   ├── UserGreeting.js              # Greeting shown to logged-in users  
│   ├── LoginButton.js               # Button component to log in  
│   ├── LogoutButton.js              # Button component to log out  
│  
├── 📂 output/                        # Screenshots captured during app execution  
│   ├── app-creation-success.png     # React app successfully created and initialized  
│   ├── login-page-output.png        # Output showing guest greeting before login  
│   ├── logout-page-output.png       # Output showing user greeting after login  
│   ├── webpack-compiled-success.png # Screenshot confirming JSX rendered successfully via Webpack  
│  
├── 📂 ticketbookingapp/             # Full React project built during this lab  
│   ├── node_modules/  
│   ├── public/  
│   ├── src/  
│   │   ├── All above components here  
│   └── package.json  
│  
├── 📄 12. ReactJS-HOL.docx          # Document explaining conditional rendering techniques  
└── 📄 README.md                     # This file  </pre>  

---

## 📌 Objective  
This hands-on lab focuses on implementing **conditional rendering** in a ReactJS application using `if/else`, `&&`, ternary operators, and element variables.

---

## ✅ What You'll Learn  
- How conditional rendering works in React  
- Using `useState` to manage login/logout states  
- Showing/hiding components based on user state  
- Structuring components with clear separation of logic  

>*📝 Refer to `12. ReactJS-HOL.docx` for conceptual explanations and written answers.*

---

## ⚙️ Prerequisites  
- Node.js  
- npm  
- Visual Studio Code  

---

## 🚀 Steps Followed  

1. **Install Node.js and npm**  
👉 Download from: https://nodejs.org/en/download  

2. **Create React App**  
```bash
npx create-react-app ticketbookingapp
````

3. **Navigate to Project**

```bash
cd ticketbookingapp
```

4. **Open in VS Code**

```bash
code .
```

5. **Create Component Files**
   Create the following React components in the `src/` folder:

* `Greeting.js`, `GuestGreeting.js`, `UserGreeting.js`
* `LoginButton.js`, `LogoutButton.js`
* `App.js`

6. **Update `App.js` for Logic**
   Use `useState` to track login state and render greeting/buttons accordingly.

7. **Run the App**

```bash
npm start
```

8. **View in Browser**
   Open your browser to: `http://localhost:3000`

---

## 📷 Output Screenshots  
Available in the `/output/` folder:

* `app-creation-success.png` – React app successfully created and initialized  
* `login-page-output.png` – Output showing guest greeting before login  
* `logout-page-output.png` – Output showing user greeting after successful login  
* `webpack-compiled-success.png` – Screenshot confirming successful JSX to DOM rendering by Webpack  

---

## ✅ Completion Status

* ✅ Project "ticketbookingapp" successfully created
* ✅ All required components implemented
* ✅ Login/Logout logic verified
* ✅ Conditional rendering demonstrated
* ✅ Objectives covered and documented in `12. ReactJS-HOL.docx`

---
