# ReactJS Hands-On Lab – 13. ReactJS-HOL

## 📁 Folder Structure

<pre>13.ReactJS-HOL/
│
├── 📂 codes/                   # Contains reusable component code
│   ├── App.js                 
│   ├── BookDetails.js         
│   ├── BlogDetails.js         
│   └── CourseDetails.js       
│
├── 📂 output/                  # Screenshots captured during execution
│   ├── app-creation-success.png
│   ├── conditional-book-output.png
│   ├── conditional-blog-output.png
│   ├── conditional-course-output.png
│   └── list-map-render-output.png
│
├── 📂 bloggerapp/              # Fully working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── App.js             
│   │   └── components/
│   │       ├── BookDetails.js 
│   │       ├── BlogDetails.js 
│   │       └── CourseDetails.js
│   └── package.json
│
├── 📄 13. ReactJS-HOL.docx     # Word file with learning objectives and exercises
└── 📄 README.md                # This file</pre>

---

## 📌 Objective

This lab focuses on rendering components conditionally and using lists and keys effectively in React applications.

---

## ✅ What You'll Learn

* Various methods of **conditional rendering**
* How to **render multiple components**
* Creating and using a **list component**
* Importance and usage of **keys** in React
* Extracting child components with keys
* Using the **map()** function in JSX for list rendering

> *📝 Full explanation and theory are documented in `13. ReactJS-HOL.docx`.*

---

## ⚙️ Prerequisites

* Node.js
* npm
* Visual Studio Code

---

## 🚀 Steps Followed

### - Install Node.js and npm

<pre>https://nodejs.org/en/download</pre>

### - Create the React App

<pre>npx create-react-app bloggerapp</pre>

### - Navigate to App Folder

<pre>cd bloggerapp</pre>

### - Open in VS Code

<pre>code .</pre>

---

### - Create Required Components

📁 In `src/components/`, create the following:

1. `BookDetails.js` – Displays book information conditionally
2. `BlogDetails.js` – Shows blog data based on a toggle or boolean
3. `CourseDetails.js` – Renders list of courses using **map()** with **keys**

Update `App.js` to control visibility using different conditional rendering methods:

* `if/else` statements
* Ternary operators
* Logical `&&` rendering
* Element variables

---

### - Example: List Rendering Using map()

```jsx
const courses = ['React', 'Node', 'MongoDB'];

return (
  <ul>
    {courses.map((course, index) => (
      <li key={index}>{course}</li>
    ))}
  </ul>
);
```

---

## 📷 Output Screenshots

Found in `/output/` folder:

* `app-creation-success.png` – Successful React app creation
* `conditional-book-output.png` – Output of Book component conditionally rendered
* `conditional-blog-output.png` – Conditional rendering of Blog component
* `conditional-course-output.png` – Rendered output of Course component
* `list-map-render-output.png` – Result of list rendering using map() and keys

---

## ✅ Completion Status

* All components created and conditionally rendered
* List rendering implemented with keys and map function
* Different approaches to conditional rendering demonstrated
* Output screenshots included
* Word document `13. ReactJS-HOL.docx` contains all theory and instructions

---

