package ec.edu.uce.service;

import ec.edu.uce.modelo.Membresia;

public interface IMembresiaService {


	public void create(Membresia membresia);
	public Membresia read(Integer id);
	public void update(Membresia membresia);
	public void delete(Integer id);
	
	public Membresia buscarCodigo(String codigo);
	public void pagarMembresia(String cedula, String codigo);
}
