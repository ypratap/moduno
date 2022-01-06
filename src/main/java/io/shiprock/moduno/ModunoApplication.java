package io.shiprock.moduno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModunoApplication {
    public String welcome(){
        return "welcome !!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ModunoApplication.class, args);
    }

}
