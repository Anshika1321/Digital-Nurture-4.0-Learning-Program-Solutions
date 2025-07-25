# ReactJS Hands-On Lab – Component Lifecycle Methods – 4. ReactJS-HOL

## 📁 Folder Structure

<pre>4.ReactJS-HOL/
│
├── 📂 codes/                        # Contains component source files
│   ├── Post.js                      # Reusable Post class
│   ├── Posts.js                     # Class component with lifecycle methods
│   └── App.js                       # Main app component rendering Posts
│
├── 📂 output/                       # Screenshots from execution
│   ├── app-creation-success.png          # Screenshot of app creation in CMD
│   ├── webpack-complied-success.png         # Screenshot of Webpack build success in VS Code
│   └── browser-output.png          # Screenshot of the output in browser
│
├── 📂 blogapp/                      # Complete working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── Post.js
│   │   ├── Posts.js
│   │   └── App.js
│   └── package.json
│
├── 📄 4. ReactJS-HOL.docx            # Word file with theory answers
└── 📄 README.md                      # This file</pre>

## 📌 Objective
This lab demonstrates how to use lifecycle methods in class-based React components to manage data fetching and error handling.

## ✅ What You'll Learn
- The need and benefits of component lifecycle in React

- Key lifecycle hooks like componentDidMount() and componentDidCatch()

- Rendering external data fetched from an API

- Handling runtime errors gracefully using error boundaries

>*📝 Detailed objective answers are provided in 4. ReactJS-HOL.docx.*

## ⚙️ Prerequisites
- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed
### - Create React App
<pre>npx create-react-app blogapp</pre>

### - Create Post.js
In src/, create ****Post.js**** with a class that holds post data (optional utility class):

```jsx
class Post {
    constructor(id,title, body) {
        this.id=id;
        this.title=title;
        this.body=body;
    }
}
export default Post;
```

- Create ****Posts.js****

```jsx
import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        this.setState({ error });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
  }

  render() {
    const { posts } = this.state;
    return (
      <div>
        <h1>Posts</h1>
        {posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
```

### - Update App.js

```jsx
import React from 'react';
import './App.css';
import Posts from './Posts';

function App() {
  return (
    <div className="App">
      <Posts />
    </div>
  );
}

export default App;
```

### - Run the App
<pre>npm start</pre>

### - Open in Browser
<pre>Visit: http://localhost:3000</pre>

## 📷 Output Screenshots
- Found in /output/ folder:
    - app-creation-success.png – App created using create-react-app

    - webpack-complied-success.png – Webpack build completed in VS Code

    - browser-output.png – Posts rendered in browser

## ✅ Completion Status
- Lifecycle hooks componentDidMount and componentDidCatch implemented

- External posts loaded and displayed

- Error handling demonstrated

- All requirements from Word doc completed

- Code, screenshots, and documentation provided
