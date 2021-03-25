package works.lionel.saber.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import works.lionel.saber.model.Knol;


/**
 * Repository data interface for the model
 * @author Lionel Beato
 */
@Repository
public interface KnolRepository extends ReactiveCrudRepository <Knol, String> {

    @Override
    Mono<Void> deleteById(String s);
}
