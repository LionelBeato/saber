package works.lionel.saber.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import works.lionel.saber.handler.KnolHandler;
import works.lionel.saber.model.Knol;
import works.lionel.saber.repository.KnolRepository;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class KnolRouter {

    @Autowired
    KnolRepository knolRepository;

    @Bean
    RouterFunction<?> knolRoutes(@NonNull KnolHandler knolHandler) {
        return RouterFunctions
                .route()
                .GET("/knols", knolHandler::findAll)
                .GET("/knols/{id}", knolHandler::findById)
                .POST("/knols", knolHandler::save)
                .DELETE("/knols/{id}", knolHandler::deleteById)
                .build();
    }




}
