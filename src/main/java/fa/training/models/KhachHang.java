package fa.training.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class KhachHang {

	@Id
	private String maKH;

	@ManyToOne(fetch = FetchType.LAZY)
	private LoaiKhachHang loaiKhachHang;

	private String tenKH;
	private String soCMND;

	private String gioiTinh;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySinh;

	private String diaChi;

	@Pattern(regexp = "^(0\\d{9,10})$", message = "số điện thoại không hợp lệ")
	private String phone;

	@OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
	private List<HopDongBaoHiem> listHopDongBaoHiem;

	public KhachHang() {
	}

	public KhachHang(String maKH, LoaiKhachHang loaiKhachHang, String tenKH, String soCMND, String gioiTinh,
			LocalDate ngaySinh, String diaChi,
			@Pattern(regexp = "^(0\\d{9,10})$", message = "số điện thoại không hợp lệ") String phone) {

		this.maKH = maKH;
		this.loaiKhachHang = loaiKhachHang;
		this.tenKH = tenKH;
		this.soCMND = soCMND;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.phone = phone;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}

	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<HopDongBaoHiem> getListHopDongBaoHiem() {
		return listHopDongBaoHiem;
	}

	public void setListHopDongBaoHiem(List<HopDongBaoHiem> listHopDongBaoHiem) {
		this.listHopDongBaoHiem = listHopDongBaoHiem;
	}

}
