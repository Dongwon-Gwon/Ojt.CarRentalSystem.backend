package sk.ojt.backend.rentalinfo.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.rentalinfo.repository.RentalInfoRepository;

import java.util.List;

@Service
public class RentalInfoService {

    private RentalInfoRepository repo;

    public RentalInfoService(RentalInfoRepository repo) {
        this.repo = repo;
    }

    public List<RentalInfo> getAllRentalInfo() {
        return repo.findAll();
    }

    public List<RentalInfo> getUserRentalInfo(long userId) {
        return repo.findByUserId(userId);
    }

    public List<RentalInfo> getCarRentalInfo(long carId) {
        return repo.findByCarId(carId);
    }

    public RentalInfo saveRentalInfo(RentalInfo rentalInfo) {
        return repo.save(rentalInfo);
    }

    public int deleteRentalInfo(long Id) {
        return repo.deleteById(Id);
    }

}
