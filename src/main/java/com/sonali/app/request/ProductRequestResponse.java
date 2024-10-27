package com.sonali.app.request;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductRequestResponse {
    
	@JsonProperty("pCode")
	private String pCode;
	
	@JsonProperty("productName")
	private String productName;
	
	@JsonProperty("category")
	private String grp;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("brand")
	private String brand;
	
	@JsonProperty("reportType")
	private String reportType;
	
	@JsonProperty("fromDate")
	private String fromDate;
	
	@JsonProperty("toDate")
	private String toDate;
	
	@JsonProperty("isOfsFlag")
	private boolean isOfsFlag;
	
	private String color;

	private String pUnit;

	private String sUnit;

	private int equNo;

	private BigDecimal mrp;

	private BigDecimal pRate;

	private BigDecimal tRate;

	private Integer qoh;

	private int opQoh;

	private BigDecimal minStock;

	private BigDecimal dis;

	private BigDecimal tax;

	private String stockIn;
	
	private String dist;

	private String tran;

	private String nt;
	
	private String expiry;
	
	private BigDecimal cgstp;
}