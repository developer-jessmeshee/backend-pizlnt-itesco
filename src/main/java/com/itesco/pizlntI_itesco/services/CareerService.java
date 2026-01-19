package com.itesco.pizlntI_itesco.services;

import com.itesco.pizlntI_itesco.dtos.BaseCreateCatalogDTO;
import com.itesco.pizlntI_itesco.dtos.BaseDeleteRecord;
import com.itesco.pizlntI_itesco.dtos.UpdateCareerDTO;
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
        return careerRepository.findByActiveTrue();
    }

    public Career saveCareer( BaseCreateCatalogDTO career ) {
        Career newCareer = new Career();

        newCareer.setName( career.getName() );

        return careerRepository.save( newCareer );
    }

    public Career deleteCareer( BaseDeleteRecord props ) {
        Career career = careerRepository.findById( props.getRecordId() ).orElseThrow();

        career.setActive( false );

        return careerRepository.save( career );
    }

    public Career updateCareer( UpdateCareerDTO career ) {
        Career newCareer = careerRepository.findById( career.getId() ).orElseThrow();

        newCareer.setName( career.getName() );

        return careerRepository.save( newCareer );
    }

    public Career findCareerById( String id ) {
        return careerRepository.findById( id )
                .orElseThrow( () -> new RuntimeException( "Carrera no encontrada" ) );
    }
}
