package works.lionel.saber;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import works.lionel.saber.model.Knol;

@Slf4j
public class KnolTest {

    Knol knol;

    @BeforeEach
    void setup() {
        log.info("initializing knol variable...");
    }

    @Test
    public void test(){
        log.info("This is a test!");
    }
}
