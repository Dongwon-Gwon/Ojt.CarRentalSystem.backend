package sk.ojt.backend.car.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.car.repository.CarRepository;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;

import java.util.List;

@Service
public class CarService {


    private CarRepository repo;

    public CarService(CarRepository repo) {
        this.repo = repo;
    }

    public List<Car> getAllCarList() {
        return repo.findAll();
    }

    public List<Car> getRentedCarList(long carId) {
        return repo.findByCarId(carId);
    }

    public Car updateCar(Car car) {
        return repo.save(car);
    }

    public int deleteCar(long id) {
        return repo.deleteByCarId(id);
    }
}
