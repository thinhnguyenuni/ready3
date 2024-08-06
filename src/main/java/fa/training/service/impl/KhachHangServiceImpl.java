/**
 * 
 */
package fa.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.models.KhachHang;
import fa.training.repository.KhachHangRepository;
import fa.training.service.KhachHangService;

//Đánh dấu lớp này là một service trong ứng dụng Spring
@Service
public class KhachHangServiceImpl implements KhachHangService {
	// Tự động inject KhachHangRepository để thực hiện các thao tác liên quan đến
	// KhachHang
	@Autowired
	KhachHangRepository repository;

	// Phương thức để lưu hoặc cập nhật thông tin của một khách hàng
	@Override
	public void saveOrUpdate(KhachHang khachHang) {
		// Kiểm tra nếu khách hàng là null thì in ra thông báo và trở về
		if (khachHang == null) {
			System.out.println("Không khởi tạo được đối tượng");
			return;
		}
		// Lưu hoặc cập nhật thông tin của khách hàng vào cơ sở dữ liệu
		repository.save(khachHang);
	}

	// Phương thức để lấy danh sách tất cả các khách hàng từ cơ sở dữ liệu
	@Override
	public List<KhachHang> findAll() {
		// Lấy danh sách tất cả các khách hàng từ repository
		List<KhachHang> list = repository.findAll();
		// Kiểm tra nếu danh sách rỗng thì in ra thông báo và trả về null
		if (list.isEmpty()) {
			System.out.println("Danh sách trống");
			return null;
		}
		// Trả về danh sách khách hàng
		return list;
	}

	// Phương thức để tìm một khách hàng dựa trên id
	@Override
	public KhachHang findByID(String id) {
		// Tìm và trả về khách hàng dựa trên id, hoặc trả về null nếu không tìm thấy
		return repository.findById(id).orElse(null);
	}

	// Phương thức kiểm tra xem có tồn tại một đối tượng KhuDoThi trong cơ sở dữ
	// liệu dựa trên id hay không
	@Override
	public boolean existByID(String id) {
		// Sử dụng phương thức existsById của repository để kiểm tra xem đối tượng có
		// tồn tại không
		return repository.existsById(id);
	}
}
