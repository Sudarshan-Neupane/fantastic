/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.fantastic.repository;

import edu.mum.fantastic.domain.Dating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sudarshan
 */
@Repository
@Transactional(readOnly = true)
public interface DatingRepository extends CrudRepository<Dating,Long>
{
    
}
