//PHÂN TÍCH LOGIC – BÀI 1
//Lỗi 1: Lọt khoảng trắng vào Database
//Nguyên nhân:
//@NotNull chỉ kiểm tra:
//        ✔ khác null
//Không kiểm tra:
//chuỗi rỗng ""
//chuỗi toàn khoảng trắng " "
//Kết quả:
//Người dùng nhập " " (space nhiều lần)
//Hệ thống vẫn coi là hợp lệ
//Dữ liệu rỗng được lưu vào DB
//Kết luận:
//Dùng sai annotation → phải dùng @NotBlank
//
//Lỗi 2: Không chặn request từ Postman → lỗi 500 AddressDto addressDto)
//Nguyên nhân chính:
//        1. Thiếu @Valid
//Không có @Valid → Bean Validation không chạy
//Dữ liệu sai vẫn đi vào xử lý
//2. Không có xử lý lỗi
//Không có BindingResult
//Không có try-catch / validation response
//⚠Kết quả:
//Khi dữ liệu sai:
//Có thể null / sai format
//Gây lỗi trong xử lý hoặc DB
//→ sinh ra 500 Internal Server Error