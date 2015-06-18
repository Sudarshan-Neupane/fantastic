package edu.mum.fantastic.controller;

import java.util.Date;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.fantastic.domain.Travel;
import edu.mum.fantastic.service.TravelService;
import java.util.List;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/sec")
public class TravelController {
    private static final Logger logger = LoggerFactory.getLogger(TravelController.class);
    @Autowired
    private TravelService travelService;

    /**
     *
     * @param travel
     * @return
     */
    @RequestMapping(value = "/travel", method = RequestMethod.GET)
    public String travel(@ModelAttribute Travel travel) {

        logger.info("The travel data has been inserted in the server" + new Date());
        return "travel";
    }

    @RequestMapping(value = "/travel", method = RequestMethod.POST)
    public String addTravel(@Valid @ModelAttribute Travel travel, BindingResult result) {
        if (result.hasErrors()) {
            return "travel";
        }
        travelService.add(travel);
        return "redirect:travelList";
    }
    
    @RequestMapping(value="/travelList",method=RequestMethod.GET)
    public String displayList(Model model){
        List<Travel> lists= travelService.findAll();
        model.addAttribute("travellist",lists);
        return "travelList";
    }

}
