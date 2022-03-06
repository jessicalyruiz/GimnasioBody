package ec.edu.uce.service;

import ec.edu.uce.modelo.FacturaSRI;

public interface IFacturaService {

	public void create(FacturaSRI factura);
	public FacturaSRI read(Integer id);
	public void update(FacturaSRI factura);
	public void delete(Integer id);
}
