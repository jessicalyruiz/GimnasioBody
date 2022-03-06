package ec.edu.uce.repository;


import ec.edu.uce.modelo.Membresia;

public interface IMembresiaRepo {

	public void create(Membresia membresia);
	public Membresia read(Integer id);
	public void update(Membresia membresia);
	public void delete(Integer id);
	
	public Membresia buscarCodigo(String codigo);
}
