package sk.ojt.backend.rentalinfo.jpa;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "rental_info")
@NoArgsConstructor
public class RentalInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "car_id")
    private long carId;

    @Builder
    public RentalInfo(long id, long userId, long carId) {
        this.id = id;
        this.userId = userId;
        this.carId = carId;
    }
}

