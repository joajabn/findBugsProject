package pl.paniodprogramowania.findBugsProject.github.restClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RestClientConfiguration {

    @Bean
    public RestClient restClient() {
        return RestClient.create("https://api.github.com/");
    }
}
