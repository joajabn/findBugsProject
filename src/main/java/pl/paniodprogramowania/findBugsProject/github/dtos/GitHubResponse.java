package pl.paniodprogramowania.findBugsProject.github.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GitHubResponse {

    private long id;
    private String login;

}
