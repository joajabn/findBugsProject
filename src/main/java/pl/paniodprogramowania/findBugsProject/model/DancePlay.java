package pl.paniodprogramowania.findBugsProject.model;

import java.util.List;
import lombok.Builder;

@Builder
public record DancePlay(long id, String title, Dancer primaballerina) {
}
