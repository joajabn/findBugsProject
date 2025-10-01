package pl.paniodprogramowania.findBugsProject.retrofit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

  @Bean
  public GithubApi githubApi(){
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create()) //zamienia json na klasy
        .build();

    return retrofit.create(GithubApi.class);
  }
}
