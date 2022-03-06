package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.FacturaSRI;

public interface IFacturaRepo {

	public void create(FacturaSRI factura);
	public FacturaSRI read(Integer id);
	public void update(FacturaSRI factura);
	public void delete(Integer id);
	
}
