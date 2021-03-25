package works.lionel.saber.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.RouterFunctions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import works.lionel.saber.KnolClient;
import works.lionel.saber.model.Knol;
import works.lionel.saber.repository.KnolRepository;

import java.time.Duration;
import java.util.Random;

/**
 *
 */
@RestController
@CrossOrigin
public class MainController {

//    KnolRepository knolRepository;
//
//    public MainController(KnolRepository knolRepository) {
//        this.knolRepository = knolRepository;
//    }
//
//    @GetMapping("/teapot")
//    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
//    public String getHello() {
//        return "Hell world!";
//    }
//
//    @PostMapping("/new")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Mono<Knol> getKnol(@RequestBody Knol knol) {
//        return knolRepository
//                .save(knol);
//    }
//
//    @GetMapping(value = "test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<String> getMsg(){
//        return Flux.fromStream(new Random()
//                .ints(10)
//                .mapToObj(value -> "this is data " + value))
//                .delayElements(Duration.ofSeconds(1))
//                .repeat();
//    }
//
//    @GetMapping(value = "/all")
//    public Flux<Knol> getAll() {
//        return knolRepository
//                .findAll();
//    }

}
