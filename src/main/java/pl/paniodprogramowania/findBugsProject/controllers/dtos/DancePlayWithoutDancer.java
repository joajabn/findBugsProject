package pl.paniodprogramowania.findBugsProject.controllers.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record DancePlayWithoutDancer
        (
                @Schema(requiredMode = Schema.RequiredMode.REQUIRED, name = "dancePlayId")
                long id,
                @Schema(requiredMode = Schema.RequiredMode.REQUIRED, name = "title")
                String title
        ) {
}

