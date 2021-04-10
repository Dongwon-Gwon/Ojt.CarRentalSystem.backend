package sk.ojt.backend.admin.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import sk.ojt.backend.admin.jpa.Admin;
import sk.ojt.backend.admin.service.AdminService;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.user.jpa.User;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }


    @GetMapping
    public List<Admin> getAdmin() {
        return service.getAllAdminList();
    }

    @PutMapping
    public Admin updateAdmin(@RequestBody Admin admin) {
        return service.updateAdmin(admin);
    }

    @DeleteMapping("/{adminId}")
    public int deleteAdmin(@PathVariable long adminId) {
        return service.deleteAdmin(adminId);
    }
}
