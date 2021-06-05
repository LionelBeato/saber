package works.lionel.saber;

import com.google.common.flogger.FluentLogger;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import works.lionel.saber.model.ContentUrls;
import works.lionel.saber.model.Knol;
import works.lionel.saber.model.Image;
import works.lionel.saber.model.User;
import works.lionel.saber.repository.KnolRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Lionel Beato
 */
@Component
public class Runner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(Runner.class);
    @Autowired
    KnolRepository knolRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello world!");
        WebClient client = WebClient.create("http://localhost:8080");

//            private String id;
//    private String title;
//    private String description;
//    private ContentUrls content_urls;
//    private Image originalimage;
//    private Image thumbnail;
//    private String extract;

        Knol knol1 = new Knol("id",
                "title",
                "description",
                null,
               null,
                null,
                "extract",
                null);

        knolRepository.save(knol1).log();

        Flux<Knol> result = client.get()
                    .uri("/all")
                    .retrieve()
                    .bodyToFlux(Knol.class);

        knolRepository.findAll()
                .map(Knol::toString)
                .subscribe(value -> logger.info(value));

        Flux.just("red", "white", "blue")
                .map(String::toUpperCase)
                .subscribe(value -> logger.info(value));


    }
}
