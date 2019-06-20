package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.TicketDataBuilder;
import co.com.ceiba.parqueadero.domain.Ticket;


public class TicketTest {

	
	private static long ID  =  1 ;
	private static Date FECHAINI = new Date();
	private static Date FECHAFIN = new Date();
	
	@Test
	public void validarTicket() {
		
		
		TicketDataBuilder ticketDataBuilder  = new TicketDataBuilder();
		Ticket ticket = ticketDataBuilder.build();
		ticketDataBuilder.id(1)
				.vehiculoid(1)
				.fechaini(new Date())
				.fechafin(new Date())
				.precio(8000);
				
		
		assertNotNull(ticketDataBuilder);
		assertNotNull(ticket);
		assertEquals(ID ,  ticket.getId());		
		
	}
}
