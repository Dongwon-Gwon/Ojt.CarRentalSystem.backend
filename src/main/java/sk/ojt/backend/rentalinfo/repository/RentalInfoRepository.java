package sk.ojt.backend.rentalinfo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RentalInfoRepository extends CrudRepository<RentalInfo, Long> {

}
