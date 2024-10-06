package LLD.Behavioural.command.Solution;

public class turnOnAcCommand implements ICommand{
    ACConditioner ac;
    public turnOnAcCommand(ACConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnOnAC();
    }
}
