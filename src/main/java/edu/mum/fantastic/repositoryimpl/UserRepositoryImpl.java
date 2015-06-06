package edu.mum.fantastic.repositoryimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.repository.UserRepository;

@Service
public class UserRepositoryImpl implements UserRepository {
	private Map<String, User> list = new HashMap<String, User>();

	@Override
	public void add(User user) {
		if (list.get(user.getUserName()) != null) {
			throw new IllegalArgumentException("User already exist.");
		}
		list.put(user.getUserName(), user);

	}

	@Override
	public void update(User user) {
		if (list.get(user.getUserName()) == null) {
			throw new IllegalArgumentException("User does not exist.");
		}
		list.put(user.getUserName(), user);

	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findByUserName(String userName) {
		if (list.get(userName) == null) {
			throw new IllegalArgumentException("User does not exist.");
		}
		return list.get(userName);
	}
}
