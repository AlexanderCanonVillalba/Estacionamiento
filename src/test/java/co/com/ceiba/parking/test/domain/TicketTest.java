package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.TicketDataBuilder;


public class TicketTest {

	
	@Test
	public void validarTicket() {
		
		
		TicketDataBuilder ticketDataBuilder  = new TicketDataBuilder();
		
		ticketDataBuilder.id(1)
				.vehiculoid(1)
				.fechaini(Calendar.getInstance().getTime())
				.fechafin(Calendar.getInstance().getTime())
				.precio(8000);
				
		
		assertNotNull(ticketDataBuilder);
				
		
	}
}
