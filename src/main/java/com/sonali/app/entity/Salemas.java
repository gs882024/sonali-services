/**
 * 
 */
package com.sonali.app.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

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
@Table(name = "SALEMAS")
@Setter
@Getter
public class Salemas {

	@Id
	@Column(name = "BILLNO")
	private int billNo;
	
	@Column(name = "BILLDATE")
	private LocalDate billDate;
	
	@Column(name = "BILLTIME")
	private LocalTime billTime;
	
	@Column(name = "CUSNAME")
	private String custName;
	
	@Column(name = "CUSADD")
	private String custAdd;
	
	@Column(name = "CUSDL")
	private String custDl;
	
	@Column(name = "BDIS")
	private int bDis;
	
	@Column(name = "BPP")
	private int bpp;
	
	@Column(name = "GAMT")
	private BigDecimal gAmt;
	
	@Column(name = "TDISC")
	private BigDecimal tDisc;
	
	@Column(name = "TTAX")
	private BigDecimal tTax;
	
	@Column(name = "TAMT")
	private BigDecimal tamt;
	
	@Column(name = "gmrp")
	private BigDecimal gmrp;
	
	@Column(name = "GED")
	private BigDecimal ged;
	
	@Column(name = "ADJ")
	private BigDecimal adj;
	
	@Column(name = "NETAMT")
	private BigDecimal netAmt;
	
	@Column(name = "NOT")
	private int not;
	
	@Column(name = "HLOT")
	private BigDecimal hLot;
	
	@Column(name = "LOT")
	private String lot;
	
	@Column(name = "MR")
	private String mr;
	
	@Column(name = "SM")
	private String sm;
	
	@Column(name = "crnno")
	private String crnno;
	
	@Column(name = "cdate")
	private OffsetDateTime cDate;
	
	@Column(name = "camt")
	private BigDecimal camt;
	
	@Column(name = "CLIMIT")
	private BigDecimal cLimit;
	
	@Column(name = "PENBILL")
	private int penBill;
	
	@Column(name = "PAYAMT")
	private BigDecimal payAmt;
	
	@Column(name = "crnno1")
	private int crnno1;
	
	@Column(name = "adjamt")
	private BigDecimal adjamt;
	
	@Column(name = "AREA")
	private String area;
	
	@Column(name = "TAX12")
	private BigDecimal tax12;
	
	@Column(name = "TAX4")
	private BigDecimal tax4;
	
	@Column(name = "TAX0")
	private BigDecimal tax0;
	
	@Column(name = "BASTAX12")
	private BigDecimal basTax12;
	
	@Column(name = "BASTAX4")
	private BigDecimal basTax4;
	
	@Column(name = "BASTAX0")
	private BigDecimal bastax0;
	
	@Column(name = "SPDIS")
	private BigDecimal spDis;
	
	@Column(name = "REMARKS")
	private String remarkds;
	
	@Column(name = "NETDIS")
	private BigDecimal netDis;
	
	@Column(name = "DOCNO")
	private String docNo;
	
	@Column(name = "STORE")
	private String store;
	
	@Column(name = "USER")
	private String user;
	
	@Column(name = "br")
	private String br;
	
	@Column(name = "GST5")
	private BigDecimal gst5;
	
	@Column(name = "GST12")
	private BigDecimal gst12;
	
	@Column(name = "GST18")
	private BigDecimal gst18;
	
	@Column(name = "GST28")
	private BigDecimal gst28;
}
