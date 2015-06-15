package edu.mum.fantastic.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.repository.UserRepository;
import edu.mum.fantastic.service.UserService;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void add(User t) {
        userRepository.save(t);
    }

    @Override
    public void update(User t) {
        userRepository.save(t);

    }

    @Override
    public void remove(User t) {
        // TODO Auto-generated method stub

    }

    @Override
    public User findByUserName(String userName) {
        if (userName.trim() == null) {
            throw new IllegalArgumentException("Invalid User name");
        }
        return userRepository.findByUserName(userName);
    }
}
