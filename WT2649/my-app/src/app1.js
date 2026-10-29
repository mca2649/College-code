import React from "react";
import ReactDOM from "react-dom/client";
import './index.css';
import './App.css';
import reportWebVitals from './reportWebVitals';
function App1()
{
    const g = "Good Afternoon";
    const color = "blue";
    const name = "Satish";
    return (
        <body bgcolor={color}>
            <div className="container">
                <h1>Hello to World of React</h1>
                <p>React is a library of Class And function components</p>
                <p>{g}, {name}</p>
            </div>
        </body>
    );
}
export default App1;