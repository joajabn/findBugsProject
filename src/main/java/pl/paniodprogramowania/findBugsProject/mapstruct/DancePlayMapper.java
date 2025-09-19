package pl.paniodprogramowania.findBugsProject.mapstruct;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayResponse;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;

@Component
@Mapper(componentModel = "spring")
public interface DancePlayMapper {

    DancePlay toModel(DancePlayEntity dancePlayEntity);
    DancePlayEntity toEntity(DancePlay dancePlay);
    DancePlay toModel(DancePlayResponse dancePlayResponse);
    DancePlayResponse toDTO(DancePlay dancePlay);

}
