package edu.mum.fantastic.repository;

import edu.mum.fantastic.domain.User;

public interface UserRepository {
	
	public void add(User user);

	public void update(User user);

	public void remove(User user);

	public User findByUserName(String userName);
}
