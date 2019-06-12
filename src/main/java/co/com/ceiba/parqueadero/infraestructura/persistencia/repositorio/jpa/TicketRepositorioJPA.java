package co.com.ceiba.parqueadero.infraestructura.persistencia.repositorio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.parqueadero.infraestructura.persistencia.entidades.TicketEntidad;

public interface TicketRepositorioJPA extends JpaRepository<TicketEntidad, Long> {

}
