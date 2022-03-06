package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.RegistroPago;

@Repository
@Transactional
public class RegistroPagoImpl implements IRegistroPagoRepo{

	
	@PersistenceContext
	private EntityManager entityManager; 
	@Override
	public void create(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroPago);
	}

	@Override
	public RegistroPago read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(RegistroPago.class, id);
	}

	@Override
	public void update(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registroPago);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

}
