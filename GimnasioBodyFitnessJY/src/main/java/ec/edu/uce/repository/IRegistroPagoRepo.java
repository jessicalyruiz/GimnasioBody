package ec.edu.uce.repository;


import ec.edu.uce.modelo.RegistroPago;

public interface IRegistroPagoRepo {

	public void create(RegistroPago registroPago);
	public RegistroPago read(Integer id);
	public void update(RegistroPago registroPago);
	public void delete(Integer id);
}
