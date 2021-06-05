package works.lionel.saber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import works.lionel.saber.model.Knol;

@Component
@Slf4j
public class KnolClient {

    public static Mono<Knol> consume(String title) {

//       return WebClient.create("https://en.wikipedia.org/api/rest_v1/page/summary/")
//               .get()
//               .uri("{title}", title)
//               .retrieve()
//               .bodyToMono(Knol.class)
//               .log();

        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create().followRedirect(true)))
                .baseUrl("https://en.wikipedia.org/api/rest_v1/page/summary/")
                .build()
                .get()
                .uri("{title}", title)
                .retrieve()
                .bodyToMono(Knol.class)
                .log();
    }
}
