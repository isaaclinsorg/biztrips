import React, { useReducer, useEffect } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

import "./App.css";
import Wishlist from "./components/Wishlist";
import TripList from "./components/TripList";
import { getWishlistItems } from "./components/tripsService.js";
import tripsReducer from "./components/tripsReducer.js";
let initialWishlist = [
  {
    id: 1,
    title: "BT01",
    description: "San Francisco World Trade Center on new Server/IOT/Client ",
    startTrip: [2021, 2, 13, 9, 0],
    endTrip: [2021, 2, 15, 16, 56],
    meetings: [
      {
        id: 1,
        title: "One Conference",
        description: "Key Note on One Conference",
      },
      {
        id: 2,
        title: "Zero Conference",
        description: "Workshop Zero on One Conference",
      },
    ],
  },
  {
    id: 2,
    title: "BT02",
    description: "Santa Clara Halley on new Server/IOT/Client",
    startTrip: [2021, 6, 23, 9, 0],
    endTrip: [2021, 6, 27, 16, 56],
    meetings: [
      {
        id: 3,
        title: "One Conference",
        description: "HandsOn on One Conference",
      },
      {
        id: 4,
        title: "One Conference",
        description: "Key Note on One Conference",
      },
    ],
  },
  {
    id: 3,
    title: "BT03",
    description: "San Cose City Halley on Docker/IOT/Client",
    startTrip: [2021, 12, 13, 9, 0],
    endTrip: [2021, 12, 15, 16, 56],
    meetings: [
      {
        id: 5,
        title: "One Conference",
        description: "Key Note on One Conference",
      },
    ],
  },
];
/* let initialWishlist = [];
try {
  initialWishlist = JSON.parse(localStorage.getItem("wishlist")) ? [] : [];
} catch {
  console.error("The wishlist could not be parsed into JSON.");
  initialWishlist = [];
} */

export default function App() {
  const [wishlist, dispatch] = useReducer(tripsReducer, initialWishlist);

  useEffect(() => {
    // state from fetch
    getWishlistItems().then((response) => {
      initialWishlist = response;
    });

    // localstorage
    localStorage.setItem("wishlist", JSON.stringify(wishlist));
  }, []);

  return (
    <div className="container">
      <header className="container h3">
        Business Trips - Wishlist functional with JAVA & REACT
        <h4>
          Version-2 (using useReducer with pure functions instead of useState
          (8))
        </h4>
      </header>
      <Wishlist wishlist={wishlist} dispatch={dispatch} />
      <TripList dispatch={dispatch} />
      {<WishlistTest wishlist={wishlist}></WishlistTest>}
      <footer>@BBW 2024</footer>
    </div>
  );
}

function WishlistTest(props) {
  return (
    <div className="container">
      <header className="container h3">Wishlist-Test</header>
      <ul>
        {props.wishlist.map((item, id) => {
          return (
            <li key={item.id}>
              {item.id} - {item.title} {item.description}
            </li>
          );
        })}
      </ul>
    </div>
  );
}
