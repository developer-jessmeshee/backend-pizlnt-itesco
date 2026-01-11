package com.itesco.pizlntI_itesco.controllers;

import com.itesco.pizlntI_itesco.dtos.BaseDeleteRecord;
import com.itesco.pizlntI_itesco.dtos.CareerDTO;
import com.itesco.pizlntI_itesco.dtos.UpdateCareerDTO;
import com.itesco.pizlntI_itesco.models.Career;
import com.itesco.pizlntI_itesco.services.CareerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/careers" )
public class CareerController {
    private final CareerService careerService;

    public CareerController( CareerService careerService ) {
        this.careerService = careerService;
    }

    @GetMapping
    public List<Career> findAllCareers() {
        return careerService.findAllCareers();
    }

    @PostMapping
    public Career saveCareer( @Valid @RequestBody CareerDTO career ) {
        return careerService.saveCareer( career );
    }

    @DeleteMapping
    public Career deleteCareer( @Valid @RequestBody BaseDeleteRecord props ) {
        return careerService.deleteCareer( props );
    }

    @PutMapping
    public Career updateCareer( @Valid @RequestBody UpdateCareerDTO career ) {
        return careerService.updateCareer( career );
    }
}
