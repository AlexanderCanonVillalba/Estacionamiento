package co.com.ceiba.parqueadero.infraestructura.persistencia.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ticket")
public class TicketEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id  ;
	
	@ManyToOne
	@JoinColumn(name = "vehiculoid" , nullable = false)
	private VehiculoEntidad vehiculoEntidad ;
	
	@Column(name = "fechaini")
	private Date fechaini  ;
	
	@Column(name  =  "fechafin")
	private Date fechafin  ;
	
	@Column(name  =   "precio")
	private double precio  ;
}
