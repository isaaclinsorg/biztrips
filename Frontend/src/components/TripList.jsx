import React, { useState } from "react";
import { getAllTickets } from "./tripsService";
import Ticket from "./Ticket";

// functional component TripList, deconstruct props!
function TripList({ dispatch }) {
  // State
  const [trips, setTrips] = useState([]);
  const [tickets, setTickets] = useState([]);

  const handleGetAllTickets = async () => {
    const ticketsData = await getAllTickets();
    setTickets(ticketsData);
  };

  const tripsMapped = trips.map((trip, index) => (
      <Trip dispatch={dispatch} trip={trip} key={trip.id} />
  ));

  const ticketsMapped = tickets.map((ticket, index) => (
      <Ticket ticket={ticket} key={ticket.id} />
  ));

  const emptyTrips = (
      <section>
        <p className="alert alert-info">Triplist is empty</p>
      </section>
  );

  return (
      <div className="container">
        <section>
          <h4 className="h4">E-Ticket buchen - Planned 2024</h4>
          <button onClick={handleGetAllTickets}>Tickets anzeigen</button>
          <div className="row">
            {tripsMapped.length > 0 ? tripsMapped : emptyTrips}
          </div>
          <div className="row">
            {ticketsMapped}
          </div>
        </section>
      </div>
  );
}

// deconstruct ...props
function Trip({ dispatch, trip }) {
  // Props
  let { id, title, description, startTrip, endTrip } = trip;

  return (
      <div className="col-sm-6 col-md-4 col-lg-3">
        <figure className="card card-product">
          <div className="img-wrap">
            <img src={"images/items/" + id + ".jpg"} alt="name " />
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
                <i /*className="fa fa-luggage-cart"*/ /> Add to Triplist
              </button>
            </div>
          </figcaption>
        </figure>
      </div>
  );
}

export default TripList;
