package co.com.ceiba.parqueadero.infraestructura.persistencia.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ceiba.parqueadero.domain.Vehiculo;
import co.com.ceiba.parqueadero.domain.repositorio.VehiculoRepositorio;
import co.com.ceiba.parqueadero.infraestructura.persistencia.mapper.VehiculoMapper;
import co.com.ceiba.parqueadero.infraestructura.persistencia.repositorio.jpa.VehiculoRepositorioJPA;

@Repository
@Transactional
public class VehiculoRepositorioImpl implements VehiculoRepositorio{

	@Autowired
	private VehiculoRepositorioJPA vehiculoRepositorioJPA;
	
	
	
	
	@Override
	public Vehiculo registrar(Vehiculo vehiculo) {
		
		return VehiculoMapper.domain(vehiculoRepositorioJPA.save(VehiculoMapper.entidad(vehiculo)));
	}

	@Override
	public List<Vehiculo> Listado() {
		// TODO Auto-generated method stub
		List<Vehiculo> listado  = vehiculoRepositorioJPA.findAll().stream().map(VehiculoMapper::domain).
				collect(Collectors.toList());
		return listado  ;
	}

	@Override
	public Vehiculo ConsultarId(long id) { 		
		return VehiculoMapper.domain(vehiculoRepositorioJPA.getOne(id));
	}

}
