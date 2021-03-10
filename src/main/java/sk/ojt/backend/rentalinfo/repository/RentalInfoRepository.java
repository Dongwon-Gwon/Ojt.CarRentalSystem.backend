package sk.ojt.backend.rentalinfo.repository;

import org.springframework.data.repository.CrudRepository;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;

public interface RentalInfoRepository extends CrudRepository<RentalInfo, Long> {

}
