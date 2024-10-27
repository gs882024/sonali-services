package com.sonali.app.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PRODUCT")
@Setter
@Getter
@ToString
public class Product {
    
	@Id
	@Column(name = "PCODE")
	private String pCode;
	
	@Column(name = "P_NAME")
	private String productName;

	@Column(name = "GRP")
	private String grp;

	@Column(name = "COLOUR")
	private String color;

	@Column(name = "PUNIT")
	private String pUnit;

	@Column(name = "SUNIT")
	private String sUnit;

	@Column(name = "EQUNO")
	private int equNo;

	@Column(name = "MRP")
	private BigDecimal mrp;

	@Column(name = "P_RATE")
	private BigDecimal pRate;

	@Column(name = "T_RATE")
	private BigDecimal tRate;

	@Column(name = "QOH")
	private Integer qoh;

	@Column(name = "OPQOH")
	private int opQoh;

	@Column(name = "MIN_STOCK")
	private BigDecimal minStock;

	@Column(name = "SIZE")
	private String size;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "dis")
	private BigDecimal dis;

	@Column(name = "tax")
	private BigDecimal tax;

	@Column(name = "STOCKIN")
	private String stockIn;
	
	@Column(name = "DIST")
	private String dist;

	@Column(name = "tran")
	private String tran;

	@Column(name = "nt")
	private String nt;
	
	@Column(name = "dgn")
	private String expiry;
	
	@Column(name = "cgstp")
	private BigDecimal cgstp;
}