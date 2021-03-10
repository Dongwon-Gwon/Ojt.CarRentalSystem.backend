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

    @PutMapping("/{carId}")
    public List<Car> getRentedCarList(@PathVariable("carId") long carId, @RequestBody Car car){
        return service.getRentedCarList(carId);
    }
}
