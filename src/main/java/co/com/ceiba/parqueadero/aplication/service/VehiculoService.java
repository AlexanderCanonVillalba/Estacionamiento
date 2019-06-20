package co.com.ceiba.parqueadero.aplication.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.ceiba.parqueadero.domain.Parquear;
import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.domain.repositorio.VehiculoRepositorio;
import co.com.ceiba.parqueadero.infraestructura.persistencia.repositorio.VehiculoRepositorioImpl;

@Service
public class VehiculoService {

	private VehiculoRepositorio  vehiculoRepositorio ;
	
	public VehiculoService(VehiculoRepositorio vehiculoRepositorio) {
		this.vehiculoRepositorio = vehiculoRepositorio;
	}
	
	public Vehiculo registrar(Vehiculo vehiculo){
		  Parquear parquear = new Parquear();
		  parquear.registrarEntrada(vehiculo);	
		  parquear.consultarReserva(listar() , vehiculo.getTipovehiculo());
		return	vehiculoRepositorio.registrar(vehiculo);			
	}
	
	public List<Vehiculo> listar(){
		return vehiculoRepositorio.Listado();
	}
	 
	public Vehiculo salida(Vehiculo vehiculo) {
		
		//Parquear.calcularPrecio(vehiculo);
		vehiculo.setPrecio(BigDecimal.ZERO);
		System.err.println("precioooooo.... + " +  vehiculo.getPrecio());
		vehiculoRepositorio.eliminar(vehiculo);
		return vehiculo;
		
	}
	
}
