package pl.paniodprogramowania.findBugsProject.retrofit;

import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubApi {
  @GET("users/PaniOdProgramowania")
  public Call<JsonObject> getAllUsers();

  @GET("users/{username}")
  public Call<JsonObject> getUser(@Path("username") String username);
}
