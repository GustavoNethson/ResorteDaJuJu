package br.unipar.programacaointernet.resortunipar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.unipar.programacaointernet.resortunipar.repository")
public class ResortUniparApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResortUniparApplication.class, args);
    }

}
