package com.example.demo;

import com.example.demo.entity.Plant;
import com.example.demo.repository.PlantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PlantRepository plantRepository;

    public DataInitializer(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Plant plant1 = new Plant();
        plant1.setName("Rozsa");
        plant1.setType("Virag");
        plant1.setQuantity(15);
        plant1.setPrice(30.5);

        Plant plant2 = new Plant();
        plant2.setName("Fuszeres Bazsalikom");
        plant2.setType("Fuszeres Noveny");
        plant2.setQuantity(8);
        plant2.setPrice(12.8);

        Plant plant3 = new Plant();
        plant3.setName("Karacsonyi kaktusz");
        plant3.setType("Kaktusz");
        plant3.setQuantity(18);
        plant3.setPrice(22);

        Plant plant4 = new Plant();
        plant4.setName("Fugekaktusz");
        plant4.setType("Kaktusz");
        plant4.setQuantity(40);
        plant4.setPrice(20);

        Plant plant5 = new Plant();
        plant5.setName("Tulipan");
        plant5.setType("Virag");
        plant5.setQuantity(50);
        plant5.setPrice(10.8);

        plantRepository.save(plant1);
        plantRepository.save(plant2);
        plantRepository.save(plant3);
        plantRepository.save(plant4);
        plantRepository.save(plant5);
    }
}
