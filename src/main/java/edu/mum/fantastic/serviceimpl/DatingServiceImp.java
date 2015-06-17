package edu.mum.fantastic.serviceimpl;

import edu.mum.fantastic.domain.Dating;
import edu.mum.fantastic.repository.DatingRepository;
import edu.mum.fantastic.service.DatingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class DatingServiceImp implements DatingService {

    @Autowired
    public DatingRepository datingRepository;
    
    @Override
    public void add(Dating t) {
        this.datingRepository.save(t);
    }

    @Override
    public void update(Dating t) {
        this.datingRepository.save(t);
    }

    @Override
    public void remove(Dating t) {
     this.datingRepository.delete(t);
    }

    @Override
    public List<Dating> findAll() {
        return null;
     
    }
    
}
