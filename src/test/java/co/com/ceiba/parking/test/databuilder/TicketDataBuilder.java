package co.com.ceiba.parking.test.databuilder;

import java.util.Date;

public class TicketDataBuilder {

	
	private long id ;
	private long vehiculoid ;
	private Date fechaini  ;
	private Date fechafin  ;
	private double precio  ;
	
	
	private TicketDataBuilder id(long id) { 		
		this.id =  id  ;
		return  this ;
	}
}
