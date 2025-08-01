# 🚀 ReactJS Hands-On Lab – 16: Registration Form with Validation

## 📁 Folder Structure

<pre>16.ReactJS-HOL/
│
├── 📂 codes/                         
│   ├── App.js                      # Root component rendering the Register form
│   └── Register.js                 # Registration form with validation logic
│
├── 📂 output/                      
│   ├── App Creation Success.png     # Successful app creation
│   ├── Form Rendered.png            # Form loaded in browser
│   ├── Successful Submission.png    # Alert on valid submission
│   ├── Validation Error Email.png   # Alert for invalid email
│   ├── Validation Error Name.png    # Alert for invalid name (< 5 characters)
│   ├── Validation Error Password.png# Alert for invalid password (< 8 characters)
│   └── Webpack Compiled Success.png # Webpack compiled the app successfully
│
├── 📂 mailregisterapp/             
│   ├── node_modules/                # Installed dependencies
│   ├── public/                      # Static HTML and assets
│   ├── src/                         
│   │   ├── App.js                   # Main application file
│   │   └── components/              
│   │       └── Register.js          # Controlled form component with validation
│   └── package.json                 # Project metadata and scripts
│
├── 📄 16. ReactJS-HOL.docx          # Detailed lab instructions and guidance
└── 📄 README.md                     # Summary and lab overview</pre>

## 🎯 Objective
To build a ReactJS registration form with client-side validation for user inputs (name, email, and password) using controlled components and event handling.

## ✅ What You'll Learn
1. How React form validation differs from HTML forms

2. Use of controlled components in React

3. Handling input changes with onChange

4. Validating user inputs on onSubmit

5. Displaying user-friendly validation messages

6. Structuring reusable form logic using useState

7. Ensuring good UX through real-time error handling

>*🔎 For detailed walkthrough and form behavior, refer to 16. ReactJS-HOL.docx*

## ⚙️ Prerequisites
- Node.js
- NPM
- Visual Studio Code

## 🛠️ Steps Followed

### 1️⃣ Create React App
<pre>npx create-react-app mailregisterapp
cd mailregisterapp
code .</pre>

### 2️⃣ Implement Register.js Component

📄 Path: src/components/Register.js
```jsx
import React, { useState } from 'react';

const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

const Register = () => {
  const [formData, setFormData] = useState({
    fullName: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({
    fullName: '',
    email: '',
    password: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    let tempErrors = { ...errors };

    switch (name) {
      case 'fullName':
        tempErrors.fullName = value.length < 5 ? 'Full Name must be at least 5 characters.' : '';
        break;
      case 'email':
        tempErrors.email = emailRegex.test(value) ? '' : 'Email format is invalid.';
        break;
      case 'password':
        tempErrors.password = value.length < 8 ? 'Password must be at least 8 characters.' : '';
        break;
      default:
        break;
    }

    setErrors(tempErrors);
    setFormData({ ...formData, [name]: value });
  };

  const validateForm = () => {
    return Object.values(errors).every(err => err === '') &&
           Object.values(formData).every(field => field !== '');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validateForm()) {
      alert('Valid Form');
    } else {
      let alertMsg = '';
      if (errors.fullName) alertMsg += errors.fullName + '\n';
      if (errors.email) alertMsg += errors.email + '\n';
      if (errors.password) alertMsg += errors.password + '\n';
      if (!alertMsg.trim()) alertMsg = 'Please fill in all fields.';
      alert(alertMsg.trim());
    }
  };

  return (
    <form onSubmit={handleSubmit} noValidate>
      <label>Name:</label><br/>
      <input type="text" name="fullName" value={formData.fullName} onChange={handleChange} /><br/>
      {errors.fullName && <span style={{ color: 'red' }}>{errors.fullName}</span>}<br/>

      <label>Email:</label><br/>
      <input type="email" name="email" value={formData.email} onChange={handleChange} /><br/>
      {errors.email && <span style={{ color: 'red' }}>{errors.email}</span>}<br/>

      <label>Password:</label><br/>
      <input type="password" name="password" value={formData.password} onChange={handleChange} /><br/>
      {errors.password && <span style={{ color: 'red' }}>{errors.password}</span>}<br/>

      <button type="submit">Submit</button>
    </form>
  );
};

export default Register;
```

### 3️⃣ Update App.js
📄 Path: src/App.js
```jsx
import React from 'react';
import Register from './components/Register';

function App() {
  return (
    <div className="App">
      <h2>Register Here!!!</h2>
      <Register />
    </div>
  );
}

export default App;
```

### 4️⃣ Run the App

<pre>npm start
Access the app at: http://localhost:3000</pre>

## 📸 Output Screenshots
Stored in /output/:

   - App Creation Success.png – Project initialized

   - Form Rendered.png – Form displayed

   - Successful Submission.png – Alert on valid submission

   - Validation Error Name.png – Alert for short name

   - Validation Error Email.png – Alert for invalid email

   - Validation Error Password.png – Alert for short password

   - Webpack Compiled Success.png – Webpack compiled the app

## 🏁 Completion Checklist
 - React app mailregisterapp created

 - Register.js implemented with form inputs: name, email, password

 - Validations:

    - Name: ≥ 5 characters

    - Email: valid format

    - Password: ≥ 8 characters

- Validation handled via onChange and onSubmit

- Real-time error messages displayed

- Output screenshots captured for both success and failure scenarios

- All steps and logic documented in 16. ReactJS-HOL.docx

