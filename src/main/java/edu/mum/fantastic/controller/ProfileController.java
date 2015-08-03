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
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/sec")
public class ProfileController {

    @Autowired
    private UserService userService;
    private static final Logger logger = Logger.getLogger(ProfileController.class.getName());

    @RequestMapping
    public void setImage(Model model){
        model.addAttribute("image", SpringUtils.getUserName() + ".jpg");
    }
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String login(Model model) {
        User user = this.userService.findByUserName(SpringUtils.getUserName());
        if (user == null) {
            user = new User();
        }
        Profile profile;
        model.addAttribute("user", user);
        if (user.getProfile() == null) {
            profile = new Profile();
        } else {
            profile = user.getProfile();
        }
        model.addAttribute("image", SpringUtils.getUserName() + ".jpg");
        model.addAttribute("profile", profile);
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("interestedField", Profile.Hobbies.values());
        return "profile";

    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String updateProfile(@Valid @ModelAttribute Profile profile, BindingResult result, Model model) {
        model.addAttribute("image", SpringUtils.getUserName() + ".jpg");
        model.addAttribute("gender", Profile.Gender.values());
        model.addAttribute("interestedField", Profile.Hobbies.values());
        if (result.hasErrors()) {
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

    @RequestMapping(value = "/profile/image/upload", method = RequestMethod.POST)
    public String uploadImage(@RequestParam("imageFile") MultipartFile uploadFile, Model model, HttpServletRequest request,
            HttpServletResponse response) {
        System.out.println(uploadFile.getName());
        String rootDirectory = request.getSession().getServletContext()
                .getRealPath("/");
        System.out.println("root directory: " + rootDirectory);
        model.addAttribute("image", SpringUtils.getUserName() + ".jpg");
        if (uploadFile != null && !uploadFile.isEmpty()) {
            try {
                uploadFile.transferTo(
                        new File(rootDirectory + "/resources/images/"
                                + SpringUtils.getUserName() + ".jpg"));
                System.out.println("Image uploaded");
            } catch (IOException | IllegalStateException e) {
                logger.info(e.getMessage());
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("file is empty");
        }
        return "redirect:/sec/profile";
    }

}
