package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parqueadero.domain.Parquear;
import co.com.ceiba.parqueadero.domain.Vehiculo;

public class ParquearTest {
	
	private Vehiculo vehiculo ;
	private Parquear Parquear;
	
	@Before
	public void Setup() {
		vehiculo = new Vehiculo();
		Parquear = new Parquear();
	}
	
	@Test
	public void  registrarEntrada() {
		VehiculoDataBuilder vehiculoDataBuilder = new VehiculoDataBuilder();
		List<Vehiculo> listavehiculos  = new ArrayList<Vehiculo>();
		Parquear.consultarReserva(listavehiculos, "Carro");
	}
        
	
}
