package pl.paniodprogramowania.findBugsProject.retrofit;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;

@Service
public class GithubService {
  private final GithubApi githubApi;

  public GithubService(GithubApi githubApi) {
    this.githubApi = githubApi;
  }

  public List<String> getAllUsers() {
    try {
        List<JsonObject> response = githubApi.getAllUsers().execute().body();
        return response.stream()
                .map(jOb -> jOb.get("login").getAsString())
                .limit(10)
                .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return List.of();
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
