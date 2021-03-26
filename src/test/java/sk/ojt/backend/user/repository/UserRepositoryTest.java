package sk.ojt.backend.user.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sk.ojt.backend.car.jpa.Car;
import sk.ojt.backend.car.repository.CarRepository;
import sk.ojt.backend.user.jpa.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private User testUser;

    @Test
    public void testRead() {
        List<User> allUser = userRepository.findAll();
        System.out.println(allUser);
    }
}