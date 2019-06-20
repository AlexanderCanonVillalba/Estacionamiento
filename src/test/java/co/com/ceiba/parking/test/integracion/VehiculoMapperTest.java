package co.com.ceiba.parking.test.integracion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parking.test.databuilder.VehiculoEntidadDataBuilder;
import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.VehiculoEntidad;
import co.com.ceiba.parqueadero.infraestructura.persistencia.mapper.VehiculoMapper;

public class VehiculoMapperTest {
	
	private Vehiculo vehiculo;
	private VehiculoEntidad vehiculoEntidad;
	
	VehiculoDataBuilder vehiculoTestBuilder;
	VehiculoEntidadDataBuilder vehiculoEntityTestDataBuilder;

	@Before
	public void setup() {
		vehiculoTestBuilder = new VehiculoDataBuilder();
		vehiculoEntityTestDataBuilder = new VehiculoEntidadDataBuilder();
	}
	
	@Test
	public void vehiculoDominioAVehiculoEntidad() {
		vehiculo = vehiculoTestBuilder.buil();
		vehiculoEntidad = VehiculoMapper.entidad(vehiculo);
		assertEquals(vehiculo.getPlaca(),vehiculoEntidad.getPlaca());			
		assertEquals(vehiculo.getTipovehiculo() , vehiculoEntidad.getTipoVehiculo());
		assertEquals(vehiculo.getId(), vehiculoEntidad.getId());
		assertEquals(vehiculo.getFechaini(), vehiculoEntidad.getFechaini());
		assertEquals(vehiculo.getHoraini(), vehiculoEntidad.getHoraini());
		
		assertNotNull(vehiculoEntidad);
		assertNotNull(vehiculo);
	}
	

}
