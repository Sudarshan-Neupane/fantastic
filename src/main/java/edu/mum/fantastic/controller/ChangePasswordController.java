package edu.mum.fantastic.controller;

import edu.mum.fantastic.domain.ChangePassword;
import edu.mum.fantastic.sec.SpringUtils;
import edu.mum.fantastic.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bipin
 */
@Controller
@RequestMapping("/sec")
public class ChangePasswordController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String changePassword(@ModelAttribute ChangePassword changePassword) {

        return "changePassword";
    }

    @RequestMapping(value = "/password", method = RequestMethod.POST)
    public String performChangePassword(@Valid @ModelAttribute ChangePassword changePassword, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "changePassword";
        }
        try {
            this.service.changePassword(SpringUtils.getUserName(), changePassword);
            model.addAttribute("msg", "Password changed successfully.");
        } catch (IllegalArgumentException ex) {
            model.addAttribute("error", ex.getMessage());
        }
        return "changePassword";
    }
}
