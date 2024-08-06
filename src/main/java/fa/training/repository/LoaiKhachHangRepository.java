package fa.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.models.LoaiKhachHang;

//Định nghĩa một interface KhuDoThiRepository kế thừa từ JpaRepository,
//được sử dụng để thao tác với đối tượng KhuDoThi trong cơ sở dữ liệu
public interface LoaiKhachHangRepository extends JpaRepository<LoaiKhachHang, String> {

}

