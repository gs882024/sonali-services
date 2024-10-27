/**
 * 
 */
package com.sonali.app.service;

import java.util.List;

import com.sonali.app.entity.Supplier;

/**
 * @author shyamsongoswami
 *
 */
public interface MasterService {

	List<String> getDistinctBrand();
	List<String> getDistinctCategories();
	List<String> getDistinctSizes();
	List<Supplier> getSuppliers();
}
