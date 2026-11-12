package ar.com.hairapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.hairapp.domain.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer>{

}
