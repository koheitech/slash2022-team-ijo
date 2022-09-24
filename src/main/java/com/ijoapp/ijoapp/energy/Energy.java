package com.ijoapp.ijoapp.energy;

import javax.persistence.*;

@Entity
public class Energy {

    private String cpu;
    private String gpu;
    @Id
    @SequenceGenerator(
            name = "energy_sequence",
            sequenceName = "energy_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "energy_sequence"
    )
    private Long idUsage;

    public Energy () {

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setId(Long id) {
        this.idUsage = id;
    }

    public Long getId() {
        return idUsage;
    }
}
