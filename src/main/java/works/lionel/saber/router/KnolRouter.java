package works.lionel.saber.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.server.*;
import works.lionel.saber.handler.KnolHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
@Slf4j
public class KnolRouter {

    /* sets up index under resources */
    @Bean
    public RouterFunction<ServerResponse> htmlRouter(@Value("classpath:/index.html") Resource html) {
        return route(GET("/"), request
                -> ok().contentType(MediaType.TEXT_HTML).bodyValue(html).log()
        );
    }

    /* sets up routes by their HTTP methods employed */
    @Bean
    public static RouterFunction<ServerResponse> knolRoutes(@NonNull KnolHandler knolHandler) {
        return route()
                .GET("/knols", knolHandler::findAll)
                .GET("/knols/id/{id}", knolHandler::findById)
                .GET("/knols/name/{title}", knolHandler::findByTitle)
                .POST("/knols", knolHandler::save)
                .DELETE("/knols/id/{id}", knolHandler::deleteById)
                .build();
    }

}
