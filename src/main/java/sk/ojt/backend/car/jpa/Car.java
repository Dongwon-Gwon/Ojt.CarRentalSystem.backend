package sk.ojt.backend.car.jpa;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "car")
@NoArgsConstructor
public class Car {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "company")
    private String company;

    @Builder
    public Car(long carId, String carName, String company) {
        this.carId = carId;
        this.carName = carName;
        this.company = company;
    }
}
