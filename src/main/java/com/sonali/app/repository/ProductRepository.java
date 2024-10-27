package com.sonali.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sonali.app.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	@Query(value = "SELECT DISTINCT brand FROM Product ORDER BY brand ASC")
	List<String> getDistinctBrand();

	@Query(value = "SELECT DISTINCT grp FROM Product ORDER BY grp ASC")
	List<String> getDistinctCategories();
	
	@Query(value = "SELECT DISTINCT size FROM Product ORDER BY size ASC")
	List<String> getDistinctSizes();
	
}
