import React, { useState, useEffect } from "react";
import { getAllTickets } from "./tripsService";
import Ticket from "./Ticket";

// Functional component TripList
function TripList({ dispatch }) {
  // State
  const [trips, setTrips] = useState([]);
  const [tickets, setTickets] = useState([]);

  useEffect(() => {
    // Initialisiere trips und tickets als leeres Array, falls sie undefined sind
    setTrips(trips || []);
    setTickets(tickets || []);
  }, [trips, tickets]);

  const handleGetAllTickets = async () => {
    try {
      const ticketsData = await getAllTickets();
      setTickets(ticketsData || []); // Initialisiere als leeres Array, falls ticketsData undefined ist
    } catch (error) {
      console.error("Error fetching tickets:", error);
      setTickets([]); // Setze tickets auf ein leeres Array im Fehlerfall
    }
  };

  const tripsMapped = (trips && trips.length > 0) ? (
      trips.map((trip) => (
          <Trip dispatch={dispatch} trip={trip} key={trip.id} />
      ))
  ) : (
      <p className="alert alert-info">Triplist is empty</p>
  );

  const ticketsMapped = (tickets && tickets.length > 0) ? (
      tickets.map((ticket) => (
          <Ticket ticket={ticket} key={ticket.id} />
      ))
  ) : (
      <p className="alert alert-info">No tickets available</p>
  );

  return (
      <div className="container">
        <section>
          <h4 className="h4">E-Ticket buchen - Planned 2024</h4>
          <button onClick={handleGetAllTickets}>Tickets anzeigen</button>
          <div className="row">{tripsMapped}</div>
          <div className="row">{ticketsMapped}</div>
        </section>
      </div>
  );
}

// Deconstruct props
function Trip({ dispatch, trip }) {
  const { id, title, description, startTrip, endTrip } = trip;

  return (
      <div className="col-sm-6 col-md-4 col-lg-3">
        <figure className="card card-product">
          <div className="img-wrap">
            <img src={"images/items/" + id + ".jpg"} alt="name" />
          </div>
          <figcaption className="info-wrap">
            <a href="#. . . " className="title">
              {title}
            </a>
            <div className="price-wrap">
              <span className="price-new">{startTrip}</span>
            </div>
            <p className="card-text">{description}</p>
            <div className="info-wrap row">
              <button
                  type="button"
                  className="btn btn-link btn-outline"
                  onClick={() => dispatch({ type: "add", ...trip })}
              >
                Add to Triplist
              </button>
            </div>
          </figcaption>
        </figure>
      </div>
  );
}

export default TripList;
