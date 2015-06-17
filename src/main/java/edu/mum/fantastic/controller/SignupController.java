package edu.mum.fantastic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.service.UserService;

@Controller
public class SignupController {

    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory
            .getLogger(SignupController.class);

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        model.addAttribute("user", new User());

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String runSignup(@ModelAttribute User user, Model model) {
        if (user.getFirstName().trim() == null || user.getLastName().trim() == null
                || user.getUserName().trim() == null || user.getPassword().trim() == null
                || user.getRePassword() == null) {
            model.addAttribute("errors", "Invalid values.");
            return "";
        }
        if (!user.getPassword().equals(user.getRePassword())) {
            model.addAttribute("errors", "Password does not match.");
            return "";
        }
        logger.info("User form without values.");
        userService.add(user);
        logger.info("redirect to /sec/home.");

        return "redirect:/sec/home";
    }
}