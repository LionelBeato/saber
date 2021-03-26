package works.lionel.saber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import works.lionel.saber.model.Knol;

@Component
@Slf4j
public class KnolClient {

    private final static WebClient client = WebClient.create("https://en.wikipedia.org/api/rest_v1/page/summary");

    public static Mono<Knol> consume(String title) {
       return client.get()
                .uri("/" + title.replace(" ", "_"))
                .retrieve()
                .bodyToMono(Knol.class);
    }
}
