package pl.paniodprogramowania.findBugsProject.model;

import lombok.Builder;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.PreferredDance;

@Builder
public record Dancer(long id, String firstName, String lastName, PreferredDance preferredDance) {
}
