package sk.ojt.backend.rentalinfo.service;

import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class RentalInfoServiceTest {

    @Autowired
    private RentalInfoService rentalInfoService;

    private RentalInfo rentalInfo;

    @Test
    public void checkReturnType() {
        List<RentalInfo> rentalInfo = rentalInfoService.getCarRentalInfo(1L);
        System.out.println(rentalInfo);

    }
}