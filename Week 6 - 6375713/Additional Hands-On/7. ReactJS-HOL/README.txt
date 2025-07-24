ReactJS Hands-On Lab – 7. ReactJS-HOL

📁 Folder Structure

7.ReactJS-HOL/
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
└── 📄 README.md                          # This file

📌 Objective
This hands-on lab teaches how to use Props, Default Props, and apply reactDOM.render() in a React class-based component setup.

✅ What You'll Learn

- What are Props and Default Props

- Difference between Props and State

- How to render React components using reactDOM.render()

- Passing data using Props between components

📝 A detailed Word document answering the objective questions is provided in the file: 7. ReactJS-HOL.docx.

⚙️ Prerequisites

- Node.js and npm

- Visual Studio Code

🚀 Steps Followed

- Create React App
npx create-react-app shoppingapp
cd shoppingapp
code .

- Create Cart.js Component
import React from "react";

class Cart extends React.Component {
  render() {
    return (
      <div>
        <h3>Item: {this.props.itemname}</h3>
        <p>Price: ₹{this.props.price}</p>
      </div>
    );
  }
}

// Default props (optional)
Cart.defaultProps = {
  itemname: "Unknown",
  price: 0
};

export default Cart;

- Create OnlineShopping.js Component
import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);
    this.items = [
      { itemname: "Laptop", price: 60000 },
      { itemname: "Smartphone", price: 25000 },
      { itemname: "Headphones", price: 2000 },
      { itemname: "Keyboard", price: 1500 },
      { itemname: "Mouse", price: 800 }
    ];
  }

  render() {
    return (
      <div>
        <h1>Shopping Cart</h1>
        {this.items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;

- Render in index.js
import React from "react";
import ReactDOM from "react-dom/client";
import OnlineShopping from "./OnlineShopping";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<OnlineShopping />);

- Run the App
npm start

- View Output
Open browser and go to: http://localhost:3000

📷 Output Screenshots

- Found in /output/ folder:

    - app-creation-success.png – App launched without errors

    - shoppingapp-browser-output.png – Shopping items displayed via props

    - webpack-compiled-output - Webpack build completed in VS Code


✅ Completion Status

- Props and Default Props successfully implemented

- Components rendered using reactDOM.render()

- Shopping items looped and displayed dynamically

- All objectives completed as described in 7. ReactJS-HOL.docx

- Code and screenshots included for verification