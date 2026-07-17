import React from 'react';
import './App.css'; // Importing the styles

// Cart Class Component
class Cart extends React.Component {
  render() {
    return (
      <table className="cart-table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {/* Looping through the items passed via props */}
          {this.props.item.map((item, index) => {
            return (
              <tr key={index}>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    );
  }
}

// OnlineShopping Class Component
export class OnlineShopping extends React.Component {
  render() {
    // Array of 5 items initialized as per instructions
    const CartInfo = [
      { itemname: "Laptop", price: 80000 },
      { itemname: "TV", price: 120000 },
      { itemname: "Washing Machine", price: 50000 },
      { itemname: "Mobile", price: 30000 },
      { itemname: "Fridge", price: 70000 }
    ];

    return (
      <div className="mydiv">
        <h1>Items Ordered :</h1>
        {/* Passing the array as a prop named 'item' */}
        <Cart item={CartInfo} />
      </div>
    );
  }
}

export default OnlineShopping;