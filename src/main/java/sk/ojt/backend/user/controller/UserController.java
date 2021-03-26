package sk.ojt.backend.user.controller;

import org.springframework.web.bind.annotation.*;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.user.jpa.User;
import sk.ojt.backend.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUser() {
        return service.GetAllUserInfo();
    }

    @GetMapping("/{userId}/car")
    public List<Car> getUsableCar(@PathVariable long userId) {
        return service.GetUsableCarInfo(userId);
    }

    @GetMapping("/{userId}/rent")
    public List<Car> getRentedCar(@PathVariable long userId) {
        return service.GetRentedCarInfo(userId);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable long userId) {

        return service.getUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public int deleteUser(@PathVariable long userId) {
        return service.deleteUser(userId);
    }
}
