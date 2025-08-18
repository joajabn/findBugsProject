package pl.paniodprogramowania.findBugsProject.controllers.dtos;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record DancerResponse(
    @Schema(requiredMode = REQUIRED, name = "dancerId")
    long id,
    @Schema(requiredMode = REQUIRED, name = "firstName", minLength = 3)
    String firstName,
    @Schema(requiredMode = REQUIRED, name = "lastName", minLength = 3)
    String lastName,
    @Schema(requiredMode = REQUIRED, name = "preferredDance", minLength = 3, enumAsRef = true)
    PreferredDance preferredDance) {
}
