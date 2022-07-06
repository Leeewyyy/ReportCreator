package pl.ReportCreator.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ReportCreator.entities.Sighting;
import pl.ReportCreator.services.SightingService;

import java.util.List;

@RestController
@RequestMapping(path = "sightings")
public class SightingController {

    private final SightingService sightingService;

    @Autowired
    public SightingController(SightingService sightingService) {
        this.sightingService = sightingService;
    }

    @GetMapping
    public List<Sighting> getSightings() {
        return sightingService.getSightings();
    }
}
