package pl.paniodprogramowania.findBugsProject.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.paniodprogramowania.findBugsProject.retrofit.GithubService;

@RestController
public class GithubController {
  private final GithubService githubService;

  public GithubController(
      @Autowired GithubService githubService
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
  public ResponseEntity<String> getAll(@PathVariable("username") String username) throws IOException {
    return new ResponseEntity<>(
        githubService.getOneUser(username),
        HttpStatus.OK
    );
  }
}
