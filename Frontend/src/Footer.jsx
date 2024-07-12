import React from "react";

export default function Footer() {
  return (
    <footer>
      <p>
        This site is created for demonstrative purposes only and does not offer
        any real products or services.
      </p>
      <p>&copy; BBW 20232323</p>
    </footer>
  );
}
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from "react-router-dom";
import { CartProvider } from "./cartContext";
import ErrorBoundary from "./ErrorBoundary";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <ErrorBoundary>
        <BrowserRouter>
            <CartProvider>
                <React.StrictMode>
                    <App />
                </React.StrictMode>
            </CartProvider>
        </BrowserRouter>
    </ErrorBoundary>,
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
