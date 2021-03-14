package sk.ojt.backend.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.ojt.backend.car.jpa.Car;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByCarId(long carId);
    List<Car> findAll();

    Car save(Car car);
    int deleteByCarId(long carId);
}

