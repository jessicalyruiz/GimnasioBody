package ec.edu.uce.service;

import ec.edu.uce.modelo.RegistroPago;

public interface IRegistroPagoService {

	public void create(RegistroPago registroPago);
	public RegistroPago read(Integer id);
	public void update(RegistroPago registroPago);
	public void delete(Integer id);
}
