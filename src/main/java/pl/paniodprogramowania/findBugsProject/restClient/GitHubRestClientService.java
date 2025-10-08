package pl.paniodprogramowania.findBugsProject.restClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pl.paniodprogramowania.findBugsProject.services.GithubService;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class GitHubRestClientService implements GithubService {
    private final RestClient restClient;

    public GitHubRestClientService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public List<String> getAllUsers() {
        String body = restClient.get()
                .uri("/users")
                .retrieve()
                .body(String.class);

        try {
            JsonArray jsonArray = JsonParser.parseString(body).getAsJsonArray();
            return StreamSupport.stream(jsonArray.spliterator(), false)
                    .map(JsonElement::getAsJsonObject)
                    .map(obj -> obj.get("login").getAsString())
                    .limit(10)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();

        }
        return List.of();


    }

    @Override //todo
    public String getOneUser(String username) {
        String body = restClient.get()
                .uri("/users/{username}", username)
                .retrieve()
                .body(String.class);



        try{

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
