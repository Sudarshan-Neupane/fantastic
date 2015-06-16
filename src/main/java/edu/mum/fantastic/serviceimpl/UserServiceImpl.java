package edu.mum.fantastic.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.fantastic.domain.Authority;
import edu.mum.fantastic.domain.Authority.Role;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.repository.UserRepository;
import edu.mum.fantastic.service.UserService;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void add(User t) {
    	if(this.userRepository.findByUserName(t.getUserName())!= null){
    		throw new IllegalArgumentException("Invalid user.");
    	}
    	Authority auth = new Authority();
    	auth.setUsername(t.getUserName());
    	auth.setRole(Role.User);
    	t.setAuthority(auth);
        userRepository.save(t);
    }

    @Override
    public void update(User t) {
    	if(this.userRepository.findByUserName(t.getUserName())==null){
    		throw new IllegalArgumentException("Invalid user");
    	}
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

	@Override
	public void updateProfile(User user) {
		if(this.userRepository.findByUserName(user.getUserName()) == null){
			
		}
		if(user.getProfile() == null){
			
		}
		this.userRepository.save(user);
		
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
