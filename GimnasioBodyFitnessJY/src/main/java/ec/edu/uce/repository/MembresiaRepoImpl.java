package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(membresia);
	}

	@Override
	public Membresia read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Membresia.class, id);
	}

	@Override
	public void update(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(membresia);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Membresia buscarCodigo(String codigo) {
		TypedQuery< Membresia> myQuery=this.entityManager.createQuery("Select m from Membresia m where m.codigo=:valor", Membresia.class);
		myQuery.setParameter("valor", codigo);
		return myQuery.getSingleResult();
	}
}
