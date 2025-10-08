package pl.paniodprogramowania.findBugsProject.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.paniodprogramowania.findBugsProject.github.dtos.GitHubResponse;
import pl.paniodprogramowania.findBugsProject.github.restClient.GitHubRestClientService;
import pl.paniodprogramowania.findBugsProject.github.retrofit.GithubRetrofitService;
import pl.paniodprogramowania.findBugsProject.services.GithubService;

@RestController
public class GithubController {
    private final GithubService githubService;

    public GithubController(
            @Autowired GithubRetrofitService githubService
    ) {
        this.githubService = githubService;
    }

    @GetMapping(path = "/users")
    public ResponseEntity<List<String>> getAll(
    ) throws IOException {

        return new ResponseEntity<>(
                githubService.getAllUsers(),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "/users/{username}")
    public ResponseEntity<GitHubResponse> getAll(@PathVariable("username") String username) throws IOException {
        GitHubResponse oneUser = githubService.getOneUser(username);
        return new ResponseEntity<>(
                oneUser,
                HttpStatus.OK
        );
    }
}
