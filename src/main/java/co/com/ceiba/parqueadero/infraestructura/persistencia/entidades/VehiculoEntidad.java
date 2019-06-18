package co.com.ceiba.parqueadero.infraestructura.persistencia.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.com.ceiba.parqueadero.domain.Vehiculo;
import lombok.Data;


@Data
@Entity
@Table(name  =  "vehiculo")
public class VehiculoEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id  ;
	
	@Column(name = "placa")
	private String placa ;
	
	@Column(name = "tipo_vehiculo")
	private String tipoVehiculo  ;
	
	@Column(name = "fechaini")
	private Date fechaini ;
	
	@Column(name = "fechafin")
	private Date fechafin ;

	@Column(name = "horaini")
	private String horaini;
	
}
