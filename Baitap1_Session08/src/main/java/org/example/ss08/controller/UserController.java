package org.example.ss08.controller;

import jakarta.validation.Valid;
import org.example.ss08.model.dto.AddressDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class UserController {

    @PostMapping("/update")
    public ResponseEntity<?> updateAddress(
            @Valid @RequestBody AddressDto addressDto,
            BindingResult result
    ) {

        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        return ResponseEntity.ok("Cập nhật địa chỉ thành công");
    }
}