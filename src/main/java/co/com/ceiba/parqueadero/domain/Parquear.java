package co.com.ceiba.parqueadero.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;




@Component
public class Parquear {
	
	
	public void registrarEntrada(Vehiculo vehiculo) {
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(vehiculo.getFechaini());
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
		
		if(vehiculo.getPlaca().substring(0 , 1).equals("A"))
		if( (!dateFormat.format(calendar.getTime()).equals("Sunday"))  && (!dateFormat.format(calendar.getTime()).equals("Monday")) )
			throw new RuntimeException("No se le permite la entrada a este vehículo, recuerde que los vehículos "
				+ "con placas empezadas por A sólo pueden ingresar los días Domingo y Lunes."); 		
	     vehiculo.setFechaini(calendar.getTime());
		
	}
	
	
	public void consultarReserva(List<Vehiculo> lisVehiculos , String tipoVehiculo) {
		
		  
		  if(tipoVehiculo.equals("Motocicleta")) {			  
			  consultarReservaMotocicleta(lisVehiculos);
             }
	    else {
	    	consultarReservaCarro(lisVehiculos);
			  }
		 
			
		 
	}
	
	
	public void consultarReservaCarro(List<Vehiculo> lisVehiculos) {
		if ((lisVehiculos.stream().filter(list -> list.getTipovehiculo().equals("Carro")).collect(Collectors.toList()).size()) >= 20)	
			  throw new RuntimeException("No se permiten mas carros ");
			 
			
	}
	
	public void consultarReservaMotocicleta(List<Vehiculo> lisVehiculos) {
		
		 if ((lisVehiculos.stream().filter(list -> list.getTipovehiculo().equals("Motocicleta")).collect(Collectors.toList()).size()) >= 10)	
			  throw new RuntimeException("No se permiten mas Motocicletas ");
	}
	
	
	
	public Vehiculo salidaVehiculo(Vehiculo vehiculo) {
		
		
		
		return vehiculo;
	}
	
	public static double calcularPrecio(Vehiculo vehiculo) {
		
		double valor =  0 ;
		long valorHoraCarro  =  1000;
		long valorHoraMoto  =  500 ;
		long valorDiaMoto  =  4000  ;
		long valorDiaCarro  =  8000 ;
		
		vehiculo.setPrecio(BigDecimal.ZERO);
		 horaCarro(vehiculo  , valorHoraCarro);
		
		return  0  ;
	}

	private static  void horaCarro(Vehiculo vehiculo , long valorHoraCarro) {
		Calendar calendar = Calendar.getInstance() ;
		
		double valor =  0 ;
		BigDecimal valorCarro  =   BigDecimal.ZERO ;
		
		int count =  0 ;
		int horaini =   Integer.parseInt(vehiculo.getHoraini().substring(0,1));
		int horafin =   calendar.get(Calendar.HOUR);
		int horasParqueada  =  0  ;
		 for (int i = horaini; i < horafin; i++) {
			 System.err.println();
			valorCarro = valorCarro.add(new BigDecimal(1000)) ;
		}
		vehiculo.setPrecio(valorCarro);
	    	
	}
	
	
	
}
