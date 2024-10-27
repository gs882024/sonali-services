package com.sonali.app.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shyamsongoswami
 *
 */
@Entity
@Table(name = "SUPPLIER")
@Setter
@Getter
public class Supplier {
	
	@Id
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CONTPER")
	private String contper;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PHNO")
	private String phNo;
	
	@Column(name = "VAT")
	private String vat;
	
	@Column(name = "OPBAL")
	private BigDecimal opBal;
	
	@Column(name = "CLIMIT")
	private BigDecimal climit;
	
	@Column(name = "CBILL")
	private Integer cBill;
	
	@Column(name = "TOTBILL")
	private Integer totalBill;
	
	@Column(name = "CLEARBILL")
	private Integer clearBill;
	
	@Column(name = "STORE")
	private String store;
	
	@Column(name = "[USER]")
	private String user;
}
