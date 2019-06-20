package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoEntidadDataBuilder;

public class VehiculoEntidadTest {

	
	@Test
	public void RegistroVehiculo() {
		VehiculoEntidadDataBuilder vehiculoDataBuilder = new VehiculoEntidadDataBuilder();
		vehiculoDataBuilder.id(1)
		.placa("TFD.643")
		.tipovehiculo("Carro")
		.fechaini(Calendar.getInstance().getTime())
		.horaini("4:50")
		.fechafin(Calendar.getInstance().getTime())
		.precio(new BigDecimal(1000));
		
		assertNotNull(vehiculoDataBuilder);
	}
}
