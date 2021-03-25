package works.lionel.saber;

import com.google.common.flogger.FluentLogger;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import works.lionel.saber.model.Knol;

/**
 * @author Lionel Beato
 */
@Component
public class Runner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(Runner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello world!");
        WebClient client = WebClient.create("http://localhost:8080");

        Flux<Knol> result = client.get()
                    .uri("/all")
                    .retrieve()
                    .bodyToFlux(Knol.class);

    }
}
