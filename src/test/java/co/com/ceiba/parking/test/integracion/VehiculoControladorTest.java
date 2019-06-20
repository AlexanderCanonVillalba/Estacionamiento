package co.com.ceiba.parking.test.integracion;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ceiba.parking.test.databuilder.VehiculoDataBuilder;
import co.com.ceiba.parqueadero.Start;
import co.com.ceiba.parqueadero.domain.Vehiculo;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = Start.class)
@AutoConfigureMockMvc
public class VehiculoControladorTest {

	@Autowired
	private WebApplicationContext context;
	private MockMvc mvc;

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void listarVehiculos() throws Exception {
		mvc.perform(get("/api/listavehiculos").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().is2xxSuccessful());

	}
	
	
	/*
	@Test
	public void registrarVehiculos() throws Exception {
		Vehiculo vehiculo = new VehiculoDataBuilder().buil();
		mvc.perform(post("/registrarvehiculo").content(asJsonString(vehiculo)).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().is2xxSuccessful());

	}
	
	
	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	*/
	
}
