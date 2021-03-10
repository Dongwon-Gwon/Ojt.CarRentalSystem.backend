package sk.ojt.backend.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.ojt.backend.admin.jpa.Admin;
import sk.ojt.backend.admin.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping
    public List<Admin> getAdminInfo(long adminId) {
        return service.getAdminInfo(adminId);
    }
}
