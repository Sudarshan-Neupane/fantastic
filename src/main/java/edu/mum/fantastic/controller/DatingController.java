package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.Dating;
import edu.mum.fantastic.domain.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.fantastic.service.DatingService;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 *
 * @author sudarshan
 */
@Controller
@RequestMapping("/dating")
public class DatingController {

    @Autowired
    private DatingService datingService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String dating(@ModelAttribute Dating dating, Model model) {
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("ageGroup", Dating.InterestedAge.values());
        return "dating";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addDating(@Valid @ModelAttribute Dating dating, BindingResult result) {
        System.out.println("Print here mfggc");
        if (result.hasErrors()) {
            return "";
        }
        this.datingService.add(dating);
        return "redirect:list";
    }

}
