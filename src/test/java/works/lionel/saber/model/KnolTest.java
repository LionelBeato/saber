package works.lionel.saber.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import works.lionel.saber.SaberApplication;
import works.lionel.saber.repository.KnolRepository;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SaberApplication.class)
class KnolTest {

    @Autowired
    KnolRepository repository;

    @Test
    void testKnolClassNameField() {
//        Knol knol = new Knol();
//        var actual = knol.getName();
//        var expected = "Nintendo";
//        assertEquals(expected, actual);
    }

    @Test
    public void givenValue_whenFindAllByValue_thenFindAccount() throws InterruptedException {
//        repository.save(new Knol("Nintendo", "description")).block();
//        Flux<Knol> knolFlux = repository.findAll();
//
//        StepVerifier
//                .create(knolFlux)
//                .assertNext(knol -> {
//                    assertEquals("Nintendo", knol.getName());
//                })
//                .expectComplete()
//                .verify();
    }



}