package com.sonali.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sonali.app.dto.StockReportDto;
import com.sonali.app.entity.Product;
import com.sonali.app.request.ProductRequestResponse;
import com.sonali.app.service.StockReportService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shyamsongoswami
 *
 */
@Slf4j
@RestController
@RequestMapping(value = "/reports/")
@CrossOrigin(origins = "*")
public class ReportController {

	@Autowired
	private StockReportService stockReportService;
	
	@PostMapping("stock-report")
	@ResponseStatus(HttpStatus.OK)
	public List<StockReportDto> getStockReport(@RequestBody ProductRequestResponse productRequestResponse) {
		log.info("inside getStockReport :: {}", productRequestResponse.toString());
		return stockReportService.getStockReport(productRequestResponse);
	}
	
	@PostMapping("sales-report")
	@ResponseStatus(HttpStatus.OK)
	public List<StockReportDto> getSalesReport(@RequestBody ProductRequestResponse productRequestResponse) {
		log.info("inside getSalesReport :: {}", productRequestResponse.toString());
		return stockReportService.getSalesReport(productRequestResponse);
	}
	
}
