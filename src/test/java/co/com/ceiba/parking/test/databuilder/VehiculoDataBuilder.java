package co.com.ceiba.parking.test.databuilder;

import static org.hamcrest.CoreMatchers.instanceOf;


import co.com.ceiba.parqueadero.domain.Vehiculo;

public class VehiculoDataBuilder {
	
	
	private static long ID  = 1 ;
	private static String PLACA    = "AD-123";
	private static String  VEHICULO   =  "Carro";
	

	private long id  ;
	private String placa   ;
	private String  vehiculo ;
	
	
	public VehiculoDataBuilder() {
	   this.id =  ID;
	   this.placa  = PLACA ;
	   this.vehiculo  = VEHICULO ;
	}
	
	
	public VehiculoDataBuilder placa(String placa) {
		this.placa  = placa  ;
		return this  ;
	}
	
	
	public VehiculoDataBuilder vehiculo(String vehiculo) {
		this.vehiculo  = vehiculo;
		return this  ;
	}
	
	
	public Vehiculo construir() {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(this.placa);		
		vehiculo.setTipoVehiculo(this.vehiculo);
		return vehiculo;
	}
}
