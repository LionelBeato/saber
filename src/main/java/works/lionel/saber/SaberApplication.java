package works.lionel.saber;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import works.lionel.saber.model.Knol;
import org.slf4j.*;

/**
 * @author Lionel Beato
 */
@SpringBootApplication
public class SaberApplication {

	/**
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(SaberApplication.class, args);
	}

}
