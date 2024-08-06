package fa.training.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fa.training.models.HopDongBaoHiem;
import fa.training.service.HopDongBaoHiemService;
import fa.training.service.KhachHangService;

//Đánh dấu lớp này là một Controller trong Spring Framework và xác định route chính cho các phương thức trong Controller này
@Controller
@RequestMapping(value = "/hopdongbaohiem")
public class HopDongBaoHiemController {

	// Autowired để Spring tự động inject các instance của các service
	@Autowired
	private KhachHangService khachHangService;

	// Autowired để Spring tự động inject các instance của các service
	@Autowired
	private HopDongBaoHiemService hopDongBaoHiemService;

	// Danh sách các kích thước trang cho phân trang
	List<Integer> pageSizes = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 10));

	// Xử lý request GET đến đường dẫn "/hopdongbaohiem/create"
	@GetMapping("/create")
	public String getHopDongBaoHiem(Model model) {
		// Thêm một đối tượng HopDongBaoHiem mới vào Model để hiển thị trên view
		model.addAttribute("hopdongbaohiem", new HopDongBaoHiem());
		// Thêm các thông tin cần thiết vào Model
		model.addAttribute("urlPage", "/hopdongbaohiem/add");
//		model.addAttribute("jqPage", "hopdongbaohiem");
		// Trả về đường dẫn của view cơ sở (base view)
		return "/base/view";
	}

	// Xử lý request POST đến đường dẫn "/hopdongbaohiem/create"
	@PostMapping("/create")
	public String createHopDongBaoHiem(@ModelAttribute("hopdongbaohiem") @Validated HopDongBaoHiem hopDongBaoHiem,
			BindingResult result, Model model) {
		// Kiểm tra xem mã khu đô thị có tồn tại không, nếu không tồn tại thì reject giá
		// trị và thông báo lỗi
		if (!khachHangService.existByID(hopDongBaoHiem.getKhachHang().getMaKH())) {
			result.rejectValue("khachHang.maKH", "khachHang.idInvalid", "Mã khách hàng này không tồn tại");
		}

		// Nếu có lỗi thì trả về view tạo mới mẫu đất
		if (result.hasErrors()) {
			model.addAttribute("urlPage", "/hopdongbaohiem/add");
//			model.addAttribute("jqPage", "hopdongbaohiem");
			return "/base/view";
		}

		// Lưu hoặc cập nhật thông tin mẫu đất và chuyển hướng về danh sách giao dịch
		hopDongBaoHiemService.saveOrUpdate(hopDongBaoHiem);
		return "redirect:/giaodich/list";
	}
}
