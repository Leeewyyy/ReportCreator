package pl.ReportCreator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ReportCreator.entities.Sighting;

@Repository
public interface SightingRepository extends CrudRepository<Sighting, Long> {
}
