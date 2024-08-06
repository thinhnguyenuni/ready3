package fa.training.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fa.training.models.HopDongBaoHiem;
import fa.training.models.dto.SumInfoDTO;

//Định nghĩa một interface HopDongBaoHiemRepository kế thừa từ JpaRepository,
//được sử dụng để thao tác với đối tượng HopDongBaoHiem trong cơ sở dữ liệu
public interface HopDongBaoHiemRepository extends JpaRepository<HopDongBaoHiem, String> {
	
	// Định nghĩa một phương thức truy vấn tùy chỉnh sử dụng JPQL để lấy danh sách các đối tượng HopDongBaoHiem dựa trên một chuỗi tìm kiếm
	@Query(value = "select md From HopDongBaoHiem md where md.id LIKE %?1%")
	// Phương thức này nhận vào một chuỗi tìm kiếm và một đối tượng Pageable để phục vụ cho việc phân trang
	Page<HopDongBaoHiem> findAllWithSearchHopDong(String searchInput, Pageable pageable);
	
	// Định nghĩa một phương thức truy vấn tùy chỉnh sử dụng JPQL để lấy danh sách
	// các đối tượng SumInfoDTO
	@Query(value = "select new fa.training.models.dto.SumInfoDT"
			+ "(hdbh.maHopDong, kh.tenKH,hdbh.bienSoXe,  "
			+ "hdbh.ngayHopDong, hdbh.giaTriHopDong, hdbh.thoiHanHopDong) " 
			+ "FROM HopDongBaoHiem hdbh "
			+ "JOIN hdbh.khachHang kh " 
			+ "WHERE kh.tenKH LIKE %?1%")
	// Phương thức này nhận vào một chuỗi tìm kiếm và một đối tượng Pageable để phục
	// vụ cho việc phân trang
	Page<SumInfoDTO> findAllWithSearch(String searchInput, Pageable pageable);
}

