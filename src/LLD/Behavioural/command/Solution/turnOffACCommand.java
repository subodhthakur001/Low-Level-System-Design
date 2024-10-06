package LLD.Behavioural.command.Solution;

public class turnOffACCommand implements ICommand{
    ACConditioner ac;

    public turnOffACCommand(ACConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
