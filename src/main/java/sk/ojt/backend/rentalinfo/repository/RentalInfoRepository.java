package sk.ojt.backend.rentalinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RentalInfoRepository extends JpaRepository<RentalInfo, Long> {

    List<RentalInfo> findAll();

    List<RentalInfo> findByUserId(long userId);

    List<RentalInfo> findByCarId(long carId);

    int deleteById(long id);
    int deleteByUserId(long userId);


    RentalInfo save(RentalInfo rentalInfo);
}
