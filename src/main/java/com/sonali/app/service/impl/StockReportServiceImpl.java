/**
 * 
 */
package com.sonali.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.app.dto.StockReportDto;
import com.sonali.app.repository.StockReportRepository;
import com.sonali.app.request.ProductRequestResponse;
import com.sonali.app.service.StockReportService;

/**
 * @author shyamsongoswami
 *
 */
@Service
public class StockReportServiceImpl implements StockReportService {

	@Autowired
	private StockReportRepository stockReportRepository;
	
	@Override
	public List<StockReportDto> getStockReport(ProductRequestResponse productRequestResponse) {
		List<StockReportDto> stockReportDtos = stockReportRepository.getStockReport(productRequestResponse.getPCode(), productRequestResponse.getProductName(), productRequestResponse.getGrp(), productRequestResponse.getSize(), productRequestResponse.getBrand());
;
		
		if(productRequestResponse.isOfsFlag())
			return stockReportDtos.stream().filter(obj -> obj.getQoh() <= 0).collect(Collectors.toList());
		else
			return stockReportDtos.stream().filter(obj -> obj.getQoh() > 0).collect(Collectors.toList());
	}

	@Override
	public List<StockReportDto> getSalesReport(ProductRequestResponse productRequestResponse) {
		return stockReportRepository.getSalesReport(productRequestResponse.getProductName(), productRequestResponse.getGrp(), productRequestResponse.getBrand(), productRequestResponse.getFromDate(), productRequestResponse.getToDate());
	}

}
