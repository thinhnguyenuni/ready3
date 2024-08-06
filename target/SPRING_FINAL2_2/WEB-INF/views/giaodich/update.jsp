<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row w-100 d-flex justify-content-center">
	<div class="col-sm-12 col-md-6 bg-custom p-3 rounded">
		<div class="col-12 text-uppercase h2 text-center text-success ">Cập
			nhật giao dịch</div>
		<div class="p-4">
			<form:form
				action="${pageContext.request.contextPath}/giaodich/update"
				method="post" modelAttribute="giaodich" id="inputForm">
				<!-- Dòng 1: Bắt đầu một form với các thuộc tính định danh -->
				<div class="form-group row">
					<!-- Dòng 2-11: Ô nhập dữ liệu cho Mã giao dịch -->
					<form:label path="id" for="inputID" class="col-sm-3 col-form-label">Mã giao dịch</form:label>
					<!-- Dòng 3: Nhãn cho ô nhập -->
					<div class="col">
						<!-- Dòng 4: Ô nhập dữ liệu -->
						<form:input path="id" type="text" class="form-control"
							id="inputID" placeholder="Mã giao dịch" readonly="true" />
						<!-- Dòng 5: Hiển thị lỗi (nếu có) -->
						<form:errors path="id" />
						<!-- Dòng 6: Hiển thị thông báo lỗi -->
						<div class="error text-danger" id="errorID"></div>
					</div>
				</div>
				<!-- Dòng 7-29: Tương tự cho các trường dữ liệu khác -->
				<div class="form-group row mt-3">
					<form:label path="khachHang.id" for="inputMaKhachHang"
						class="col-sm-3 col-form-label">Mã khách hàng</form:label>
					<div class="col">
						<form:input path="khachHang.id" type="text" class="form-control"
							id="inputMaKhachHang" placeholder="Mã khách hàng (KHxxx)" />
						<form:errors path="khachHang.id" />
						<div class="error text-danger" id="errorMaKhachHang"></div>
					</div>
				</div>
				<!-- Dòng 30-52: Tương tự cho các trường dữ liệu còn lại -->
				<div class="form-group row mt-3">
					<form:label path="mauDat.id" for="inputMaMauDat"
						class="col-sm-3 col-form-label">Mã mẫu đất</form:label>
					<div class="col">
						<form:input path="mauDat.id" type="text" class="form-control"
							id="inputMaMauDat" placeholder="Mã mẫu đất (MDxxx)" />
						<form:errors path="mauDat.id" />
						<div class="error text-danger" id="errorMaMauDat"></div>
					</div>
				</div>
				<!-- Dòng 53-75: Tương tự cho các trường dữ liệu còn lại -->
				<div class="form-group row mt-3">
					<form:label path="price" for="inputPrice"
						class="col-sm-3 col-form-label">Giá giao dịch</form:label>
					<div class="col">
						<form:input path="price" type="number" class="form-control"
							id="inputPrice" placeholder="Giá giao dịch" />
						<form:errors path="price" />
						<div class="error text-danger" id="errorPrice"></div>
					</div>
				</div>
				<!-- Dòng 76-98: Tương tự cho các trường dữ liệu còn lại -->
				<!-- (tienDatCoc, ngayDatCoc, ngayThanhToan, method, status) -->
				<div class="form-group row mt-3">
					<form:label path="tienDatCoc" for="inputTienDatCoc"
						class="col-sm-3 col-form-label">Tiền đặt cọc</form:label>
					<div class="col">
						<form:input path="tienDatCoc" type="number" class="form-control"
							id="inputTienDatCoc" placeholder="Tiền đặt cọc" />
						<form:errors path="tienDatCoc" />
						<div class="error text-danger" id="errorTienDatCoc"></div>
					</div>
				</div>
				<!-- Dòng 99-121: Tương tự cho các trường dữ liệu còn lại -->
				<!-- (ngayDatCoc, ngayThanhToan, method, status) -->
				<!-- Dòng 122-134: Nút Reset, Nút Submit và Nút Hủy -->
				<div class="form-group row mt-3">
					<div class="col"></div>
					<!-- Dòng 123-133: Nút điều chỉnh và xác nhận thay đổi -->
					<div class="col-sm-12 col-md-6 mr-2 d-flex justify-content-end">
						<!-- Dòng 124: Nút Reset để xóa dữ liệu đã nhập -->
						<button type="reset" class="btn btn-success">Reset</button>
						<!-- Dòng 125: Nút Submit để cập nhật dữ liệu -->
						<button type="submit" class="btn btn-success mx-3">Update</button>
						<!-- Dòng 126: Nút Hủy để quay lại trang chủ -->
						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-danger">Cancel</a>
					</div>
				</div>
			</form:form>

		</div>
	</div>
</div>



