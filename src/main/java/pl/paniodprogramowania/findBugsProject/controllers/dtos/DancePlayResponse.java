package pl.paniodprogramowania.findBugsProject.controllers.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import pl.paniodprogramowania.findBugsProject.model.Dancer;

@Builder
public record DancePlayResponse(
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, name = "dancePlayId")
        long id,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, name = "title")
        String title,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED,name = "primaballerina")
        DancerResponse dancer
        )
{}
