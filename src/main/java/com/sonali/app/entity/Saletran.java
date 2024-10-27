/**
 * 
 */
package com.sonali.app.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shyamsongoswami
 *
 */
//@Entity
@Table(name = "SALETRAN")
@Setter
@Getter
public class Saletran {

	@Column(name = "BILLNO")
	private int billNo;
	
	@Column(name = "ITEMS")
	private String items;
	
	@Column(name = "QNTY")
	private BigDecimal qnty;
	
	@Column(name = "FREE")
	private BigDecimal free;
	
	@Column(name = "batch")
	private String batch;
	
	@Column(name = "EXPDT")
	private String expDt;
	
	@Column(name = "MRP")
	private BigDecimal mrp;
	
	@Column(name = "RATE")
	private BigDecimal rate;
	
	@Column(name = "ED")
	private BigDecimal ed;
	
	@Column(name = "DIS")
	private BigDecimal dis;
	
	@Column(name = "TAX")
	private BigDecimal tax;
	
	@Column(name = "AMT")
	private BigDecimal amt;
	
	@Column(name = "UNIT")
	private String unit;
	
	@Column(name = "PCODE")
	private String pCode;
	
	@Column(name = "GRP")
	private String category;
	
	@Column(name = "BND")
	private String brand;
	
	@Column(name = "COLO")
	private String color;
	
	@Column(name = "SIZE")
	private String size;
	
	@Column(name = "TPRATE")
	private BigDecimal tpRate;
	
	@Column(name = "ASRATE")
	private BigDecimal asRate;
	
	@Column(name = "br")
	private String br;
	
	@Column(name = "SL1")
	private String sl1;
	
	@Column(name = "SL2")
	private String sl2;
	
	@Column(name = "SL3")
	private String sl3;
}
