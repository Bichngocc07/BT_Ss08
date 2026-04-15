package org.example.ss08.controller;

import jakarta.validation.Valid;
import org.example.ss08.model.dto.EmployeeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hr")
public class EmployeeController {

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("employee", new EmployeeDto());
        return "employee-form";
    }

    @PostMapping("/add-employee")
    public String saveEmployee(
            @Valid @ModelAttribute("employee") EmployeeDto employee,
            BindingResult bindingResult,
            Model model
    ) {

        // QUAN TRỌNG: BindingResult phải đứng ngay sau @Valid
        if (bindingResult.hasErrors()) {
            return "employee-form";
        }

        return "success";
    }
}