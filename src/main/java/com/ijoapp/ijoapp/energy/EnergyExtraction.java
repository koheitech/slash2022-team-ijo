package com.ijoapp.ijoapp.energy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EnergyExtraction {

    private List<String> data = new ArrayList<>();
    public EnergyExtraction() throws IOException {
        // creating list of commands
        List<String> commands = new ArrayList<String>();
        commands.add("top"); // command

        // creating the process
        ProcessBuilder pb = new ProcessBuilder(commands);

        // starting the process
        Process process = pb.start();

        // for reading the output from stream
        BufferedReader stdInput
                = new BufferedReader(new InputStreamReader(
                process.getInputStream()));
        String s = null;
        for (int i=0;i<10;i++){
            if ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                this.data.add(s);
            }
        }
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

}
