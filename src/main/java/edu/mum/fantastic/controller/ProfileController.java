package edu.mum.fantastic.controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.fantastic.domain.Profile;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.service.UserService;

@Controller
public class ProfileController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String login(@ModelAttribute User user,Model model) {
		
		User u = this.userService.findByUserName("sneupane@gmail.com");
		user=this.userService.findByUserName("sneupane@gmail.com");
		if (u == null) {
			System.out.println("user is null");
			u = new User();
		}
		System.out.println(u.getUserName());
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		model.addAttribute("gender", Profile.Gender.values());
		model.addAttribute("interestedField", Profile.Category.values());
		return "profile";

	}
	@RequestMapping(value="/profileUpdate", method = RequestMethod.POST)
	public String updateProfile(@ModelAttribute User user)
	{
//		if(result.hasErrors())
//		{
//			return "profile";
//		}
//		else
//		{
			System.out.println(user.getFirstName());
			System.out.println(user.getProfile().getAddress().getAddress1());
			System.out.println(user.getProfile().getGender());
		//}
		return "home";
	}
	

}
