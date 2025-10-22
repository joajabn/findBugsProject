package pl.paniodprogramowania.findBugsProject.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;

@Repository
public interface DancersRepository extends JpaRepository<DancerEntity, Long> {

  @Query(
      nativeQuery = true, value = "SELECT * FROM dancers "
      + "WHERE first_name = :firstName "
      + "AND last_name= :lastName")
  Optional<DancerEntity> findByFirstAndLastName(
      @Param("firstName") String studentId,
      @Param("lastName") String lessonOrder
  );

    @Override
    @Query("select distinct d from DancerEntity d left join fetch d.dancePlays")
    List<DancerEntity> findAll();
}
