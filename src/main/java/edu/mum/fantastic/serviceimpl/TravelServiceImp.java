package edu.mum.fantastic.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.fantastic.domain.Travel;
import edu.mum.fantastic.repository.TravelRepository;
import edu.mum.fantastic.service.TravelService;

@Service
@Transactional
class TravelServiceImp implements TravelService {

	@Autowired
	public TravelRepository travelRepository;

	@Override
	public void add(Travel t) {
		// TODO Auto-generated method stub
		this.travelRepository.save(t);
	}

	@Override
	public void update(Travel t) {
		// TODO Auto-generated method stub
		this.travelRepository.save(t);
	}

	@Override
	public void remove(Travel t) {
		// TODO Auto-generated method stub
		this.travelRepository.delete(t);
	}


	@Override
	public Travel findTravelByDestination(String dest) {
		if (dest == null) {
			throw new IllegalArgumentException("Invalid travel id");
		}
		return travelRepository.findByDestination(dest);
	}

	@Override
	public List<Travel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
