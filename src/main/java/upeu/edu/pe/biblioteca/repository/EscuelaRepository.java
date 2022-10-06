package upeu.edu.pe.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.biblioteca.model.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Integer>{

}
