Here is the **README.md** file for **17. ReactJS-HOL**, based on the content of `17. ReactJS-HOL.docx` and following your structured format:

---

# ReactJS Hands-On Lab – 17. ReactJS-HOL

## 📁 Folder Structure

<pre>17.ReactJS-HOL/
│
├── 📂 codes/                         # Component source code
│   ├── App.js                       
│   └── Getuser.js                   # Component to fetch and display user info
│
├── 📂 output/                        # Screenshots of API fetch and display
│   ├── app-creation-success.png     
│   ├── api-call-success.png         
│   └── user-details-display.png     
│
├── 📂 fetchuserapp/                 # Complete React app to consume REST API
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js                   
│   │   └── components/
│   │       └── Getuser.js           
│   └── package.json
│
├── 📄 17. ReactJS-HOL.docx           # Word document with instructions and objectives
└── 📄 README.md                      # This file</pre>

---

## 📌 Objective

This hands-on lab teaches how to **consume REST APIs** in React applications using the Fetch API and lifecycle methods.

---

## ✅ What You'll Learn

* How to make **GET requests** in React
* Using `componentDidMount()` to perform side effects
* Handling asynchronous API responses
* Parsing and rendering JSON data
* Displaying fetched data using JSX

> *📝 Full task instructions are provided in `17. ReactJS-HOL.docx`.*

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### - Create the React App

<pre>npx create-react-app fetchuserapp</pre>

### - Navigate to the App Folder

<pre>cd fetchuserapp</pre>

### - Open the Project in VS Code

<pre>code .</pre>

---

### - Create and Implement `Getuser.js` Component

📁 Inside `src/components/Getuser.js`, implement the following:

1. Use `componentDidMount()` lifecycle method
2. Fetch data from `https://api.randomuser.me/`
3. Parse response to extract:

   * **Title**
   * **First name**
   * **Profile image**

### - Example Code

```jsx
import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null
    };
  }

  componentDidMount() {
    fetch('https://api.randomuser.me/')
      .then(response => response.json())
      .then(data => {
        this.setState({ user: data.results[0] });
      });
  }

  render() {
    const { user } = this.state;
    return (
      <div>
        <h2>User Details</h2>
        {user ? (
          <div>
            <p>Title: {user.name.title}</p>
            <p>First Name: {user.name.first}</p>
            <img src={user.picture.large} alt="User" />
          </div>
        ) : (
          <p>Loading user...</p>
        )}
      </div>
    );
  }
}

export default Getuser;
```

---

### - Update `App.js` to Render the `Getuser` Component

```jsx
import Getuser from './components/Getuser';

function App() {
  return (
    <div className="App">
      <Getuser />
    </div>
  );
}

export default App;
```

---

### - Run the App

<pre>npm start</pre>

### - View in Browser

<pre>http://localhost:3000</pre>

---

## 📷 Output Screenshots

Available in `/output/`:

* `app-creation-success.png` – Project setup confirmation
* `api-call-success.png` – Fetch call successful
* `user-details-display.png` – User title, name, and image displayed

---

## ✅ Completion Status

* REST API successfully consumed
* User information fetched and displayed using class component
* Output screenshots captured for reference
* All steps clearly documented in `17. ReactJS-HOL.docx`

---

Ready for the next one whenever you are!
