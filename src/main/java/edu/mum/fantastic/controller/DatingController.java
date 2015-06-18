package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.Dating;
import edu.mum.fantastic.domain.Profile;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.sec.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.fantastic.service.DatingService;
import edu.mum.fantastic.service.UserService;
import java.util.List;
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
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String dating(@ModelAttribute Dating dating, Model model) {
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("ageGroup", Dating.InterestedAge.values());
        return "dating";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addDating(@Valid @ModelAttribute Dating dating, BindingResult result) {
        if (result.hasErrors()) {
            return "dating";
        }
        User user = this.userService.findByUserName(SpringUtils.getUserName());
        dating.setUser(user);
        this.datingService.add(dating);
        return "redirect:list";
    }
    
    @RequestMapping(value="/datinglist", method=RequestMethod.GET)
    public String datingList(Model model){
        List<Dating> datingList = datingService.findAll();
        model.addAttribute("datinglist",datingList);
        return "datingList";
    }

}
