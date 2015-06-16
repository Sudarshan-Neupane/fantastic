package edu.mum.fantastic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/category")
public class CategoryController {

//	@Autowired
//	private CategoryService categoryService;

	@RequestMapping(value = { "/category/list", "/category" }, method = RequestMethod.GET)
	public String listOfCategory() {
		/*
		 * List<Category> categories = categoryService.findAll();
		 * model.addAttribute("categories", categories);
		 */
		return "category";
	}
	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public String
	 * addCategory(Model model) {
	 * 
	 * return ""; }
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public
	 * String addingOddzial(@ModelAttribute @Valid Category category,
	 * BindingResult result) { if (result.hasErrors()) { return "categoryform";
	 * } categoryService.add(category); return "redirect: /categoryList"; }
	 * 
	 * 
	 * @RequestMapping(value="/edit/{id}", method=RequestMethod.GET) public
	 * ModelAndView editOddzialPage(@PathVariable Long id) { ModelAndView
	 * modelAndView = new ModelAndView("edit-oddzial-form"); Category category =
	 * categoryService.findByCategoryId(id); modelAndView.addObject("category",
	 * category); return modelAndView; }
	 * 
	 * @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST) public
	 * String editCategory(@ModelAttribute Category category,
	 * 
	 * @PathVariable Long id) {
	 * 
	 * // categoryService.update(id);
	 * 
	 * return ""; }
	 */
}
