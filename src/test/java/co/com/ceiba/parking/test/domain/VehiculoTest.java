package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;

public class VehiculoTest {

	@Test
	public void validarVehiculo() {
		VehiculoDataBuilder vehiculoDataBuilder  =  new VehiculoDataBuilder();
		vehiculoDataBuilder.placa("AC-095").vehiculo("Carro");
		
		assertNotNull(vehiculoDataBuilder);
	}
	
}
