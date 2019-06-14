package co.com.ceiba.parqueadero.infraestructura.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.parqueadero.aplication.service.VehiculoService;
import co.com.ceiba.parqueadero.domain.Vehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/apli/vehiculo")
@Api(tags = "vehiculo")
public class VehiculoControlador {
	
	
	
	private VehiculoService vehiculoService ;
	
	public VehiculoControlador(VehiculoService vehiculoService) {
	  this.vehiculoService  =  vehiculoService ;
	}
	
	@GetMapping
	@ApiResponses(value = {
		@ApiResponse(code = 200 , message = "Vehiculo registrado") , @ApiResponse(code = 200 , message = "No se la logrado registrar , por favor verificar")
	})
	public ResponseEntity<Vehiculo> registrar(@RequestBody Vehiculo vehiculo) {
		 vehiculoService.registrar(vehiculo);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "/listavehiculos" , method  = RequestMethod.GET)
	@ApiResponses(value = {
			@ApiResponse(message = "Listado de vehiculos", code = 200), @ApiResponse(code = 200 , message = "No se ha encontrado ningun vehiculo")
	})
	public ResponseEntity<List<Vehiculo>> listar() {
		
		System.err.println("validandooooooooooo............");
		List<Vehiculo> vehiculos  = new ArrayList<Vehiculo>();
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("AC--309");
		vehiculo.setTipoVehiculo("Carro");
		vehiculos.add(vehiculo);
		
	   return new ResponseEntity<>(vehiculoService.listar(), HttpStatus.OK);
	}
	

}
