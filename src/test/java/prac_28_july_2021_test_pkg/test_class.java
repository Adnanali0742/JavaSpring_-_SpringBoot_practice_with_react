package prac_28_july_2021_test_pkg;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import prac_28_july_2021_datamodels.Houses;
import service_data_api.DataAccessException;
import service_data_api.IHouses;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
@Commit
public class test_class {
	
	@Inject
	IHouses ihouses;
	
	@Test
	@Transactional
	public void test() throws DataAccessException{
//		Houses houses = new Houses("Brand New House",
//				"Adnan Ali",
//				"July 21, 2021",
//				"Appartment",
//				"03349962422",
//				8000000);
//		ihouses.create(houses);
		
		
//		// delete by id
//		Houses house = ihouses.getById(Houses.class, Integer.valueOf(1));
//		ihouses.delete(house);
		
	}

}
