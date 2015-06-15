package edu.mum.fantastic.repository;

import edu.mum.fantastic.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByUserName(String userName);
}
