package edu.mum.fantastic.service;

import edu.mum.fantastic.domain.Travel;

public interface TravelService extends AbstractService<Travel> {
	public Travel findTravelByDestination(String dest);
}
