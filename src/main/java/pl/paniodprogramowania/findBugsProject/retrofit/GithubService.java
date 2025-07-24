package pl.paniodprogramowania.findBugsProject.retrofit;

import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class GithubService {
  private final GithubApi githubApi;

  public GithubService(GithubApi githubApi) {
    this.githubApi = githubApi;
  }

  public String getAllUsers() {
    try {
      return githubApi.getAllUsers().execute().body().get("login").getAsString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }

  public String getOneUser(String username) {
    try {
      return githubApi.getUser(username).execute().body().get("login").getAsString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
}
