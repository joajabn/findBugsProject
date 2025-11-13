package pl.paniodprogramowania.findBugsProject.github.retrofit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    @Value("${api.github.url}")
    private String githubUrl;

    @Bean
    public GithubApi githubApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(githubUrl)
                .addConverterFactory(GsonConverterFactory.create()) //zamienia json na klasy
                .build();

        return retrofit.create(GithubApi.class);
    }
}
