Here is the professional **README.md** file for **16. ReactJS-HOL**, based on the details from `16. ReactJS-HOL.docx` and following your consistent structure:

---

# ReactJS Hands-On Lab – 16. ReactJS-HOL

## 📁 Folder Structure

<pre>16.ReactJS-HOL/
│
├── 📂 codes/                         # Component source code
│   ├── App.js                       
│   └── Register.js                  # Form component with validation logic
│
├── 📂 output/                        # Screenshots of execution and validation
│   ├── app-creation-success.png     
│   ├── form-rendered.png            
│   ├── validation-error-name.png    
│   ├── validation-error-email.png   
│   ├── validation-error-password.png
│   └── successful-submission.png    
│
├── 📂 mailregisterapp/              # Complete working app with validation
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js                   
│   │   └── components/
│   │       └── Register.js          
│   └── package.json
│
├── 📄 16. ReactJS-HOL.docx           # Word document with validation objectives
└── 📄 README.md                      # This file</pre>

---

## 📌 Objective

This hands-on lab focuses on **form validation** in React, comparing React forms to HTML forms and implementing client-side validation for common input fields.

---

## ✅ What You'll Learn

* Differences between **React Form** and **HTML Form**
* Creating **controlled components**
* Managing and validating form inputs like textboxes, passwords, and buttons
* Handling events using `onChange` and `onSubmit`
* Displaying inline validation messages

> *📝 Detailed steps and validation logic are included in `16. ReactJS-HOL.docx`.*

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### - Create the React App

<pre>npx create-react-app mailregisterapp</pre>

### - Navigate to App Folder

<pre>cd mailregisterapp</pre>

### - Open in VS Code

<pre>code .</pre>

---

### - Implement `Register.js` Component

📁 In `src/components/Register.js`, create a controlled form with the following fields:

* **Name** (min. 5 characters)
* **Email** (must include `@` and `.`)
* **Password** (min. 8 characters)

### - Example: Basic Validation Logic

```jsx
const Register = () => {
  const [formData, setFormData] = useState({ name: '', email: '', password: '' });
  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const validate = () => {
    let err = {};
    if (formData.name.length < 5) err.name = 'Name must be at least 5 characters';
    if (!formData.email.includes('@') || !formData.email.includes('.')) err.email = 'Email must contain @ and .';
    if (formData.password.length < 8) err.password = 'Password must be at least 8 characters';
    return err;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const validationErrors = validate();
    if (Object.keys(validationErrors).length > 0) {
      setErrors(validationErrors);
    } else {
      alert("Registration successful!");
      setErrors({});
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input name="name" onChange={handleChange} placeholder="Name" /><br/>
      {errors.name && <span>{errors.name}</span>}<br/>

      <input name="email" onChange={handleChange} placeholder="Email" /><br/>
      {errors.email && <span>{errors.email}</span>}<br/>

      <input name="password" type="password" onChange={handleChange} placeholder="Password" /><br/>
      {errors.password && <span>{errors.password}</span>}<br/>

      <button type="submit">Register</button>
    </form>
  );
};
```

---

### - Update `App.js` to Render the Form

```jsx
import Register from './components/Register';

function App() {
  return (
    <div>
      <h2>Mail Registration Form</h2>
      <Register />
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

* `app-creation-success.png` – React app setup successful
* `form-rendered.png` – Registration form rendered
* `validation-error-name.png` – Name validation error
* `validation-error-email.png` – Email validation error
* `validation-error-password.png` – Password validation error
* `successful-submission.png` – Valid form submission and alert

---

## ✅ Completion Status

* Form validation using controlled components complete
* Validation error messages display correctly
* Form handles valid and invalid input cases
* Screenshots captured for both success and error cases
* Steps and logic explained in `16. ReactJS-HOL.docx`

---

Let me know when you're ready with the next lab file!
