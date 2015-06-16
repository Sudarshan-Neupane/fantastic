package edu.mum.fantastic.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.fantastic.domain.Category;


@Repository
@Transactional(readOnly = true)
public interface CategoryRepository extends  CrudRepository<Category, Long>{
	
	@Query("SELECT c from categories c WHERE category_name = :categoryName")
	public Category findByCategoryName(@Param("categoryName") String categoryName);

}
