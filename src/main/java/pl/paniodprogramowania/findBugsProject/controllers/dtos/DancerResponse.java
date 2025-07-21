package pl.paniodprogramowania.findBugsProject.controllers.dtos;

import lombok.Builder;

@Builder
public record DancerResponse(long id, String firstName, String lastName) {
}
