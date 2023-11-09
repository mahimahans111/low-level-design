package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKgs(){
        double weightInPound = weightMachine.getWeightInPounds();

        double weightInKgs = weightInPound*.45;
        return weightInKgs;
    }
}
