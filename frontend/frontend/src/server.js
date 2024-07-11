const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const mongoose = require('mongoose');
const app = express();
const port = 3000;
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(cors());
mongoose.connect('mongodb://localhost:27017/ticketbooking');
const Schema = mongoose.Schema;
const TicketSchema = new Schema({
    event: String,
    date: Date,
    price: Number,
    available: Number
});
const Ticket = mongoose.model('Ticket', TicketSchema);
app.get('/tickets', (req, res) => {
    Ticket.find({}, (err, tickets) => {
        if (err) {
            console.log(err);
        } else {
            res.send(tickets);
        }
    });
});
app.post('/book', (req, res) => {
    Ticket.findById(req.body.ticketId, (err, ticket) => {
        if (err) {
            console.log(err);
        } else {
            if (ticket.available > 0) {
                ticket.available--;
                ticket.save((err) => {
                    if (err) {
                        console.log(err);
                    } else {
                        res.send({ message: 'Ticket booked successfully' });
                    }
                });
            } else {
                res.send({ message: 'No tickets available' });
            }
        }
    });
});
app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});