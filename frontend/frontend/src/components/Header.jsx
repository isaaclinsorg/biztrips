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
          <ul className="navbar">
            <li>
              <Link to="/">
                <img className="logo" alt="BBW Fitness" src="/images/logo.png" />
              </Link>
            </li>
            <li>
              <NavLink activeStyle={activeStyle} to="/trips">
                E-Tickets
              </NavLink>
            </li>
            <li>
              <NavLink activeStyle={activeStyle} to="/cart">
                Warenkorb
              </NavLink>
            </li>
            <li id="login">
              <NavLink activeStyle={activeStyle} to="/login">
                Login
              </NavLink>
            </li>
          </ul>
        </nav>
      </header>
  );
}
