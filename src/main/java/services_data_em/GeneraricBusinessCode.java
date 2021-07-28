package services_data_em;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import service_data_api.DataAccessException;
import service_data_api.IDAO;

abstract class GeneraricBusinessCode<T> implements IDAO<T> {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void create(T entity) throws DataAccessException{
		em.persist(entity);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(T entity) throws DataAccessException{
		em.merge(entity);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void delete(T entity) throws DataAccessException{
		em.remove(entity);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public T getById(Class<T> objectClass, Integer id) {
		return em.find(objectClass, id);
		
	}

	@Transactional(value = TxType.REQUIRED)
	public abstract List<T> search(T entity) throws DataAccessException; 
}
