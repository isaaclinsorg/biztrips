import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class  TicketListComponent implements OnInit {
  tickets: any;
  constructor(private http: HttpClient) { }
  ngOnInit() {
    this.http.get('http://localhost:3000/tickets').subscribe((data: any) => {
      this.tickets = data;
    });
  }
  bookTicket(ticket: any) {
    this.http.post('http://localhost:3000/book', { ticketId: ticket._id }).subscribe((data: any) => {
      alert(data.message);
      this.ngOnInit();
    });
  }
}
