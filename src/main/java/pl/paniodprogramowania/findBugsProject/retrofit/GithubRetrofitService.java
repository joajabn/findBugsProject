package pl.paniodprogramowania.findBugsProject.retrofit;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;
import pl.paniodprogramowania.findBugsProject.services.GithubService;

@Service
public class GithubRetrofitService implements GithubService {
  private final GithubApi githubApi;

  public GithubRetrofitService(GithubApi githubApi) {
    this.githubApi = githubApi;
  }

  @Override
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

  @Override
  public String getOneUser(String username) {
    try {
      return githubApi.getUser(username).execute().body().get("login").getAsString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
}
