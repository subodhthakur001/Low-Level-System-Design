package LLD.Structural.Bridge;

public class Tree extends LivingThings{

    public Tree(BreatheImplentor breatheImplentor){
        super(breatheImplentor);
    }
    @Override
    public void BreatheProcess() {
        breatheImplentor.Breathe();
    }
}
