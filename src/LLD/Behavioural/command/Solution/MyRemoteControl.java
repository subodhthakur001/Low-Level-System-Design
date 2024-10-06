package LLD.Behavioural.command.Solution;

public class MyRemoteControl {
    ICommand command;
    MyRemoteControl(){

    }
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
