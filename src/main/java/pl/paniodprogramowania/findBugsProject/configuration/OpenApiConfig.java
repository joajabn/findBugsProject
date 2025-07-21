package pl.paniodprogramowania.findBugsProject.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Profile;

@Profile({"dev", "local"})
@OpenAPIDefinition(
    servers = {
        @Server(
            description = "Localhost",
            url = "http://localhost:8087/pop/dancers"
        )
    }
)
public class OpenApiConfig {
}