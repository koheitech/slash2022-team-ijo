package com.ijoapp.ijoapp.energy;

import javax.persistence.*;

@Entity
@Table
public class Energy {


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
    private String Processes;// Need regex to separation
    private String DateTime;// Either convert to date data typ or no? depends on the efficiency


    public Energy () {

    }

    public Energy(String processes, String dateTime) {
        this.Processes = processes;
        this.DateTime = dateTime;

    }

    public String getProcesses() {
        return Processes;
    }

    public void setProcesses(String Processes) {
        this.Processes = Processes;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public void setId(Long id) {
        this.idUsage = id;
    }

    public Long getId() {
        return idUsage;
    }
}
