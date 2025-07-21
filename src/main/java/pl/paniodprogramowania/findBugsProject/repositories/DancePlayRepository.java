package pl.paniodprogramowania.findBugsProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;

@Repository
public interface DancePlayRepository extends JpaRepository<DancePlayEntity, Long> {
}
