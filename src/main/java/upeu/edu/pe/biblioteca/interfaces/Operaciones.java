package upeu.edu.pe.biblioteca.interfaces;

import java.util.List;

public interface Operaciones<T> {
	public List<T> listar();
	public T read(int id);
	public T add(T t);
	public T edit(T t);
	public void delete(int id);
}
