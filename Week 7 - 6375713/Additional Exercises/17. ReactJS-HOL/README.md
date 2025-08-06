# 🚀 ReactJS Hands-On Lab – 17: Fetching User Data from a REST API

## 📁 Folder Structure

```
17.ReactJS-HOL/
│
├── 📂 codes/                         
│   ├── App.js                      # Root component rendering Getuser
│   └── Getuser.js                  # Component for API call and displaying user data
│
├── 📂 output/                      
│   ├── App Creation Success.png     # React app setup success
│   ├── API Call Success.png         # API call executed successfully
│   ├── User Details Display.png     # User's title, name, and image rendered
│   └── Webpack Compiled Success.png # Webpack compiled successfully
│
├── 📂 fetchuserapp/                 
│   ├── node_modules/                # Project dependencies
│   ├── public/                      # Static files (HTML)
│   ├── src/                         
│   │   ├── App.js                   # Main application file
│   │   └── components/              
│   │       └── Getuser.js           # Component to fetch and display user
│   └── package.json                 # Project config and dependency list
│
├── 📄 17. ReactJS-HOL.docx          # Detailed instructions and explanation
└── 📄 README.md                     # Summary and usage guide
```

---

## 🎯 Objective

This hands-on lab demonstrates how to **consume a REST API using ReactJS**. You'll build a React component that performs an API call to fetch and display data from a public API.

---

## ✅ What You'll Learn

* How to make **GET requests** using `fetch()` in React
* How to use the **`componentDidMount()` lifecycle method**
* Managing **asynchronous operations** in class components
* Parsing and rendering **JSON data**
* Displaying dynamic content using **JSX**

> 📘 *Refer to* **`17. ReactJS-HOL.docx`** *for extended explanation and troubleshooting tips.*

---

## ⚙️ Prerequisites

* Node.js
* NPM
* Visual Studio Code

---

## 🛠️ Steps Followed

### 1️⃣ Create the React App

```bash
npx create-react-app fetchuserapp
cd fetchuserapp
code .
```

---

### 2️⃣ Implement `Getuser.js` Component

📄 **Path**: `src/components/Getuser.js`

```jsx
import React, { Component } from 'react';

class GetUser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      person: null, // To store the fetched user data
      loading: true, // To indicate if data is being fetched
      error: null // To handle potential errors
    };
  }

  async componentDidMount() {
    try {
      const url = "https://api.randomuser.me/";
      const response = await fetch(url);
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      this.setState({
        person: data.results[0], // Store the first user object
        loading: false // Data has been loaded
      });
      console.log(data.results[0]); // As shown in your provided snippet
    } catch (error) {
      console.error("Error fetching data:", error);
      this.setState({
        loading: false, // Stop loading even if there's an error
        error: error.message // Store the error message
      });
    }
  }

  render() {
    const { person, loading, error } = this.state;

    if (loading) {
      return <div>Loading user data...</div>;
    }

    if (error) {
      return <div>Error: {error}</div>;
    }

    if (!person) {
      return <div>No user data found.</div>;
    }

    // Destructure properties for easier access
    const { name, picture } = person;
    const fullName = `${name.title} ${name.first} ${name.last}`;

    return (
      <div>
        <h1>{fullName}</h1>
        <img src={picture.large} alt={fullName} />
      </div>
    );
  }
}

export default GetUser;
```

---

### 3️⃣ Update `App.js`

📄 **Path**: `src/App.js`

```jsx
import React from 'react';
import './App.css'; // You can keep or remove this if you don't use it
import GetUser from './Getuser'; // Import your GetUser component

function App() {
  return (
    <div className="App">
      <GetUser /> {/* Render your GetUser component */}
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

Then open your browser at:

[http://localhost:3000](http://localhost:3000)

---

## 📸 Output Screenshots

Stored in `/output/` folder:

* ✅ **App Creation Success.png** – React project created
* ✅ **API Call Success.png** – REST API call succeeded
* ✅ **User Details Display.png** – User's title, name, and picture displayed
* ✅ **Webpack Compiled Success.png** – App compiled without issues

---

## 🏁 Completion Checklist

* [x] React app `fetchuserapp` created
* [x] `Getuser.js` implemented as class component
* [x] Used `componentDidMount()` to perform API call
* [x] Called `https://api.randomuser.me/` via `fetch()`
* [x] Rendered title, first name, and image from response
* [x] Output screenshots captured and verified
* [x] All tasks and logic documented in `17. ReactJS-HOL.docx`



