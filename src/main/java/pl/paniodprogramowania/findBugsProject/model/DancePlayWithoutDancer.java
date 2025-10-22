package pl.paniodprogramowania.findBugsProject.model;

import lombok.Builder;

@Builder
public record DancePlayWithoutDancer(long id, String title) {
}
