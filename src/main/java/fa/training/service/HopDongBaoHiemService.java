package fa.training.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fa.training.models.HopDongBaoHiem;
import fa.training.models.dto.SumInfoDTO;

//Định nghĩa một interface HopDongBaoHiemService để quản lý các thao tác liên quan đến đối tượng HopDongBaoHiem
public interface HopDongBaoHiemService {
	
	// Phương thức để lưu hoặc cập nhật thông tin của một đối tượng HopDongBaoHiem
	void saveOrUpdate(HopDongBaoHiem detail);

	// Phương thức để lấy danh sách tất cả các đối tượng HopDongBaoHiem từ cơ sở dữ liệu
	List<HopDongBaoHiem> findAll();

	// Phương thức để tìm một đối tượng HopDongBaoHiem dựa trên id
	HopDongBaoHiem findByID(String id);

	// Phương thức để xóa một đối tượng HopDongBaoHiem dựa trên id
	void deleteById(String id);

	// Phương thức để lấy danh sách các đối tượng HopDongBaoHiem theo trang từ cơ sở dữ liệu
	Page<HopDongBaoHiem> findAll(Pageable pageable);

	// Phương thức để lấy danh sách các đối tượng HopDongBaoHiem theo điều kiện tìm kiếm và phân trang
	Page<SumInfoDTO> findAllWithSearch(String searchInput, Pageable pageable);

	// Phương thức để kiểm tra xem một đối tượng HopDongBaoHiem có tồn tại trong cơ sở dữ liệu hay không dựa trên id
	boolean existByID(String id);
	
	
}

