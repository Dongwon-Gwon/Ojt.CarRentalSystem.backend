package sk.ojt.backend.rentalinfo.controller;

import org.springframework.web.bind.annotation.*;
import sk.ojt.backend.rentalinfo.jpa.RentalInfo;
import sk.ojt.backend.rentalinfo.service.RentalInfoService;

import java.util.List;


@RestController
@RequestMapping("/rentalinfo")
@CrossOrigin("*")
public class RentalInfoController {

    private RentalInfoService service;

    public RentalInfoController(RentalInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<RentalInfo> getRentalInfo() {
        return service.getAllRentalInfo();
    }

    @PutMapping
    public RentalInfo updateRentalInfo(@RequestBody RentalInfo rentalInfo) {
        return service.saveRentalInfo(rentalInfo);
    }

    @DeleteMapping("/{id}")
    public int deleteRentalInfo(@PathVariable long id) {
        return service.deleteRentalInfo(id);
    }
}
