package works.lionel.saber.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;
import works.lionel.saber.KnolClient;
import works.lionel.saber.model.Knol;
import works.lionel.saber.repository.KnolRepository;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.EntityResponse.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

/**
 *
 * Component that houses all handler methods for {@link Knol} objects.
 * Since handler methods can become unruly, it makes sense to encapsulate them.
 * This is the direct analogue to controller handler methods.
 * @see works.lionel.saber.router.KnolRouter
 * @author Lionel Beato
 *
 */
@Component
public class KnolHandler {

    @Autowired
    private KnolRepository knolRepository;

    public Mono<ServerResponse> findAll(ServerRequest req) {
        return ok()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(knolRepository.findAll(), Knol.class)
                .log();
    }

    public Mono<ServerResponse> deleteById(ServerRequest req) {
        return accepted()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(knolRepository.deleteById(req.pathVariable("id")), Knol.class);
    }

    public Mono<ServerResponse> findById(ServerRequest req) {
        return ok()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(knolRepository.findById(req.pathVariable("id")), Knol.class);
    }

    public Mono<ServerResponse> save(ServerRequest req) {
        Mono<Knol> knol = req.bodyToMono(Knol.class);

        return created(req.uri())
                .body(knol.flatMap(knolRepository::save), Knol.class);

    }

    public Mono<ServerResponse> findByTitle(ServerRequest req) {
        System.out.println(req.pathVariable("title"));
        return ok()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(KnolClient.consume(req.pathVariable("title")), Knol.class)
                .log();
    }
}
