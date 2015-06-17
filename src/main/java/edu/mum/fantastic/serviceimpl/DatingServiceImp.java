package edu.mum.fantastic.serviceimpl;

import edu.mum.fantastic.domain.Dating;
import edu.mum.fantastic.repository.DatingRepository;
import edu.mum.fantastic.service.DatingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sudarshan
 */
@Service
@Transactional
class DatingServiceImp implements DatingService {

    @Autowired
    public DatingRepository datingRepository;
    
    @Override
    public void add(Dating t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Dating t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Dating t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dating> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
