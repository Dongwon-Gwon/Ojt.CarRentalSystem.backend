package sk.ojt.backend.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.ojt.backend.admin.jpa.Admin;
import sk.ojt.backend.admin.service.AdminService;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.user.jpa.User;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }


    @GetMapping
    public List<RentalInfo> getRentalInfo() {
        return service.getAllRentalInfos();
    }


}
