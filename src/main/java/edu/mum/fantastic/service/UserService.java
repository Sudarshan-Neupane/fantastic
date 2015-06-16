package edu.mum.fantastic.service;

import edu.mum.fantastic.domain.User;

public interface UserService extends AbstractService<User> {

	public User findByUserName(String userName);

	public void updateProfile(User user);

}
