package pl.paniodprogramowania.findBugsProject.model;

import lombok.Builder;

@Builder
public record Dancer(long id, String firstName, String lastName) {
}
