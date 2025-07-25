# ReactJS Hands-On Lab – 7. ReactJS-HOL

## 📁 Folder Structure

<pre>7.ReactJS-HOL/
│
├── 📂 codes/                             # Source code files from the exercise
│   ├── OnlineShopping.js                 # Main class component with Cart items
│   ├── Cart.js                           # Component used to display item details
│   └── index.js                          # Main render logic using reactDOM.render()
│
├── 📂 output/                            # Screenshots captured during execution
│   ├── app-creation-success.png            # Successful rendering of the shopping app
│   ├── webpack-compiled-success.png            # Successful Webpack build in VS Code
│   └── shoppingapp-browser-output.png        # Final browser output with item list
│
├── 📂 shoppingapp/                       # Full working React project
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── OnlineShopping.js
│   │   ├── Cart.js
│   │   └── index.js
│   └── package.json
│
├── 📄 7. ReactJS-HOL.docx                # Word file answering objective questions  
└── 📄 README.md                          # This file</pre>

## 📌 Objective
This hands-on lab teaches how to use Props, Default Props, and apply reactDOM.render() in a React class-based component setup.

## ✅ What You'll Learn

- What are Props and Default Props

- Difference between Props and State

- How to render React components using reactDOM.render()

- Passing data using Props between components

>*📝 A detailed Word document answering the objective questions is provided in the file: 7. ReactJS-HOL.docx.*

## ⚙️ Prerequisites

- Node.js and npm

- Visual Studio Code

## 🚀 Steps Followed

### - Create React App
<pre>npx create-react-app shoppingapp
cd shoppingapp
code .</pre>

### - Create Cart.js Component

```jsx
import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <tr>
        <td>{this.props.Itemname}</td>
        <td>{this.props.Price}</td>
      </tr>
    );
  }
}

export default Cart;
```

### - Create OnlineShopping.js Component

```jsx
import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  render() {
    const items = [
      { Itemname: 'Laptop', Price: 80000 },
      { Itemname: 'TV', Price: 120000 },
      { Itemname: 'Washing Machine', Price: 50000 },
      { Itemname: 'Mobile', Price: 30000 },
      { Itemname: 'Fridge', Price: 70000 }
    ];

    return (
      <div style={{ textAlign: 'center' }}>
        <h2 style={{ color: 'green' }}>Items Ordered :</h2>
        <table border="1" style={{ margin: 'auto' }}>
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {items.map((item, index) => (
              <Cart
                key={index}
                Itemname={item.Itemname}
                Price={item.Price}
              />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
```
### - Render in index.js

```jsx
import React from 'react';
import ReactDOM from 'react-dom/client';
import OnlineShopping from './OnlineShopping';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<OnlineShopping />);
```

### - Run the App
<pre>npm start</pre>

### - View Output
<pre>Open browser and go to: http://localhost:3000</pre>

## 📷 Output Screenshots

- Found in /output/ folder:

    - app-creation-success.png – App launched without errors

    - shoppingapp-browser-output.png – Shopping items displayed via props

    - webpack-compiled-output - Webpack build completed in VS Code


## ✅ Completion Status

- Props and Default Props successfully implemented

- Components rendered using reactDOM.render()

- Shopping items looped and displayed dynamically

- All objectives completed as described in 7. ReactJS-HOL.docx

- Code and screenshots included for verification
