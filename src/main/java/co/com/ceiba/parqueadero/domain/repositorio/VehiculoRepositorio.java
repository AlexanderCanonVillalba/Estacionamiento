package co.com.ceiba.parqueadero.domain.repositorio;

import java.util.List;

import co.com.ceiba.parqueadero.domain.Vehiculo;

public interface VehiculoRepositorio {

	
	
	public Vehiculo registrar(Vehiculo vehiculo);
	
	public List<Vehiculo> Listado();
	
	public Vehiculo ConsultarId(long id);
	
	public Vehiculo eliminar(Vehiculo vehiculo);
	
}
