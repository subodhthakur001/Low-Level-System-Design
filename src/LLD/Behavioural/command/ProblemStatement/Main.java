package LLD.Behavioural.command.ProblemStatement;

public class Main {

    public static void main(String[] args) {
        ACConditioner acConditioner = new ACConditioner();
        acConditioner.turnOnAC();
        acConditioner.setTemperature(24);
        acConditioner.turnOffAC();
    }
}
