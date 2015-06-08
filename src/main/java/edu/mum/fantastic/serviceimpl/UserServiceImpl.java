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
		try {
			userRepository.add(t);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
	}

	@Override
	public void update(User t) {
		try {
			userRepository.update(t);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}

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
		User user = null;
		try {
			user = userRepository.findByUserName(userName);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		return user;
	}
}
