package pl.ReportCreator.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ReportCreator.entities.Sighting;

public interface SightingRepository extends CrudRepository<Sighting, Long> {
}
