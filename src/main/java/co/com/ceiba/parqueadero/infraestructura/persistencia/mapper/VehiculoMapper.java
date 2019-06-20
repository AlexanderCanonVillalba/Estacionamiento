package co.com.ceiba.parqueadero.infraestructura.persistencia.mapper;

import java.math.BigDecimal;

import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.VehiculoEntidad;

public class VehiculoMapper {

	
	public static Vehiculo domain(VehiculoEntidad vehiculoEntidad) {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setId(vehiculoEntidad.getId());
		vehiculo.setPlaca(vehiculoEntidad.getPlaca());
		vehiculo.setTipovehiculo(vehiculoEntidad.getTipoVehiculo());
		vehiculo.setFechaini(vehiculoEntidad.getFechaini());
		vehiculo.setHoraini(vehiculoEntidad.getHoraini());
		vehiculo.setPrecio(vehiculoEntidad.getPrecio());
		return vehiculo;
	}
	
	
	public static VehiculoEntidad entidad(Vehiculo vehiculo) {
		
		VehiculoEntidad vehiculoEntidad  = new VehiculoEntidad();
		vehiculoEntidad.setId(vehiculo.getId());
		vehiculoEntidad.setPlaca(vehiculo.getPlaca());
		vehiculoEntidad.setTipoVehiculo(vehiculo.getTipovehiculo());
		vehiculoEntidad.setFechaini(vehiculo.getFechaini());
		vehiculoEntidad.setHoraini(vehiculo.getHoraini());
		vehiculoEntidad.setPrecio(vehiculoEntidad.getPrecio());
		return vehiculoEntidad;
	}
}
