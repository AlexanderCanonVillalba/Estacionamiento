package co.com.ceiba.parqueadero.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;




@Component
public class Parquear {
	
	
	public void registrarEntrada(Vehiculo vehiculo) {
		
		System.err.println("saber" + vehiculo.getFechaini());
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
		System.err.println(".................."+dateFormat.format(vehiculo.getFechaini()));
		
		if(dateFormat.format(vehiculo.getFechaini()).equals("Sunday") ||dateFormat.format(vehiculo.getFechaini()).equals("Monday") )
			throw new RuntimeException("No se le permite la entrada a este vehículo, recuerde que los vehículos "
				+ "con placas empezadas por A sólo pueden ingresar los días Domingo y Lunes.");
		
	  
		
	}
	
	
	public void consultarReserva(List<Vehiculo> lisVehiculos) {
		
		  System.err.println(".......... total de carros" +
		 lisVehiculos.stream().filter(list -> list.getTipovehiculo().equals("Carro")).collect(Collectors.toList()).size());
		  
		 if ((lisVehiculos.stream().filter(list -> list.getTipovehiculo().equals("Carro")).collect(Collectors.toList()).size()) >= 20)	
		  throw new RuntimeException("No se permiten mas carros ");
		 
		 if ((lisVehiculos.stream().filter(list -> list.getTipovehiculo().equals("Motocicleta")).collect(Collectors.toList()).size()) >= 10)	
			  throw new RuntimeException("No se permiten mas Motocicletas ");
			
		 
	}
	
	
	public double calcularPrecio(Ticket ticketentrada) {
		
		return  0  ;
	}

}
