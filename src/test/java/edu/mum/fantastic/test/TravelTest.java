package edu.mum.fantastic.test;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.fantastic.domain.Travel;
import edu.mum.fantastic.service.TravelService;

public class TravelTest extends BaseTest {
	@Autowired
	private TravelService travel;

	private static final String DESTINATION = "Nepal";
	private static final String DESCRIPTION = "Lets go to nepal";
	private static final String DATEFROM = "10/12/2010";
	private static final String DATETO = "12/12/2010";

	@Test
	public void addTravelTest() {
		Travel t = new Travel(DESTINATION, DateHelper.formatDate(DATEFROM), DateHelper.formatDate(DATETO), DESCRIPTION);
		travel.add(t);
		Travel tv = travel.findTravelByDestination(DESTINATION);
		System.out.println("destination: " + tv.getDestination());
		Assert.assertEquals(DESTINATION, tv.getDestination());

	}
        
}
