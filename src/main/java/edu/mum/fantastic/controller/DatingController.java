package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.Dating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.fantastic.service.DatingService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

/**
 *
 * @author sudarshan
 */
@Controller
public class DatingController {

    @Autowired
    private DatingService datingService;

    @RequestMapping(value = "/dating", method = RequestMethod.GET)
    public String dating(@ModelAttribute Dating dating) {
        return "dating";

    }
    @RequestMapping(value = "/dating/", method = RequestMethod.POST)
    public String addDating(@Valid @ModelAttribute Dating dating, BindingResult result) {
        System.out.println("Print here mfggc");
        if (result.hasErrors()) {
            return "dating";
        }
        datingService.add(dating);
        return "redirect:dating";
    }

}
