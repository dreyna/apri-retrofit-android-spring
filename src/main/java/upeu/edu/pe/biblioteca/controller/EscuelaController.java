package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.model.Escuela;
import upeu.edu.pe.biblioteca.service.EscuelaService;


@RestController
@CrossOrigin
@RequestMapping("/escuela")
public class EscuelaController {
	@Autowired
	private EscuelaService service;
	
	@GetMapping
    public ResponseEntity<List<Escuela>> getAll() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("{id}")
    public ResponseEntity<Escuela> getOne(@PathVariable("id") int id) {
        Escuela escuela = service.read(id);
        return ResponseEntity.ok(escuela);
    }

    @PostMapping
    public ResponseEntity<Escuela> create(@RequestBody Escuela esc) {        
        Escuela e = service.add(esc);
        return ResponseEntity.ok(e);
    }

    @PutMapping("{id}")
    public ResponseEntity<Escuela> update(@PathVariable("id") int id, @RequestBody Escuela esc) {
        Escuela escuela = service.read(id);
        escuela.setNombre(esc.getNombre());
        return ResponseEntity.ok(escuela);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") int id) {
        service.read(id);
        return "ok";
    }
}
