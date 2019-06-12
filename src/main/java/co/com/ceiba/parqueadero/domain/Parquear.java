package co.com.ceiba.parqueadero.domain;

import java.util.Calendar;

import org.springframework.stereotype.Component;


@Component
public class Parquear {
	
	
	public Ticket registrarEntrada(Vehiculo vehiculo) {
		
		Ticket ticket  = new Ticket();
		ticket.setVehiculo(vehiculo.getId());
		ticket.setFechaini(Calendar.getInstance().getTime());
		return  ticket ;
	}
	
	
	public Ticket registrarSalida(Vehiculo vehiculo) {
		
		return null  ;
	}
	
	
	public double calcularPrecio(Ticket ticketentrada) {
		
		return  0  ;
	}

}
