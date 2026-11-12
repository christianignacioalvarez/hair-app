package ar.com.hairapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.hairapp.domain.Turno;
import ar.com.hairapp.repositories.TurnoRepository;

@Service
public class TurnoServiceImpl implements TurnoService {

	@Autowired
	private TurnoRepository repositorio;
	
	@Override
	public void guardar(Turno turno) {
		this.repositorio.save(turno);
	}

}
