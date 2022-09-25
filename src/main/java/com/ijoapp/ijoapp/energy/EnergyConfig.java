package com.ijoapp.ijoapp.energy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EnergyConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            EnergyRepository repository){
        return args -> {
            EnergyExtraction data = new EnergyExtraction();
            Energy newLaptop = new Energy(data.getData().get(0), data.getData().get(1));

            repository.saveAll(
              List.of(newLaptop)
            );
        };
    }
}
