package com.abhirat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhirat.binding.Ticket;



public interface TicketRepository extends JpaRepository<Ticket,Integer>
{

}
