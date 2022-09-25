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
    private String Processes;
    private String DateTime;
    private String LoadAvg;
    private String CPU;
    private String SharedLibs;
    private String MemRegions;
    private String PhysMem;
    private String VM;
    private String Networks;
    private String Disks;

    public Energy () {

    }

    public Energy(String processes, String dateTime, String loadAvg, String CPU, String sharedLibs, String memRegions, String physMem, String VM, String networks, String disks) {
        this.Processes = processes;
        this.DateTime = dateTime;
        this.LoadAvg = loadAvg;
        this.CPU = CPU;
        this.SharedLibs = sharedLibs;
        this.MemRegions = memRegions;
        this.PhysMem = physMem;
        this.VM = VM;
        this.Networks = networks;
        this.Disks = disks;
    }

    public String getLoadAvg() {
        return LoadAvg;
    }

    public void setLoadAvg(String loadAvg) {
        LoadAvg = loadAvg;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getSharedLibs() {
        return SharedLibs;
    }

    public void setSharedLibs(String sharedLibs) {
        SharedLibs = sharedLibs;
    }

    public String getMemRegions() {
        return MemRegions;
    }

    public void setMemRegions(String memRegions) {
        MemRegions = memRegions;
    }

    public String getPhysMem() {
        return PhysMem;
    }

    public void setPhysMem(String physMem) {
        PhysMem = physMem;
    }

    public String getVM() {
        return VM;
    }

    public void setVM(String VM) {
        this.VM = VM;
    }

    public String getNetworks() {
        return Networks;
    }

    public void setNetworks(String networks) {
        Networks = networks;
    }

    public String getDisks() {
        return Disks;
    }

    public void setDisks(String disks) {
        Disks = disks;
    }


    public String getProcesses() {
        return Processes;
    }

    public void setCpu(String Processes) {
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
