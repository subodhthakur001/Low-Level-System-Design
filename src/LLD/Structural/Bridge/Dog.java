package LLD.Structural.Bridge;

public class Dog extends LivingThings{
    public Dog(BreatheImplentor breatheImplentor){
        super(breatheImplentor);
    }
    @Override
    public void BreatheProcess() {
        breatheImplentor.Breathe();
    }
}
