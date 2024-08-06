package fa.training.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiKhachHang {

	@Id
	private String maLoaiKH;
	private String tenLoaiKH;
	private double chietKhau;

	@OneToMany(mappedBy = "loaiKhachHang", cascade = CascadeType.ALL)
	private List<KhachHang> listLoaiKhachHang;

	public LoaiKhachHang() {
	}

	public LoaiKhachHang(String maLoaiKH, String tenLoaiKH, double chietKhau) {
		this.maLoaiKH = maLoaiKH;
		this.tenLoaiKH = tenLoaiKH;
		this.chietKhau = chietKhau;
	}

	public String getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public String getTenLoaiKH() {
		return tenLoaiKH;
	}

	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}

	public double getChietKhau() {
		return chietKhau;
	}

	public void setChietKhau(double chietKhau) {
		this.chietKhau = chietKhau;
	}

	public List<KhachHang> getListLoaiKhachHang() {
		return listLoaiKhachHang;
	}

	public void setListLoaiKhachHang(List<KhachHang> listLoaiKhachHang) {
		this.listLoaiKhachHang = listLoaiKhachHang;
	}

}
