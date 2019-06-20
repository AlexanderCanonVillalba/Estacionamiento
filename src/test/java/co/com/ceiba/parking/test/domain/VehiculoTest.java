package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parqueadero.domain.Vehiculo;

public class VehiculoTest {

	private static String PLACA_VEHICULO = "ACV-0123";
	private static String TIPO_VEHICULO = "Carro";
	private static BigDecimal PRECIO_VEHICULO = new BigDecimal(9000);
	private static String HORA_INICIO = "4:50";
	
	@Test
	public void validarVehiculo() {
		VehiculoDataBuilder vehiculoDataBuilder  =  new VehiculoDataBuilder();
		vehiculoDataBuilder.id(5).
		 placa("AC-095")
		.tipovehiculo("Carro")
		.fechaini(new Date())
		.horaini("3:50")
		.fechafin(new Date())
		.precio(BigDecimal.ZERO);
		
		
		assertNotNull(vehiculoDataBuilder);
		
		
	}
	
	@Test
	public void BuilVehiculo() {
		VehiculoDataBuilder vehiculoDataBuilder = new VehiculoDataBuilder();		
		
		assertEquals(PLACA_VEHICULO, vehiculoDataBuilder.buil().getPlaca());
		assertEquals(TIPO_VEHICULO, vehiculoDataBuilder.buil().getTipovehiculo());
		assertEquals(HORA_INICIO, vehiculoDataBuilder.buil().getHoraini());
		assertEquals(PRECIO_VEHICULO, vehiculoDataBuilder.buil().getPrecio());
	}
	   
}
