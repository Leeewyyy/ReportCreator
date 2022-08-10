package pl.ReportCreator.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ReportCreator.entities.Sighting;
import pl.ReportCreator.services.SightingService;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping
public class SightingController {

    private final SightingService sightingService;

    @Autowired
    public SightingController(SightingService sightingService) {
        this.sightingService = sightingService;
    }

    @GetMapping
    public ResponseEntity<List<Sighting>> getSightings() {
        List<Sighting> sightings = sightingService.getSightings();
        return new ResponseEntity<>(sightings, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Sighting> updateSighting(@RequestBody Sighting sighting) {
        Sighting updateSighting = sightingService.updateSighting(sighting);
        return new ResponseEntity<>(updateSighting, HttpStatus.OK);
    }
}
