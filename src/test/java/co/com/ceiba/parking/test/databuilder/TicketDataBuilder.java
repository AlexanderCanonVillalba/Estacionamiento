package co.com.ceiba.parking.test.databuilder;

import java.util.Date;

import co.com.ceiba.parqueadero.domain.Ticket;

public class TicketDataBuilder {

	
	private  long id ;
	private  long vehiculoid ;
	private Date fechaini  ;
	private Date fechafin  ;
	private double precio  ;
	
	
	public  TicketDataBuilder id(long id) { 		
		this.id =  id  ;
		return  this ;
	}
	
	public TicketDataBuilder vehiculoid(long vehiculoid) {
		this.vehiculoid = vehiculoid; 
		return this;
		
	}
	
	public TicketDataBuilder fechaini(Date fechaini) {
		this.fechaini = fechaini;
		return this  ;
	}
	
	public TicketDataBuilder fechafin(Date fechafin) {
		this.fechafin = fechafin;
		return this;
	}
	
	public TicketDataBuilder precio(double precio) {
		this.precio = precio  ;
		return this ;
	}
	
	public Ticket build() {
		Ticket ticket = new Ticket();
		ticket.setId(1);
		ticket.setVehiculo(null);
		ticket.setFechaini(new Date());
		ticket.setFechafin(new Date());
		return ticket;
	}
}
