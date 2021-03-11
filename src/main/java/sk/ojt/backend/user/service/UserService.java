package sk.ojt.backend.user.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.rentalinfo.service.RentalInfoService;
import sk.ojt.backend.user.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    private RentalInfoService rentalInfoService;

    public UserService(UserRepository userRepository, RentalInfoService rentalInfoService) {
        this.userRepository = userRepository;
        this.rentalInfoService = rentalInfoService;
    }


}
