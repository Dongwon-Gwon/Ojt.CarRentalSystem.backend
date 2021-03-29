package sk.ojt.backend.user.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.car.service.CarService;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.rentalinfo.service.RentalInfoService;
import sk.ojt.backend.user.jpa.User;
import sk.ojt.backend.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private RentalInfoService rentalInfoService;
    private CarService carService;

    public UserService(UserRepository userRepository, RentalInfoService rentalInfoService, CarService carService) {
        this.userRepository = userRepository;
        this.rentalInfoService = rentalInfoService;
        this.carService = carService;
    }

    public List<User> GetAllUserInfo() {
        return userRepository.findAll();
    }

    public List<Car> GetRentedCarInfo(long userId) {

        List<RentalInfo> info = rentalInfoService.getUserRentalInfo(userId);
        long carId = info.get(0).getCarId();
        List<Car> carInfo = carService.getRentedCarList(carId);
        return carInfo;
    }

    public List<Car> GetUsableCarInfo(long userId) {
        List<RentalInfo> info = rentalInfoService.getUserRentalInfo(userId);
        if (info.size() >= 1) {
            return null;
        }

        List<Car> carInfos = carService.getAllCarList();
        List<RentalInfo> rentalInfos = rentalInfoService.getAllRentalInfo();
        List<Long> rentedCarId = new ArrayList<>();
        List<Car> usableCarInfos = new ArrayList<>();

        for (RentalInfo rentalinfo : rentalInfos) {
            rentedCarId.add(rentalinfo.getCarId());
        }

        for (Car carInfo : carInfos) {
            if (rentedCarId.contains(carInfo.getCarId())) {
            } else {
                usableCarInfos.add(carInfo);
            }
        }

        return usableCarInfos;
    }

    public User getUser(long userId) {
        return userRepository.findByUserId(userId);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public int deleteUser(long userId) {
        return userRepository.deleteByUserId(userId);
    }
    public int deleteRentalInfoByUserId(long userId){return rentalInfoService.deleteRentalInfoByUserId(userId);}
}
