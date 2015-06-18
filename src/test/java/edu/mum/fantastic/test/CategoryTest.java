package edu.mum.fantastic.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.fantastic.domain.Category;
import edu.mum.fantastic.service.CategoryService;


public class CategoryTest extends BaseTest {

	@Autowired
	private CategoryService categoryService;
	
	private static final String CATEGORYNAME = "Travel!";
	private static final int STATUS = 0;
	private static final int CHANGED_STATUS = 1;
        private static final String CATEGORYNAME1 = "Dating!";
        private static final String CATEGORYNAME2 = "Hangout!";
	
	
	@Before
	public void addCategoryTest() {
                Category category1 = new Category(CATEGORYNAME1, CHANGED_STATUS);
                Category category2 = new Category(CATEGORYNAME, STATUS);
                Category category3 = new Category(CATEGORYNAME2, CHANGED_STATUS);
		categoryService.add(category1);
                categoryService.add(category2);
                categoryService.add(category3);
		Category c = categoryService.findByCategoryName(CATEGORYNAME);
		System.out.println("cat: " + c.getCategoryName());
		Assert.assertEquals(CATEGORYNAME, c.getCategoryName());
	}

    @Test
	// @After(value = addUserTest)
	// @DependsOn(value = edu.mum.fantastic.test.UserTest.addUserTest)
	public void updateCategoryTest() {
		Category category = categoryService.findByCategoryName(CATEGORYNAME);
		category.setCategoryStatus(CHANGED_STATUS);
		categoryService.update(category);
		Category c = categoryService.findByCategoryName(CATEGORYNAME);
		System.out.println("Category status: "+c.getCategoryStatus());
		Assert.assertEquals(CHANGED_STATUS, c.getCategoryStatus());
	}
}
