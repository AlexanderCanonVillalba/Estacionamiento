package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parqueadero.domain.Vehiculo;

public class ParquearTest {

	@Test
	public void preparar() {
		
		// arrange
		VehiculoDataBuilder vehiculoDataBuilder  = new VehiculoDataBuilder();
		// act
		Vehiculo vehiculo  = vehiculoDataBuilder.construir();
		
		// asset
		assertNotNull(vehiculo);
		
	}
	
}
