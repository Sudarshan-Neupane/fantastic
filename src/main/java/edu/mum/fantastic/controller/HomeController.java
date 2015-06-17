package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.sec.SpringUtils;
import edu.mum.fantastic.service.UserService;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/sec")
public class HomeController {

    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String login(Model model) {
        logger.info("Welcome home! The client is goint to login." + new Date());
        User user = userService.findByUserName(SpringUtils.getUserName());
        if (user.isFirstLogin()) {
            return "redirect:profile";
        }
        return "return:category";
    }

}
