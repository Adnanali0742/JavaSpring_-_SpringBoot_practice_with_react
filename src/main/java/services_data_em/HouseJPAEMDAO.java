package services_data_em;

import java.util.List;

import javax.persistence.TypedQuery;

import prac_28_july_2021_datamodels.Houses;
import service_data_api.DataAccessException;
import service_data_api.IHouses;

public class HouseJPAEMDAO extends GeneraricBusinessCode<Houses> implements IHouses{

	@Override
	public List<Houses> search(Houses entity) throws DataAccessException {
		TypedQuery<Houses> query = em.createQuery("from Houses", Houses.class);
		System.out.println(query.getResultList());
		return query.getResultList();
	}
}
