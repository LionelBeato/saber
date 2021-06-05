package works.lionel.saber.model;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @author Lionel Beato
 */
@Document
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private Set<Knol> knownKnols;

}
