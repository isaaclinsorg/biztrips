import React, { useReducer } from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Footer from "./components/Footer";
import Header from "./components/Header";
import Products from "./Products";
import { Routes, Route } from "react-router-dom";
import Detail from "./Detail";
import Cart from "./Cart";
import Checkout from "./Checkout";
import TripList from "./components/TripList";
import tripsReducer from "./components/tripsReducer";
import LoginSignup from "./components/LoginSignup/LoginSignup";

export default function App() {
  const [wishlist, dispatch] = useReducer(tripsReducer, []);
  return (
    <>
      <div className="content">
        <Header />
        <main>
          <Routes>
            <Route
              path="/"
              element={
                <h1>E-Ticketverwaltung</h1>
              }
            />
            <Route path="/:category" element={<Products />} />
            <Route path="/:category/:id" element={<Detail />} />
            <Route path="/cart" element={<Cart />} />
            <Route path="/checkout" element={<Checkout />} />
            <Route path="/trips" element={<TripList dispatch={dispatch} />} />
            <Route path="/login" element={<LoginSignup/>} />
            {/* <Route
              path="/wishlist"
              element={<Wishlist wishlist={
              } dispatch={dispatch} />}
            /> */}
          </Routes>
        </main>
      </div>
      <Footer />
    </>
  );
}
