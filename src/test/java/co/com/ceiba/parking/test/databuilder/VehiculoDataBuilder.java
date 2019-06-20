package co.com.ceiba.parking.test.databuilder;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import co.com.ceiba.parqueadero.domain.Vehiculo;



public class VehiculoDataBuilder {
	
	

	private long id  ;
	private String placa   ;
	private String  tipovehiculo ;	
	private Date fechaini ;   	
	private Date fechafin ;    
	private String horaini;    	
	private BigDecimal precio  ;
	
	public Vehiculo buil() {
		Vehiculo vehiculo  =  new Vehiculo();
		vehiculo.setId(1);
		vehiculo.setPlaca("ACV-0123");
		vehiculo.setFechaini(Calendar.getInstance().getTime());
		vehiculo.setHoraini("4:50");
		vehiculo.setFechafin(Calendar.getInstance().getTime());
		vehiculo.setTipovehiculo("Carro");
		vehiculo.setPrecio(new BigDecimal(9000));
		return vehiculo ;
	}
	
	
	public VehiculoDataBuilder placa(String placa) {
		this.placa = placa  ;
		return this;
	}
	
	public VehiculoDataBuilder tipovehiculo(String vehiculo) {
		this.tipovehiculo = vehiculo;
		return this  ;
	}
	
	public VehiculoDataBuilder id(long id) {
		this.id = id;
		return this;
	}
	
	public VehiculoDataBuilder fechaini(Date fechaini) {
		this.fechaini  = fechaini ;
		return this;
	} 
	
	public VehiculoDataBuilder fechafin(Date fechafin) {
		this.fechafin = fechafin;
		return this;
	}
	
	public VehiculoDataBuilder horaini(String horaini) {
		this.horaini = horaini;
		return this;
	} 
	
	public VehiculoDataBuilder precio(BigDecimal precio) {
		this.precio = precio;
		return this;
	}
	
	
	
}
