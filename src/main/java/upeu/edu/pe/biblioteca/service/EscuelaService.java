package upeu.edu.pe.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.interfaces.Operaciones;
import upeu.edu.pe.biblioteca.model.Escuela;
import upeu.edu.pe.biblioteca.repository.EscuelaRepository;

@Service
public class EscuelaService implements Operaciones<Escuela>{
	@Autowired
	private EscuelaRepository escuelaRepository;
	
	@Override
	public List<Escuela> listar() {
		// TODO Auto-generated method stub
		return escuelaRepository.findAll();
	}

	@Override
	public Escuela read(int id) {
		// TODO Auto-generated method stub
		return escuelaRepository.findById(id).get();
	}

	@Override
	public Escuela add(Escuela t) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(t);
	}

	@Override
	public Escuela edit(Escuela t) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		escuelaRepository.deleteById(id);
	}

}
