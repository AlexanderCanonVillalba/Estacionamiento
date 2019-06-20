package co.com.ceiba.parqueadero.infraestructura.controlador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.parqueadero.aplication.service.VehiculoService;
import co.com.ceiba.parqueadero.domain.Vehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VehiculoControlador {
	
	
	@Autowired
	private VehiculoService vehiculoService ;
	
	
	
	@PostMapping(value = "/registrarvehiculo")	
	public ResponseEntity<?> registrar(@RequestBody Vehiculo vehiculo) {
	
		try {
			 return new ResponseEntity<Vehiculo>(vehiculoService.registrar(vehiculo), HttpStatus.OK);
		} catch (RuntimeException e) {					
		      Map<String, String> map  = new HashMap<String, String>();
		      map.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, String>>(map , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value =  "/listavehiculos")		
	public List<Vehiculo> listar() {		
	   return vehiculoService.listar();
	}
	
	
	@PostMapping(value = "/salida")	
	public ResponseEntity<?> salida(@RequestBody  Vehiculo vehiculo ){
		System.err.println("holaaaaaaaaaaa salida......" +  vehiculo.getPlaca() );   
		  Map<String, BigDecimal> map  = new HashMap<String, BigDecimal>();
	      map.put("mensaje", vehiculoService.salida(vehiculo).getPrecio());
	      vehiculoService.salida(vehiculo);
	      System.err.println("saber vehiculo................" + vehiculo.getPlaca());
		return new ResponseEntity< Map<String, BigDecimal>>(map , HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	

}
