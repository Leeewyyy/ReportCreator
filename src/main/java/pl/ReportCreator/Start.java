package pl.ReportCreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.ReportCreator.entities.Sighting;
import pl.ReportCreator.repositories.SightingRepository;

@Component
public class Start {

    private SightingRepository repo;

    @Autowired
    public Start(SightingRepository repo){
        this.repo = repo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        Sighting s = new Sighting(18021992647L, "3D Mark - VRS Tier 2 - Tearing + Stuttering", "11155 + 210B", "p1-showstopper", false, "Yes", "complete", "d3d12");
        Sighting s2 = new Sighting(18017757210L, "3DMark - little pixels corruptions in VRS Tier 1 test", "8968 + 1320", "p1-showstopper", false, "No", "development", "d3d12");
        repo.save(s);
        repo.save(s2);
    }
}
