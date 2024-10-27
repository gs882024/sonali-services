package com.sonali.app.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface StockReportDto {
	
	@JsonProperty("pCode")
	public String getPcode();
	
	@JsonProperty("productName")
	public String getProductName();
	
	@JsonProperty("size")
	public String getSize();
	
	@JsonProperty("category")
	public String getGrp();
	
	@JsonProperty("brand")
	public String getBrand();
	
	@JsonProperty("expiry")
	public String getExpiry();
	
	@JsonProperty("colour")
	public String getColour();
	
	@JsonProperty("qoh")
	public Integer getQoh();
	
	@JsonProperty("billNo")
	public String getBillNo();
	
	@JsonProperty("billDate")
	public LocalDate getBillDate();
	
	@JsonProperty("qty")
	public Integer getQty();
	
	
	@JsonProperty("mrp")
	public BigDecimal getMrp();
	
	
	@JsonProperty("amt")
	public BigDecimal getAmt();
	
	
	@JsonProperty("netAmt")
	public BigDecimal getNetAmt();
	
	@JsonProperty("totalAmt")
	public BigDecimal getTotalAmt();
}