package edu.mum.fantastic.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.fantastic.domain.Authority;
import edu.mum.fantastic.domain.Authority.Role;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.domain.ChangePassword;
import edu.mum.fantastic.repository.UserRepository;
import edu.mum.fantastic.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void add(User t) {
        if (this.userRepository.findByUserName(t.getUserName()) != null) {
            throw new IllegalArgumentException("Invalid user name.");
        }
        Authority auth = new Authority();
        auth.setUsername(t.getUserName());
        auth.setRole(Role.User);
        t.setAuthority(auth);
        t.setPassword(encryptString(t.getPassword()));
        userRepository.save(t);
    }

    @Override
    public void update(User t) {
        if (this.userRepository.findByUserName(t.getUserName()) == null) {
            throw new IllegalArgumentException("Invalid user");
        }
        t.setFirstLogin(false);
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
        if (this.userRepository.findByUserName(user.getUserName()) == null) {
            throw new IllegalArgumentException("Invalid user.");
        }
        if (user.getProfile() == null) {
            throw new IllegalArgumentException("Profile not found.");
        }
        user.setFirstLogin(false);
        this.userRepository.save(user);

    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    private String encryptString(String text) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(text);
    }

    @Override
    public void changePassword(String username, ChangePassword cPassword) {
        User user = this.userRepository.findByUserName(username);
        if(!user.getPassword().equals(encryptString(cPassword.getOldPassword()))){
            throw new IllegalArgumentException("Old password does not match.");
        }
        if(!cPassword.getNewPassword().equals(cPassword.getReNewPassword())){
            throw new IllegalArgumentException("New password and re-new password does not match.");
        }
        user.setPassword(encryptString(cPassword.getNewPassword()));
        this.userRepository.save(user);
    }
}
