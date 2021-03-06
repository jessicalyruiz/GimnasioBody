package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;

public interface IClienteService {

	public void create(Cliente cliente);
	public Cliente read(Integer id);
	public void update(Cliente cliente);
	public void delete(Integer id);
	public Cliente buscarCedula(String cedula);
}
