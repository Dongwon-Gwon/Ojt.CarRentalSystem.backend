package sk.ojt.backend.admin.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.admin.jpa.Admin;
import sk.ojt.backend.admin.repository.AdminRepository;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.car.service.CarService;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.rentalinfo.service.RentalInfoService;
import sk.ojt.backend.user.jpa.User;
import sk.ojt.backend.user.service.UserService;

import java.util.List;

@Service
public class AdminService {

    private AdminRepository repo;
    private CarService carService;
    private RentalInfoService rentalInfoService;
    private UserService userService;

    public AdminService(AdminRepository repo, CarService carService, RentalInfoService rentalInfoService, UserService userService) {
        this.repo = repo;
        this.carService = carService;
        this.rentalInfoService = rentalInfoService;
        this.userService = userService;
    }

    public List<Admin> getAllAdminList() {
        return repo.findAll();
    }

    public List<Admin> getAdminInfo(long adminId) {
        return repo.findByAdminId(adminId);
    }

    public List<Car> getAllCarList() {
        return carService.getAllCarList();
    }

    public List<RentalInfo> getAllRentalInfos() {
        return rentalInfoService.getAllRentalInfo();
    }

    public List<User> getAllUserInfos() {
        return userService.GetAllUserInfo();
    }
}
