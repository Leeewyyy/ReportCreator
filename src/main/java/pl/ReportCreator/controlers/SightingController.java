package pl.ReportCreator.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ReportCreator.entities.Sighting;
import pl.ReportCreator.services.SightingService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sightings")
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
}
