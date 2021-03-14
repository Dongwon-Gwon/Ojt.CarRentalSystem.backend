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
    public List<Car> getCarList() {
        return service.getAllCarList();
    }


    @GetMapping("/{carId}")
    public List<Car> getRentedCarList(@PathVariable Long carId) {
        return service.getRentedCarList(carId);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car) {
        return service.updateCar(car);
    }

    @DeleteMapping("{/carId}")
    public int deleteCar(@PathVariable long carId) {
        return service.deleteCar(carId);
    }
}
