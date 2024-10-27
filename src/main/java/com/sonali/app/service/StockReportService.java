/**
 * 
 */
package com.sonali.app.service;

import java.util.List;

import com.sonali.app.dto.StockReportDto;
import com.sonali.app.request.ProductRequestResponse;

/**
 * @author shyamsongoswami
 *
 */
public interface StockReportService {

	List<StockReportDto> getStockReport(ProductRequestResponse productRequestResponse);

	List<StockReportDto> getSalesReport(ProductRequestResponse productRequestResponse);

}
