package pl.paniodprogramowania.findBugsProject.github;

import pl.paniodprogramowania.findBugsProject.github.dtos.GitHubResponse;

import java.util.List;

public interface GithubService {
    //1getAllUser, 2getUser
    public List<String> getAllUsers();
    public GitHubResponse getOneUser(String username);
}
