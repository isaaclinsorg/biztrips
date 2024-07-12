import React from "react";
import { Link, NavLink } from "react-router-dom";
import "./Header.css";

const activeStyle = {
  color: "purple",
};

export default function Header() {
  return (
      <header className="header-container">
        <nav>
          <ul>
            <li>
              <Link to="/">
                <img alt="BBW Fitness" src="/images/logo.png"/>
              </Link>
            </li>
            <ul className="navbar">
              <li>
                <NavLink activeStyle={activeStyle} to="/trips">
                  E-Tickets
                </NavLink>
              </li>
              <li>
                <NavLink activeStyle={activeStyle} to="/wishlist">
                  Warenkorb
                </NavLink>
              </li>
              <li id="login">
                <NavLink activeStyle={activeStyle} to="/login">
                  Login
                </NavLink>
              </li>
            </ul>
          </ul>
        </nav>
      </header>
  );
}
