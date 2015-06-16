package edu.mum.fantastic.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.fantastic.domain.Category;
import edu.mum.fantastic.repository.CategoryRepository;
import edu.mum.fantastic.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

    @Override
    public void add(Category t) {
    	categoryRepository.save(t);
    }

    @Override
    public void update(Category t) {
    	categoryRepository.save(t);

    }

    @Override
    public void remove(Category t) {
        // TODO Auto-generated method stub

    }


    public Category findByCategoryName(String categoryName) {
        if (categoryName.trim() == null) {
            throw new IllegalArgumentException("Invalid category name");
        }
        return categoryRepository.findByCategoryName(categoryName);
    }

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}
 


}
