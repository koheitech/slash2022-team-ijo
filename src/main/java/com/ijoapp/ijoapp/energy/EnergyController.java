package com.ijoapp.ijoapp.energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/energy")
public class EnergyController {

    private final EnergyService energyService;

    @Autowired
    public EnergyController(EnergyService energyService){
        this.energyService =  energyService;
    }

    @GetMapping
    public List<Energy> getEnergies(){
        return energyService.getEnergies();
    }

    @PostMapping // Unable to do POST
    public void registerNewEnergy(@RequestBody Energy energy){
        energyService.addNewEnergy(energy);
    }
}
