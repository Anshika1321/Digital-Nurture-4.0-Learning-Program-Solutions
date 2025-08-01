# ReactJS Hands-On Lab – 13. ReactJS-HOL

## 📁 Folder Structure

<pre>
13.ReactJS-HOL/
│
├── 📂 codes/                     # Contains reusable component code
│   ├── App.js                    # Parent container rendering all details
│   ├── BookDetails.js            # Displays book section using JSX
│   ├── BlogDetails.js            # Conditionally renders blog info
│   ├── CourseDetails.js          # Renders list using map() with keys
│   └── data.js                   # Static data passed to components
│
├── 📂 output/                    # Screenshots captured during execution
│   ├── app-creation-success.png         # React app successfully created
│   ├── browser-output.png               # Combined component rendering in browser
│   └── webpack-compiled-success.png     # Webpack compilation success confirmation
│
├── 📂 bloggerapp/                # Fully working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js 
│   │   ├── data.js
│   │   └── components/
│   │       ├── BookDetails.js 
│   │       ├── BlogDetails.js 
│   │       └── CourseDetails.js
│   └── package.json
│
├── 📄 13. ReactJS-HOL.docx       # Word file with objectives and instructions
└── 📄 README.md                  # This file
</pre>

---

## 📌 Objective

This hands-on lab focuses on implementing various methods of **conditional rendering** and **list rendering** in React using the `map()` function and `key` props.

---

## ✅ What You'll Learn

- Multiple methods of conditional rendering
- Rendering multiple components dynamically
- Creating and displaying lists using `map()`
- Importance of keys in React
- Extracting reusable child components

> *📝 Full explanations and exercises are available in `13. ReactJS-HOL.docx`*

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
npx create-react-app bloggerapp
````

### 3. Navigate to Project Folder

```bash
cd bloggerapp
```

### 4. Open in VS Code

```bash
code .
```

---

### 5. Create Required Components

In `src/components/`, create:

* `BookDetails.js` – Displays book info conditionally
* `BlogDetails.js` – Renders blog details using toggle logic
* `CourseDetails.js` – Renders course list using `map()` and keys
* `data.js` – Contains data arrays or objects

Update `App.js` to control rendering using:

* `if/else` statements
* Ternary operators
* Logical `&&` expressions
* Element variables

---

## 📷 Output Screenshots

Available in the `/output/` folder:

* `app-creation-success.png` – React app scaffold created successfully
* `browser-output.png` – Final output showing all components rendered
* `webpack-compiled-success.png` – Screenshot showing successful build/compilation

---

## ✅ Completion Status

* ✅ App "bloggerapp" created and running
* ✅ Book, Blog, and Course components implemented
* ✅ Conditional rendering techniques demonstrated
* ✅ List rendering with keys implemented
* ✅ Screenshots provided
* ✅ Theory covered in `13. ReactJS-HOL.docx`

---

