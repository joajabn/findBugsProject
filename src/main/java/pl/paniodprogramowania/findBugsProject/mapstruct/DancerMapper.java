package pl.paniodprogramowania.findBugsProject.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;
import pl.paniodprogramowania.findBugsProject.model.Dancer;

@Component
@Mapper(componentModel = "spring")
public interface DancerMapper {

  @Mappings(
      {
          @Mapping(source = "dancerId", target = "id"),
          @Mapping(source = "firstName", target = "firstName"),
          @Mapping(source = "lastName", target = "lastName")
      })
  Dancer toDancer(DancerEntity dancerDocument);

  @Mappings(
      {
          @Mapping(source = "dancePlayId", target = "id"),
          @Mapping(source = "title", target = "title"),
          @Mapping(source = "primaballerina", target = "primaballerina")
      })
  DancePlay toDancePlay(DancePlayEntity dancerDocument);

  @Mappings(
      {
          @Mapping(source = "id", target = "id"),
          @Mapping(source = "firstName", target = "firstName"),
          @Mapping(source = "lastName", target = "lastName")
      })
  DancerResponse toDancerResponse(Dancer dancerDocument);


}

