package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.Dating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.fantastic.service.DatingService;

/**
 *
 * @author sudarshan
 */
@Controller
public class DatingController {
    
@Autowired
private DatingService datingService;

@RequestMapping(value="/dating",method=RequestMethod.GET)
public String dating(){
    return "dating";
    
}

}
