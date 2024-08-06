package fa.training.models.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SumInfoDTO {
	private String maHopDong;
	private String tenKH;
	private String bienSoXe;
	private LocalDate ngayHopDong;
	private BigDecimal giaTriHopDong;
	private LocalDate thoiHanHopDong;

	public SumInfoDTO(String maHopDong, String tenKH, String bienSoXe, LocalDate ngayHopDong, BigDecimal giaTriHopDong,
			LocalDate thoiHanHopDong) {
		this.maHopDong = maHopDong;
		this.tenKH = tenKH;
		this.bienSoXe = bienSoXe;
		this.ngayHopDong = ngayHopDong;
		this.giaTriHopDong = giaTriHopDong;
		this.thoiHanHopDong = thoiHanHopDong;
	}

	public SumInfoDTO() {
	}

	public String getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getBienSoXe() {
		return bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}

	public LocalDate getNgayHopDong() {
		return ngayHopDong;
	}

	public void setNgayHopDong(LocalDate ngayHopDong) {
		this.ngayHopDong = ngayHopDong;
	}

	public BigDecimal getGiaTriHopDong() {
		return giaTriHopDong;
	}

	public void setGiaTriHopDong(BigDecimal giaTriHopDong) {
		this.giaTriHopDong = giaTriHopDong;
	}

	public LocalDate getThoiHanHopDong() {
		return thoiHanHopDong;
	}

	public void setThoiHanHopDong(LocalDate thoiHanHopDong) {
		this.thoiHanHopDong = thoiHanHopDong;
	}

}
