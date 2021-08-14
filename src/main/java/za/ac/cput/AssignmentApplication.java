package za.ac.cput;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }
}
