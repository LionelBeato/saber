package works.lionel.saber;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import works.lionel.saber.model.Knol;

@Component
public class KnolClient {

    private final WebClient client = WebClient.create("http://localhost:8080");

    public void consume() {
       Flux<Knol> result = client.get()
                .uri("/all")
                .retrieve()
                .bodyToFlux(Knol.class);
        System.out.println("Printing result: " + result);
    }
}
