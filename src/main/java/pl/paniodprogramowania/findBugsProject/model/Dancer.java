package pl.paniodprogramowania.findBugsProject.model;

import lombok.Builder;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.PreferredDance;

import java.util.List;

@Builder
public record Dancer(
        long id,
        String firstName,
        String lastName,
        PreferredDance preferredDance,
        List<DancePlayWithoutDancer> plays
) {
}
