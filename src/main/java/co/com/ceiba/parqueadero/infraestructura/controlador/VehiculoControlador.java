package co.com.ceiba.parqueadero.infraestructura.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.parqueadero.aplication.service.VehiculoService;
import co.com.ceiba.parqueadero.domain.Vehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VehiculoControlador {
	
	
	@Autowired
	private VehiculoService vehiculoService ;
	
	
	
	@PostMapping(value = "/registrarvehiculo")	
	public Vehiculo registrar(@RequestBody Vehiculo vehiculo) {
		System.err.println("validar fecha........" +  vehiculo.getFechaini());
		 return vehiculoService.registrar(vehiculo);
		
	}
	
	@GetMapping(value =  "/listavehiculos")		
	public List<Vehiculo> listar() {
		
	   return vehiculoService.listar();
	}
	

}
