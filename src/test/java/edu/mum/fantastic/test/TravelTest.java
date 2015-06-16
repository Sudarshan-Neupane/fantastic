package edu.mum.fantastic.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.fantastic.domain.Travel;
import edu.mum.fantastic.service.TravelService;

public class TravelTest extends BaseTest {
	@Autowired
	private TravelService travel;

	private static final String DESTINATION = "Nepal";
	private static final String DESCRIPTION = "Lets go to nepal";
	private static final Date DATEFROM = new Date("2010/10/12");
	private static final Date DATETO = new Date("2010/12/12");

	@Test
	public void addTravelTest() {
		Travel t = new Travel(DESTINATION, DATEFROM, DATETO, DESCRIPTION);
		travel.add(t);
		Travel tv = travel.findTravelByDestination(DESTINATION);
		System.out.println("destination: " + tv.getDestination());
		Assert.assertEquals(DESTINATION, tv.getDestination());

	}

}
