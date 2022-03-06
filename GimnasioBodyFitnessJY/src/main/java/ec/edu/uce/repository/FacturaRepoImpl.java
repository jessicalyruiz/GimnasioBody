package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.FacturaSRI;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo{

	private static final Logger LOG= (Logger) LoggerFactory.getLogger(FacturaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void create(FacturaSRI factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public FacturaSRI read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(FacturaSRI.class, id);
	}

	@Override
	public void update(FacturaSRI factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}
	
	
	
}
