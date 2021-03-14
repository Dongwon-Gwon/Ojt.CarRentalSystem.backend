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
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }


    @GetMapping
    public List<RentalInfo> getRentalInfo() {
        return service.getAllRentalInfos();
    }

    @PutMapping("/{id}")
    public RentalInfo createRentalInfo(@RequestBody RentalInfo rentalInfo) {
        return service.saveRentalInfo(rentalInfo);
    }

    @DeleteMapping("/{id}")
    public int deleteRentalInfo(@PathVariable long id) {
        return service.deleteRentalInfo(id);
    }
}
