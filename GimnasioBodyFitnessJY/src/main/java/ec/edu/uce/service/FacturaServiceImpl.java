package ec.edu.uce.service;

//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;


import ec.edu.uce.modelo.FacturaSRI;
import ec.edu.uce.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;

	@Override
	public void create(FacturaSRI factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.create(factura);
	}

	@Override
	public FacturaSRI read(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepo.read(id);
	}

	@Override
	public void update(FacturaSRI factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.update(factura);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepo.delete(id);
	}
}
