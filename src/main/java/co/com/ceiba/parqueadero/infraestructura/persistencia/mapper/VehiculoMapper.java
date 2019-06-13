package co.com.ceiba.parqueadero.infraestructura.persistencia.mapper;

import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.VehiculoEntidad;

public class VehiculoMapper {

	
	public static Vehiculo domain(VehiculoEntidad vehiculoEntidad) {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setId(vehiculoEntidad.getId());
		vehiculo.setPlaca(vehiculoEntidad.getPlaca());
		vehiculo.setTipoVehiculo(vehiculoEntidad.getTipoVehiculo());
		
		return vehiculo;
	}
	
	
	public static VehiculoEntidad entidad(Vehiculo vehiculo) {
		
		VehiculoEntidad vehiculoEntidad  = new VehiculoEntidad();
		vehiculoEntidad.setId(vehiculo.getId());
		vehiculoEntidad.setPlaca(vehiculo.getPlaca());
		vehiculoEntidad.setTipoVehiculo(vehiculo.getTipoVehiculo());
		return vehiculoEntidad;
	}
}