package edu.mum.fantastic.service;

import java.util.List;

import edu.mum.fantastic.domain.Category;

public interface CategoryService extends AbstractService<Category>{

	public Category findByCategoryName(String categoryName);
	
	public Category findById(long Id);
	
	public List<Category> findAll();

}
