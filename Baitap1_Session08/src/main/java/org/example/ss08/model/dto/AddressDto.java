package org.example.ss08.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AddressDto {

    @NotBlank(message = "Tên người nhận không được để trống")
    @Size(min = 2, max = 50, message = "Tên phải từ 2 đến 50 ký tự")
    private String receiverName;

    @NotBlank(message = "Địa chỉ không được để trống")
    @Size(min = 5, max = 255, message = "Địa chỉ phải từ 5 đến 255 ký tự")
    private String detailedAddress;

    public AddressDto() {
    }

    public AddressDto(String receiverName, String detailedAddress) {
        this.receiverName = receiverName;
        this.detailedAddress = detailedAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress.trim();
    }
}