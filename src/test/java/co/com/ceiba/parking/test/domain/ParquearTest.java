package co.com.ceiba.parking.test.domain;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parqueadero.domain.Parquear;
import co.com.ceiba.parqueadero.domain.Vehiculo;

public class ParquearTest {
	
	@Test
	public void  registrarEntrada() {
		Vehiculo vehiculo = new Vehiculo();
		Parquear parquear = new Parquear();
		vehiculo.setPlaca("ACB-000");
		vehiculo.setTipovehiculo("Carro");
		vehiculo.setFechaini(new Date());
	//	parquear.registrarEntrada(vehiculo);
	}
        
	
}
