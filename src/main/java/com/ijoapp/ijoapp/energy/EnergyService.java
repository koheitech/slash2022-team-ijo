package com.ijoapp.ijoapp.energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyService {

    private final EnergyRepository energyRepository;

    @Autowired
    public EnergyService(EnergyRepository energyRepository){
        this.energyRepository = energyRepository;
    }
    public List<Energy> getEnergies(){
        return this.energyRepository.findAll();
    }

    public void addNewEnergy(Energy energy) {
        System.out.println(energy);
        energyRepository.save(energy);
    }
}
