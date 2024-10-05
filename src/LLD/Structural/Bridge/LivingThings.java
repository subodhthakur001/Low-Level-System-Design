package LLD.Structural.Bridge;

public abstract class LivingThings {
    BreatheImplentor breatheImplentor;
    public LivingThings(BreatheImplentor breatheImplentor){
        this.breatheImplentor = breatheImplentor;
    }

    abstract public  void BreatheProcess();

}
