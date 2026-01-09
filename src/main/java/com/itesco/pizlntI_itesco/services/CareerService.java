package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.dtos.CareerDTO;
import com.itesco.pizlntI_itesco.models.Career;
import com.itesco.pizlntI_itesco.repositories.CareerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {
    private final CareerRepository careerRepository;

    public CareerService( CareerRepository careerRepository ) {
        this.careerRepository = careerRepository;
    }

    public List<Career> findAllCareers() {
        return careerRepository.findAll();
    }

    public Career saveCareer( CareerDTO career ) {
        Career newCareer = new Career();

        newCareer.setName( career.getName() );

        return careerRepository.save( newCareer );
    }
}
