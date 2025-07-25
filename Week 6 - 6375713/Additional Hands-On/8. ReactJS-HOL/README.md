# ReactJS Hands-On Lab – 8. ReactJS-HOL

## 📁 Folder Structure

<pre>8.ReactJS-HOL/
│
├── 📂 codes/                             # Source code for component logic
│   ├── CountPeople.js                    # Component with state management
│   └── index.js                            # Main app file to render CountPeople
│
├── 📂 output/                            # Screenshots captured during execution
│   ├── app-creation-success.png             # React app created successfully
│   ├── webpack-compiled-success.png             # App launch confirmation
│   └── counterapp-browser-output.png     # Final browser view with counters and buttons
│
├── 📂 counterapp/                        # Full working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── CountPeople.js
│   │   └── App.js
│   └── package.json
│
├── 📄 8. ReactJS-HOL.docx                # Word file containing objective answers  
└── 📄 README.md                          # This file</pre>

## 📌 Objective
This hands-on lab demonstrates the use of React State and event handlers to update and manage values in a functional interface.

## ✅ What You'll Learn

- How to declare and use state in a class-based component

- How to update state using methods and event handlers

- Implementing simple interactive UI with dynamic state rendering

>*📝 A detailed Word document answering the objective questions is provided in the file: 8. ReactJS-HOL.docx.*

## ⚙️ Prerequisites

- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed

### - Create React App
<pre>npx create-react-app counterapp
cd counterapp
code .</pre>

### - Create CountPeople.js Component

```jsx
import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  UpdateEntry = () => {
    this.setState({ entrycount: this.state.entrycount + 1 });
  };

  UpdateExit = () => {
    this.setState({ exitcount: this.state.exitcount + 1 });
  };

  render() {
    return (
      <div style={{ display: 'flex', justifyContent: 'center', gap: '100px', marginTop: '100px' }}>
        <div>
          <button
            style={{ border: '2px solid green', backgroundColor: 'lightgreen', padding: '5px 10px' }}
            onClick={this.UpdateEntry}
          >
            Login
          </button>
          <span style={{ marginLeft: '10px' }}>{this.state.entrycount} People Entered!!!</span>
        </div>

        <div>
          <button
            style={{ border: '2px solid green', backgroundColor: 'lightgreen', padding: '5px 10px' }}
            onClick={this.UpdateExit}
          >
            Exit
          </button>
          <span style={{ marginLeft: '10px' }}>{this.state.exitcount} People Left!!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;
```

### - Update index.js

```jsx
import React from 'react';
import ReactDOM from 'react-dom/client';
import CountPeople from './CountPeople';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<CountPeople />);
```

### - Run the App
<pre>npm start</pre>

### - View Output
<pre>Open browser and go to: http://localhost:3000</pre>

## 📷 Output Screenshots

- Found in /output/ folder:
    - app-creationo-success.png - React app created successfully

    - webpack-compiled-output.png – Confirmation of successful launch

    - counterapp-browser-output.png – Display of entry and exit counts with buttons

## ✅ Completion Status

- React app created successfully

- State initialized and updated using setState()

- UI updates in real-time on button click

- Objective completed as per instructions in 8. ReactJS-HOL.docx

- Screenshots and source code provided for verification
