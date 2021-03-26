package works.lionel.saber.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.server.*;
import works.lionel.saber.handler.KnolHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@Slf4j
public class KnolRouter {

    @Bean
    public static RouterFunction<ServerResponse> knolRoutes(@NonNull KnolHandler knolHandler) {
        return RouterFunctions
                .route()
                .GET("/knols", knolHandler::findAll)
                .GET("/knols/id/{id}", knolHandler::findById)
                .GET("/knols/name/{title}", knolHandler::findByTitle)
                .POST("/knols", knolHandler::save)
                .DELETE("/knols/id/{id}", knolHandler::deleteById)
                .build();
    }

}
