package pl.ReportCreator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ReportCreator.entities.Sighting;
import pl.ReportCreator.repositories.SightingRepository;

import java.util.List;

@Service
public class SightingService {

    private final SightingRepository sightingRepository;

    @Autowired
    public SightingService(SightingRepository sightingRepository) {
        this.sightingRepository = sightingRepository;
    }

    public List<Sighting> getSightings(){
        return (List<Sighting>) sightingRepository.findAll();
    }
}
