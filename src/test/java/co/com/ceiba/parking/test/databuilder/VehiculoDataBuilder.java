package co.com.ceiba.parking.test.databuilder;



public class VehiculoDataBuilder {
	
	
	
	

	private long id  ;
	private String placa   ;
	private String  vehiculo ;
	
	

	
	public VehiculoDataBuilder placa(String placa) {
		this.placa  = placa  ;
		return this  ;
	}
	
	
	public VehiculoDataBuilder vehiculo(String vehiculo) {
		this.vehiculo  = vehiculo;
		return this  ;
	}
	
	
	public VehiculoDataBuilder id(long id) {
		this.id = id;
		return this ;
	}
}
