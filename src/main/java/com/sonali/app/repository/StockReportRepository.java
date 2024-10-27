package com.sonali.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sonali.app.dto.StockReportDto;
import com.sonali.app.entity.Product;

@Repository
public interface StockReportRepository extends JpaRepository<Product, String> {

	@Query(value = ""
			+ "SELECT "
			+ "PCODE AS pCode, "
			+ "P_NAME AS productName, "
			+ "GRP, "
			+ "SIZE, "
			+ "BRAND, "
			+ "DGN AS expiry, "
			+ "COLOUR, "
			+ "MRP, "
			+ "QOH "
			
			+ "FROM "
			+ "PRODUCT "
			
			+ "WHERE "
			+ "((LTRIM(RTRIM(PCODE)) LIKE CONCAT('%', LTRIM(RTRIM(:pCode)), '%')) OR (:pCode IS NULL) OR (:pCode = '')) "
			+ "AND ((LTRIM(RTRIM(P_NAME)) LIKE CONCAT('%', LTRIM(RTRIM(:productName)), '%')) OR (:productName IS NULL) OR (:productName = '')) "
			+ "AND ((LTRIM(RTRIM(GRP)) LIKE CONCAT('%', LTRIM(RTRIM(:grp)), '%')) OR (:grp IS NULL) OR (:grp = '')) "
			+ "AND ((LTRIM(RTRIM(size)) LIKE CONCAT('%', LTRIM(RTRIM(:size)), '%')) OR (:size IS NULL) OR (:size = '')) "
			+ "AND ((LTRIM(RTRIM(brand)) LIKE CONCAT('%', LTRIM(RTRIM(:brand)), '%')) OR (:brand IS NULL) OR (:brand = '')) "

			+ "GROUP BY "
			+ "PCODE, P_NAME, GRP, SIZE, BRAND, DGN, COLOUR, MRP, QOH ", nativeQuery = true)
	List<StockReportDto> getStockReport(@Param("pCode") String pCode, @Param("productName") String productName, @Param("grp") String grp,
			@Param("size") String size, @Param("brand") String brand);


	@Query(value = "SELECT DISTINCT "
			+ "SM.BILLNO, "
			+ "SM.BILLDATE, "
			+ "ST.GRP, "
			+ "ST.BND AS brand, "
			+ "ST.ITEMS AS productName, "
			+ "ST.SIZE, "
			+ "ST.MRP, "
			+ "ST.QNTY AS qty, "
			+ "ST.asrate AS netAmt,"
			+ "(ST.asrate * ST.QNTY) AS totalAmt, "
			+ "PRD.QOH "

			+ "FROM "
			+ "SALEMAS AS SM, "
			+ "SALETRAN AS ST, "
			+ "PRODUCT AS PRD "
			
			+ "WHERE "
			+ "SM.BILLNO = ST.BILLNO "
			+ "AND ST.PCODE = PRD.PCODE "
			+ "AND ((SM.BILLDATE >= :fromDate) OR (:fromDate IS NULL) OR (:fromDate = '')) "
			+ "AND ((SM.BILLDATE <= :toDate) OR (:toDate IS NULL) OR (:toDate = '')) "
			+ "AND ((LTRIM(RTRIM(ST.ITEMS)) LIKE CONCAT('%', LTRIM(RTRIM(:productName)), '%')) OR (:productName IS NULL) OR (:productName = '')) "
			+ "AND ((LTRIM(RTRIM(ST.GRP)) LIKE CONCAT('%', LTRIM(RTRIM(:grp)), '%')) OR (:grp IS NULL) OR (:grp = '')) "
			+ "AND ((LTRIM(RTRIM(ST.BND)) LIKE CONCAT('%', LTRIM(RTRIM(:brand)), '%')) OR (:brand IS NULL) OR (:brand = '')) "
			
			+ "GROUP BY "
			+ "SM.BILLNO, SM.BILLDATE, ST.GRP, ST.BND, ST.ITEMS, ST.SIZE, ST.MRP, ST.QNTY, ST.asrate, PRD.QOH", nativeQuery = true)
	List<StockReportDto> getSalesReport(String productName, String grp, String brand, String fromDate, String toDate);
}
