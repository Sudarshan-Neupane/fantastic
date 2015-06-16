package edu.mum.fantastic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.fantastic.domain.Profile;


@Repository
@Transactional(readOnly = true)
public interface ProfileRepository extends CrudRepository<Profile, Long> {
	
	
//	public void UpdateProfile(@Param("categoryName") String categoryName);

}
