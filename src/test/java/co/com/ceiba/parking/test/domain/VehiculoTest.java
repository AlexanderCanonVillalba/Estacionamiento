package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;

public class VehiculoTest {

	@Test
	public void validarVehiculo() {
		VehiculoDataBuilder vehiculoDataBuilder  =  new VehiculoDataBuilder();
		vehiculoDataBuilder.placa("AC-095")
		.tipovehiculo("Carro")
		.fechaini(new Date());
		
		assertNotNull(vehiculoDataBuilder);
	}
	   
}
