package co.com.ceiba.parqueadero.aplication.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import co.com.ceiba.parqueadero.domain.Parquear;
import co.com.ceiba.parqueadero.domain.Ticket;
import co.com.ceiba.parqueadero.domain.Vehiculo;

@Service
public class ParquearService {
	
   private Parquear parquear;
   
   
    public ParquearService() {
    	
    }
   
	
	public Vehiculo registrarEntrada(Vehiculo vehiculo) {
	   return  parquear.registrarEntrada(vehiculo);	
	}

	
	
	public Ticket registrarSalida(Vehiculo vehiculo) {
		return parquear.registrarSalida(vehiculo); 		
	}
	
	
	public double calcularPrecio(Ticket ticketEntrada) {
		return parquear.calcularPrecio(ticketEntrada);
	} 
}
