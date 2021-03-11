package sk.ojt.backend.car.controller;

import org.springframework.web.bind.annotation.*;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.car.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAllCarList() {
        return service.getAllCarList();
    }

    @GetMapping("/test")
    public String Test() {
        List<Car> carList = service.getRentedCarList(2);
        Car car = carList.get(0);
        return car.getCarName();
    }


    @GetMapping("/{carId}")
    public List<Car> getRentedCarList(@PathVariable Long carId) {
        return service.getRentedCarList(carId);
    }

}
