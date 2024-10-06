package LLD.Behavioural.command.Solution;

public class Main {

    public static void main(String args[]){
        ACConditioner acConditioner = new ACConditioner();

        MyRemoteControl myRemoteControl = new MyRemoteControl();

        myRemoteControl.setCommand(new turnOnAcCommand(acConditioner));

        myRemoteControl.pressButton();

    }
}
