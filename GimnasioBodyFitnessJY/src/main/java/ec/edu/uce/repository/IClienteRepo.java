package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {

	public void create(Cliente cliente);
	public Cliente read(Integer id);
	public void update(Cliente cliente);
	public void delete(Integer id);
	
	public Cliente buscarCedula(String cedula);
}
