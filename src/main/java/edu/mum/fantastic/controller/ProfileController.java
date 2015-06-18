package edu.mum.fantastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.fantastic.domain.Profile;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.sec.SpringUtils;
import edu.mum.fantastic.service.UserService;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/sec")
public class ProfileController {

    @Autowired
    private UserService userService;
    private static final Logger logger = Logger.getLogger(ProfileController.class.getName());

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String login(Model model) {

        User user = this.userService.findByUserName(SpringUtils.getUserName());
        if (user == null) {
            System.out.println("user is null");
            user = new User();
        }
        System.out.println(user.getUserName());
        System.out.println(user.getUserName());
        Profile profile;
        model.addAttribute("user", user);
        if (user.getProfile() == null) {
            profile = new Profile();
        } else {
            profile = user.getProfile();
        }
        model.addAttribute("profile", profile);
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("interestedField", Profile.Category.values());
        return "profile";

    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String updateProfile(@Valid @ModelAttribute Profile profile, BindingResult result, Model model) {
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("interestedField", Profile.Category.values());
        if (result.hasErrors()) {
            logger.info("profile update contains error");
            model.addAttribute("gender", Profile.Gender.values());
            model.addAttribute("interestedField", Profile.Category.values());
            return "profile";
        }
        logger.info("no error in profile update");
        User user = this.userService.findByUserName(SpringUtils.getUserName());
        user.setProfile(profile);
        try {
            this.userService.updateProfile(user);
        } catch (IllegalArgumentException ex) {
            logger.info("exception occured in profile update");
            System.out.println(ex.getMessage());
            model.addAttribute("errors", ex.getMessage());
            return "profile";
        }
        return "redirect:home";
    }

}
