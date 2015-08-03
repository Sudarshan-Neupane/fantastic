package edu.mum.fantastic.service;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.dto.ChangePassword;

public interface UserService extends AbstractService<User> {

    public User findByUserName(String userName);

    public void updateProfile(User user);

    public void changePassword(String username, ChangePassword cPassword);

}
