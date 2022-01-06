package io.shiprock.moduno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModunoApplication {

/*    echo "# modduos" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/ypratap/modduos.git
    git push -u origin main*/

    public String welcome(){
        return "welcome !!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ModunoApplication.class, args);
    }

}
