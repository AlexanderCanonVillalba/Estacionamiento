package co.com.ceiba.parqueadero.infraestructura.persistencia.repositorio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;


import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.VehiculoEntidad;



public interface VehiculoRepositorioJPA extends JpaRepository<VehiculoEntidad, Long>{

	
	//public VehiculoEntidad buscarPlaca(String licensePlate);
}
