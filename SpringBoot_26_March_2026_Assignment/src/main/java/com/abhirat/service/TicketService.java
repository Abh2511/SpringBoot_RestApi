package com.abhirat.service;

import java.util.List;

import com.abhirat.binding.Passenger;
import com.abhirat.binding.Ticket;

public interface TicketService {
	
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();

}
