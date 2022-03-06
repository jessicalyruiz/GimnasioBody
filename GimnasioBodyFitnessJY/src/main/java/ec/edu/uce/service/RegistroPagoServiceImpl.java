package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.RegistroPago;
import ec.edu.uce.repository.IRegistroPagoRepo;

@Service
public class RegistroPagoServiceImpl implements IRegistroPagoService{

	@Autowired
	private IRegistroPagoRepo resgistroRepo;
	@Override
	public void create(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.resgistroRepo.create(registroPago);
	}

	@Override
	public RegistroPago read(Integer id) {
		// TODO Auto-generated method stub
		return this.resgistroRepo.read(id);
	}

	@Override
	public void update(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.resgistroRepo.update(registroPago);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.resgistroRepo.delete(id);
	}

}
