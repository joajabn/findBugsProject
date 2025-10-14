package pl.paniodprogramowania.findBugsProject.github.retrofit;

import com.google.gson.JsonObject;
import pl.paniodprogramowania.findBugsProject.github.dtos.GitHubResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GithubApi {
  @GET("users")
  public Call<List<GitHubResponse>> getAllUsers();

  @GET("users/{username}")
  public Call<GitHubResponse> getUser(@Path("username") String username);
}
