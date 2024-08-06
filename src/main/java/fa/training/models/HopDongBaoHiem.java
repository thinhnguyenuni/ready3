package fa.training.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class HopDongBaoHiem {
	
	@Id
	private String maHopDong;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private KhachHang khachHang;
	
	private String bienSoXe;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayHopDong;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate thoiHanHopDong;
	
	private BigDecimal giaTriHopDong;
	private BigDecimal giaTriThanhToan;
	
	public HopDongBaoHiem() {
	}

	public HopDongBaoHiem(String maHopDong, KhachHang khachHang, String bienSoXe, LocalDate ngayHopDong,
			LocalDate thoiHanHopDong, BigDecimal giaTriHopDong, BigDecimal giaTriThanhToan) {
		this.maHopDong = maHopDong;
		this.khachHang = khachHang;
		this.bienSoXe = bienSoXe;
		this.ngayHopDong = ngayHopDong;
		this.thoiHanHopDong = thoiHanHopDong;
		this.giaTriHopDong = giaTriHopDong;
		this.giaTriThanhToan = giaTriThanhToan;
	}

	public String getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
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

	public LocalDate getThoiHanHopDong() {
		return thoiHanHopDong;
	}

	public void setThoiHanHopDong(LocalDate thoiHanHopDong) {
		this.thoiHanHopDong = thoiHanHopDong;
	}

	public BigDecimal getGiaTriHopDong() {
		return giaTriHopDong;
	}

	public void setGiaTriHopDong(BigDecimal giaTriHopDong) {
		this.giaTriHopDong = giaTriHopDong;
	}

	public BigDecimal getGiaTriThanhToan() {
		return giaTriThanhToan;
	}

	public void setGiaTriThanhToan(BigDecimal giaTriThanhToan) {
		this.giaTriThanhToan = giaTriThanhToan;
	}

	
	

	
}
