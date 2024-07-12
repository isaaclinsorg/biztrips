import React from "react";
import { Link, NavLink } from "react-router-dom";

const activeStyle = {
  color: "purple",
};

export default function Header() {
  return (
    <header>
      <nav>
        <ul>
          <li>
            <Link to="/">
              <img alt="BBW Fitness" src="/images/logo.png" />
            </Link>
          </li>
          {/*<li>
            <NavLink activeStyle={activeStyle} to="/boards">
              Boards
            </NavLink>
          </li>
          <li>
            <NavLink activeStyle={activeStyle} to="/cart">
              Cart
            </NavLink>
          </li>*/}
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
        </ul>
      </nav>
    </header>
  );
}
