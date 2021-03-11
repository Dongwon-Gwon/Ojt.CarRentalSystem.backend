package sk.ojt.backend.car.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sk.ojt.backend.car.jpa.Car;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@RunWith(SpringRunner.class)
@SpringBootTest
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    private Car testCar;

    @Test
    public void inspect() {
        // 실제 객체의 클래스 이름
        Class cls = carRepository.getClass();
        System.out.println(cls.getName());

        // 클래스가 구현하고 있는 인터페이스 목록
        Class[] interfaces = cls.getInterfaces();
        Stream.of(interfaces).forEach(inter -> System.out.println(inter.getName()));

        //클래스의 부모 클래스
        Class superClasses = cls.getSuperclass();
        System.out.println(superClasses.getName());
    }

    @Test
    public void testInsert() {
        Car car = new Car(2,"morning","kia");
        carRepository.save(car);
    }

    @Test
    public void testSearch() {

        List<Car> allCar = this.carRepository.findAll();
        System.out.println(allCar);

        List<Car> car = this.carRepository.findByCarId(1L);
        System.out.println(car);
    }

    @Test
    void testSave() {

        Car testCar = new Car(3L,"grandeur","hyundai");
        carRepository.save(testCar);
        List<Car> real = carRepository.findByCarId(3);
        System.out.println(real);
    }



}
