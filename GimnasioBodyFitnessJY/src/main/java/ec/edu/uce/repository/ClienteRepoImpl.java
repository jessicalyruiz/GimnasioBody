package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public Cliente read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Cliente clienteBorrar=this.read(id);
		this.entityManager.remove(clienteBorrar);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		TypedQuery<Cliente> myQuery=this.entityManager.createQuery("Select c From Cliente c where c.cedula=:valor", Cliente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
