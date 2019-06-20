package co.com.ceiba.parking.test.databuilder;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.VehiculoEntidad;

public class VehiculoEntidadDataBuilder {
	
	
	private long id  ;
	private String placa   ;
	private String  tipovehiculo ;	
	private Date fechaini ;   	
	private Date fechafin ;    
	private String horaini;    	
	private BigDecimal precio  ;
	
	private static String PLACA_VEHICULO = "ACV-0123";
	private static String TIPO_VEHICULO = "Carro";
	
	public VehiculoEntidad buil() {
		VehiculoEntidad vehiculo  =  new VehiculoEntidad();
		vehiculo.setId(1);
		vehiculo.setPlaca(PLACA_VEHICULO);
		vehiculo.setFechaini(Calendar.getInstance().getTime());
		vehiculo.setHoraini("4:50");
		vehiculo.setFechafin(Calendar.getInstance().getTime());
		vehiculo.setTipoVehiculo(TIPO_VEHICULO);
		vehiculo.setPrecio(new BigDecimal(9000));
		return vehiculo ;
	}
	
	
	public VehiculoEntidadDataBuilder placa(String placa) {
		this.placa = placa  ;
		return this;
	}
	
	public VehiculoEntidadDataBuilder tipovehiculo(String vehiculo) {
		this.tipovehiculo = vehiculo;
		return this  ;
	}
	
	public VehiculoEntidadDataBuilder id(long id) {
		this.id = id;
		return this;
	}
	
	public VehiculoEntidadDataBuilder fechaini(Date fechaini) {
		this.fechaini  = fechaini ;
		return this;
	} 
	
	public VehiculoEntidadDataBuilder fechafin(Date fechafin) {
		this.fechafin = fechafin;
		return this;
	}
	
	public VehiculoEntidadDataBuilder horaini(String horaini) {
		this.horaini = horaini;
		return this;
	} 
	
	public VehiculoEntidadDataBuilder precio(BigDecimal precio) {
		this.precio = precio;
		return this;
	}
	
	

}
