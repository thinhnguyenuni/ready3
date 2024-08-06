jQuery(function() {
	$('.select2').select2();
	$("button[type='reset']").on("click", function() {
		$("span[id*='errors']").text("");
		$("div[class*='error']").text("");
		$(this).closest("form").find("input").removeAttr("value");
	});

	const mahopdong = $("#input-mahopdong");
	const makh = $("#input-makh");
	const bienSoXe = $("#input-bienSoXe");
	const ngayhopdong = $("#input-ngayhopdong");
	const thoihanhopdong = $("#input-thoihanhopdong");
	const giatrihopdong = $("#input-giatrihopdong");
	const giatrithanhtoan = $("#input-giatrithanhtoan");

	const error_mahopdong = $("#error_mahopdong");
	const error_makh = $("#error_makh");
	const error_bienSoXe = $("#error_bienSoXe");
	const error_ngayhopdong = $("#error_ngayhopdong");
	const error_thoihanhopdong = $("#error_thoihanhopdong");
	const error_giatrihopdong = $("#error_giatrihopdong");
	const error_giatrithanhtoan = $("#error_giatrithanhtoan");

	const mahopdongRegEx = /^MHD\d{3}$/;
	const makhRegEx = /^KH\d{3}$/;
	const numberRegEx = /^[1-9]\d*$/;
	/* const phoneRegEx = /^(090|091|\(84\)\+90|\(84\)\+91)\d{7}$/;
	 const emailRegEx = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;*/
	$("#inputForm").on("submit", function(e) {
		e.preventDefault();
		if (
			!validate_mahopdong(mahopdong) |
			!validate_makh(makh) |
			!validate_bienSoXe(bienSoXe) |
			!validate_ngayhopdong(ngayhopdong) |
			!validate_thoihanhopdong(thoihanhopdong) |
			!validate_giatrihopdong(giatrihopdong) |
			!validate_giatrithanhtoan(giatrithanhtoan)
		) {
			return;
		}
		this.submit();
	});

	function validate_mahopdong(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_mahopdong.text("Trường không được để trống");
			return false;
		}
		if (!mahopdongRegEx.test(value)) {
			error_mahopdong.text("Nhập không đúng định dạng (MHDxxx)");
			return false;
		}
		error_mahopdong.text("");
		return true;
	}

	function validate_makh(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_makh.text("Trường không được để trống");
			return false;
		}
		if (!makhRegEx.test(value)) {
			error_makh.text("Nhập không đúng định dạng (KHxxx)");
			return false;
		}
		error_makh.text("");
		return true;
	}


	function validate_bienSoXe(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_bienSoXe.text("Trường không được để trống");
			return false;
		}

		error_bienSoXe.text("");
		return true;
	}

	function validate_ngayhopdong(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_ngayhopdong.text("Trường không được để trống");
			return false;
		}
		const inputDate = new Date(selector.val().trim());
		const currentDate = new Date();
		currentDate.setHours(7, 0, 0, 0);
		if (currentDate < inputDate) {
			error_ngayhopdong.text("Ngày không được lớn hơn ngày hiện tại");
			return false;
		}
		error_ngayhopdong.text("");
		return true;
	}

	function validate_thoihanhopdong(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_thoihanhopdong.text("Trường không được để trống");
			return false;
		}
		const inputDate = new Date(selector.val().trim());
		const currentDate = new Date();
		currentDate.setHours(7, 0, 0, 0);
		if (currentDate > inputDate) {
			error_thoihanhopdong.text("Ngày không được bé hơn ngày hiện tại");
			return false;
		}
		error_thoihanhopdong.text("");
		return true;
	}


	function validate_giatrihopdong(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_giatrihopdong.text("Trường không được để trống");
			return false;
		}
		if (!numberRegEx.test(value)) {
			error_giatrihopdong.text("Chiều rộng phải là số nguyên dương");
			return false;
		}
		error_giatrihopdong.text("");
		return true;
	}
	function validate_giatrithanhtoan(selector) {
		const value = selector.val().trim();
		if (value == "") {
			error_giatrithanhtoan.text("Trường không được để trống");
			return false;
		}
		if (!numberRegEx.test(value)) {
			error_giatrithanhtoan.text("Chiều dài phải là số nguyên dương");
			return false;
		}
		error_giatrithanhtoan.text("");
		return true;
	}
	
	function validateName(selector) {
		const value = selector.val().trim();
		if (value == "") {
			errorName.text("Trường không được để trống");
			return false;
		}
		errorName.text("");
		return true;
	}
});