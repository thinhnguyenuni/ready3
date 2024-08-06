<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row w-100 d-flex justify-content-center">
	<div class="col-sm-12 col-md-6 bg-custom p-3 rounded">
		<div class="col-12 text-uppercase h2 text-center text-success ">Tạo
			mới hợp đồng bảo hiểm</div>
		<div class="p-4">
			<form:form action="${pageContext.request.contextPath}/hopdongbaohiem/create"
				method="post" modelAttribute="hopdongbaohiem" id="inputForm">
				<div class="form-group row">
					<form:label path="maHopDong" for="input-mahopdong" class="col-sm-3 col-form-label">Mã hợp đồng</form:label>
					<div class="col">
						<form:input path="maHopDong" type="text" class="form-control"
							id="input-mahopdong" placeholder="Mã hợp đồng (MHD001)" autocomplete="off" />
						<form:errors path="maHopDong" />
						<div class="error text-danger" id="error_mahopdong"></div>
					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="khachHang.maKH" for="input-makh"
						class="col-sm-3 col-form-label">Mã khách hàng</form:label>
					<div class="col">
						<form:input path="khachHang.maKH" type="text" class="form-control"
							id="input-makh" placeholder="Mã khách hàng (KH001)" autocomplete="off" />
						<form:errors path="khachHang.maKH" />
						<div class="error text-danger" id="error_makh"></div>

					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="bienSoXe" for="input-bienSoXe"
						class="col-sm-3 col-form-label">Biển số xe</form:label>
					<div class="col">
						<form:input path="bienSoXe" type="text" class="form-control"
							id="input-bienSoXe" placeholder="Biển số xe"
							autocomplete="off" />
						<form:errors path="bienSoXe" />
						<div class="error text-danger" id="error_bienSoXe"></div>
					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="ngayHopDong" for="input-ngayhopdong"
						class="col-sm-3 col-form-label">Ngày hợp đồng</form:label>
					<div class="col">
						<form:input path="ngayHopDong" type="date" class="form-control"
							id="input-ngayhopdong" placeholder=""
							autocomplete="off" />
						<form:errors path="ngayHopDong" />
						<div class="error text-danger" id="error_ngayhopdong"></div>
					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="thoiHanHopDong" for="input-thoihanhopdong"
						class="col-sm-3 col-form-label">Thời hạn hợp đồng</form:label>
					<div class="col">
						<form:input path="thoiHanHopDong" type="date" class="form-control"
							id="input-thoihanhopdong" placeholder="" autocomplete="off" />
						<form:errors path="thoiHanHopDong" />
						<div class="error text-danger" id="error_thoihanhopdong"></div>

					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="giaTriHopDong" for="input-giatrihopdong"
						class="col-sm-3 col-form-label">Giá trị hợp đồng</form:label>
					<div class="col">
						<form:input path="giaTriHopDong" type="number" class="form-control"
							id="input-giatrihopdong" placeholder="" autocomplete="off" />
						<form:errors path="giaTriHopDong" />
						<div class="error text-danger" id="error_giatrihopdong"></div>

					</div>
				</div>
				<div class="form-group row mt-3">
					<form:label path="giaTriThanhToan" for="input-giatrithanhtoan"
						class="col-sm-3 col-form-label">Giá trị thanh toán</form:label>
					<div class="col">
						<form:input path="giaTriThanhToan" type="number" class="form-control"
							id="input-giatrithanhtoan" placeholder="Giá gốc" autocomplete="off" />
						<form:errors path="giaTriThanhToan" />
						<div class="error text-danger" id="error_giatrithanhtoan"></div>

					</div>
				</div>
				<div class="form-group row mt-3">
					<div class="col"></div>
					<div class="col-sm-12 col-md-6 mr-2 d-flex justify-content-end">
						<button type="reset" class="btn btn-success">Reset</button>
						<button type="submit" class="btn btn-success mx-3">Add</button>
						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-danger">Cancel</a>
					</div>
				</div>

			</form:form>
		</div>
	</div>
</div>




