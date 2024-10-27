/**
 * 
 */
package com.sonali.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sonali.app.entity.Supplier;
import com.sonali.app.service.MasterService;

/**
 * @author shyamsongoswami
 *
 */
@RestController
@RequestMapping(value = "/master/")
@CrossOrigin(origins = "*")
public class MasterController {
	
	@Autowired
	private MasterService masterService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String ping() {
		return "Application Running";
	}
	
	@GetMapping("brands")
	@ResponseStatus(HttpStatus.OK)
	public List<String> getDistinctBrand() {
		return masterService.getDistinctBrand();
	}
	
	@GetMapping("categories")
	@ResponseStatus(HttpStatus.OK)
	public List<String> getDistinctCategories() {
		return masterService.getDistinctCategories();
	}
	
	@GetMapping("sizes")
	@ResponseStatus(HttpStatus.OK)
	public List<String> getDistinctSizes() {
		return masterService.getDistinctSizes();
	}
	
	@GetMapping("suppliers")
	@ResponseStatus(HttpStatus.OK)
	public List<Supplier> getSuppliers() {
		return masterService.getSuppliers();
	}
}
