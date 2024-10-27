package com.sonali.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.app.entity.Supplier;
import com.sonali.app.repository.ProductRepository;
import com.sonali.app.repository.SupplierRepository;
import com.sonali.app.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService{
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public List<String> getDistinctBrand() {
		return productRepository.getDistinctBrand();
	}

	@Override
	public List<String> getDistinctCategories() {
		return productRepository.getDistinctCategories();
	}
	
	@Override
	public List<String> getDistinctSizes() {
		return productRepository.getDistinctSizes();
	}

	@Override
	public List<Supplier> getSuppliers() {
		return supplierRepository.findAll();
	}
	
}
