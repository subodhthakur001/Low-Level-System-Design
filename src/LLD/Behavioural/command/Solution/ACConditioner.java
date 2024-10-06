package LLD.Behavioural.command.Solution;

public class ACConditioner {
    boolean isOn = false;
    int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is turned ON");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is turned OFF");
    }

    public void setTemperature(int temp){
        temperature = temp;
    }
}