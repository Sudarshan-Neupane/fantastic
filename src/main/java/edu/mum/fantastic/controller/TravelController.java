package edu.mum.fantastic.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TravelController {
	private static final Logger logger = LoggerFactory.getLogger(TravelController.class);
	
	@RequestMapping(value="/travel",method = RequestMethod.GET)
	public String travel(Model model){
		
		logger.info("The travel data has been inserted in"+ new Date());
		return "travel";
	}

}
