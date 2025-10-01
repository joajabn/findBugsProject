package pl.paniodprogramowania.findBugsProject.retrofit;

import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GithubApi {
  @GET("users")
  public Call<List<JsonObject>> getAllUsers();

  @GET("users/{username}")
  public Call<JsonObject> getUser(@Path("username") String username);
}
