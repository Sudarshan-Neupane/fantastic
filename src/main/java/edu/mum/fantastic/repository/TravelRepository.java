package edu.mum.fantastic.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.fantastic.domain.Travel;

@Repository
@Transactional(readOnly = true)
public interface TravelRepository extends CrudRepository<Travel, Long> {
	
	@Query("SELECT t FROM travel t WHERE destination =:dest")
	public Travel findByDestination(@Param("dest") String destionation);

}
