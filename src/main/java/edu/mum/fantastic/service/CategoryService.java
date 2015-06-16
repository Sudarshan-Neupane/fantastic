package edu.mum.fantastic.service;

import edu.mum.fantastic.domain.Category;

public interface CategoryService extends AbstractService<Category>{

	public Category findByCategoryName(String categoryName);


}
