package edu.mum.fantastic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.fantastic.domain.Category;
import edu.mum.fantastic.service.CategoryService;

@Controller("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	/*
	 * @RequestMapping(value={"/list","/"}) public String listOfCategory(Model
	 * model) {
	 * 
	 * List<Category> categories = categoryService;
	 * model.addAttribute("categories", categories); return "/categoryList"; }
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addCategory(Model model) {

		return "";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addingOddzial(@ModelAttribute @Valid Category category,
			BindingResult result) {
		if (result.hasErrors()) {
			return "categoryform";
		}
		categoryService.add(category);
		return "redirect: /categoryList";
	}

	/*
	 * @RequestMapping(value="/edit/{id}", method=RequestMethod.GET) public
	 * ModelAndView editOddzialPage(@PathVariable Long id) { ModelAndView
	 * modelAndView = new ModelAndView("edit-oddzial-form"); Category category =
	 * categoryService.findByCategoryId(id); modelAndView.addObject("category",
	 * category); return modelAndView; }
	 */
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String editCategory(@ModelAttribute Category category,
			@PathVariable Long id) {

		// categoryService.update(id);

		return "";
	}

}
