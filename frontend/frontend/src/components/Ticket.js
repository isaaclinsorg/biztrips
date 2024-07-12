import React from 'react';
import "./Ticket.css";

const Ticket = ({ ticket }) => {
    return (
        <div className="ticket">
            <h5>{ticket.title}</h5>
            <p>{ticket.description}</p>
            <p>Start: {ticket.startTrip}</p>
            <p>End: {ticket.endTrip}</p>
        </div>
    );
};

export default Ticket;
