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
            Energy newLaptop = new Energy(
                    data.getData().get(0),//
                    data.getData().get(1),
                    data.getData().get(2),
                    data.getData().get(3),
                    data.getData().get(4),
                    data.getData().get(5),
                    data.getData().get(6),
                    data.getData().get(7),
                    data.getData().get(8),
                    data.getData().get(9));
            repository.saveAll(
              List.of(newLaptop)
            );
        };
    }
}
