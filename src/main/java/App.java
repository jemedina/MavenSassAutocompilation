import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jose.medina on 8/4/2017.
 */
@SpringBootApplication
@ComponentScan("com.sassautocompiler")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
