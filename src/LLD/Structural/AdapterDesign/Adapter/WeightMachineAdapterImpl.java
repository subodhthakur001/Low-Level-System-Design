package LLD.Structural.AdapterDesign.Adapter;

import LLD.Structural.AdapterDesign.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPounds();

        double weightInKg = weightInPound * .45;
        return  weightInKg;
    }
}
