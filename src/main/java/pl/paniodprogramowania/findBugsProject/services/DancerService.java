package pl.paniodprogramowania.findBugsProject.services;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;
import pl.paniodprogramowania.findBugsProject.mapstruct.DancerMapper;
import pl.paniodprogramowania.findBugsProject.model.Dancer;
import pl.paniodprogramowania.findBugsProject.repositories.DancersRepository;

@Service
@Slf4j
public class DancerService {
  private DancersRepository dancersRepository;
  private DancerMapper dancerMapper;

  public DancerService(@Autowired DancersRepository dancersRepository, @Autowired DancerMapper dancerMapper) {
    this.dancersRepository = dancersRepository;
    this.dancerMapper = dancerMapper;
  }

  public long saveDancer(String firstName, String lastName) {
    Optional<DancerEntity> potentialDancer = dancersRepository.findByFirstAndLastName(firstName, lastName);
    if (potentialDancer.isEmpty()) {
      DancerEntity newDancer = DancerEntity.builder()
          .firstName(firstName)
          .lastName(lastName)
          .build();

      log.info("Saving new dancer... ");

      return dancersRepository.save(newDancer)
          .getDancerId();
    }
    return potentialDancer.get()
        .getDancerId();
  }

  public List<Dancer> returnAllDancers() {
    return dancersRepository.findAll().stream()
        .map(dancer -> dancerMapper.toDancer(dancer))
        .toList();
  }
}
