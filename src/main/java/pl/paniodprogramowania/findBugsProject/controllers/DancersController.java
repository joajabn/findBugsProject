package pl.paniodprogramowania.findBugsProject.controllers;

import jakarta.validation.Valid;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerSavedResponse;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.NewDancerRequest;
import pl.paniodprogramowania.findBugsProject.mapstruct.DancerMapper;
import pl.paniodprogramowania.findBugsProject.services.DancerService;

@Slf4j
@RestController
@RequestMapping("/v1")
public class DancersController {

  private final DancerService dancerService;
  private final DancerMapper dancerMapper;

  public DancersController(
      @Autowired DancerService dancerService,
      @Autowired DancerMapper dancerMapper) {
    this.dancerService = dancerService;
    this.dancerMapper = dancerMapper;
  }

  @PostMapping(path = "/dancers")
  public ResponseEntity<DancerSavedResponse> saveDancer(
      @Valid @RequestBody NewDancerRequest newDancerRequest
  ) {
    long id = dancerService.saveDancer(newDancerRequest.firstName(), newDancerRequest.lastName());
    return new ResponseEntity<>(
        DancerSavedResponse.builder()
            .dancerId(id)
            .build(),
        HttpStatus.CREATED
    );
  }

  @GetMapping(path = "/dancers")
  public ResponseEntity<List<DancerResponse>> getAllDancers() {
    var dancers = dancerService.returnAllDancers().stream()
        .map(dancerMapper::toDancerResponse)
        .toList();
    return new ResponseEntity<>(
        dancers,
        HttpStatus.OK
    );
  }
}
