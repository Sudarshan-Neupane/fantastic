package edu.mum.fantastic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.fantastic.domain.Category;
import edu.mum.fantastic.service.CategoryService;

/**
 *
 * @author gina
 */
 
@Controller
@RequestMapping(value = "/sec")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String listCategory(Model model) {
        List<Category> list = this.categoryService.findAll();
        model.addAttribute("categories", list);
        model.addAttribute("category", new Category());
        return "category";
    }
    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public String selectCategory(@ModelAttribute Category category, Model model) {
        List<Category> list = this.categoryService.findAll();
        model.addAttribute("categories", list);
        Category c = this.categoryService.findById(category.getId());
        if(c.getId() == 1){
            return "redirect:/sec/dating";
        }else if(c.getId() == 2){
            return "redirect:/sec/travel";
        }
        return "category";
    }

    @RequestMapping(value = {"/admin/category", "/admin/category/list"}, method = RequestMethod.GET)
    public String listOfCategory(Model model) {

        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "categoryList";
    }

    @RequestMapping(value = "/admin/category/add", method = RequestMethod.GET)
    public String getAddNewCategoryForm(Model model) {
        Category newCategory = new Category();
        model.addAttribute("newCategory", newCategory);
        return "addCategoryForm";
    }

    @RequestMapping(value = "/admin/category/add", method = RequestMethod.POST)
    public String getAddNewCategoryForm(@ModelAttribute("newCategory") @Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "addCategoryForm";
        }
        categoryService.add(category);
        return "redirect:/sec/admin/category/list";
    }

    @RequestMapping(value = "/admin/category/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editCategory(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("editCategoryForm");
        Category category = categoryService.findById(id);
        modelAndView.addObject("category", category);
        return modelAndView;
    }

    @RequestMapping(value = "/admin/category/edit/{id}", method = RequestMethod.POST)
    public String editCategory(@ModelAttribute Category category, @PathVariable Long id, final RedirectAttributes redirectAttributes) {
        String message = "Category was successfully updated.";
        categoryService.update(category);

        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/sec/admin/category/list";
    }

    @RequestMapping(value = "/admin/category/delete/{id}", method = RequestMethod.GET)
    public String deleteCategory(@PathVariable Long id, final RedirectAttributes redirectAttributes) {

        Category category = categoryService.findById(id);
        categoryService.remove(category);
        String message = "The Category " + category.getCategoryName() + " was successfully deleted.";

        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/sec/admin/category/list";
    }

}
