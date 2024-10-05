package LLD.Structural.Bridge;

public class DogImplementation implements BreatheImplentor{
    @Override
    public void Breathe() {
        System.out.println("Inhales Oxygen");
        System.out.println("Exhales Carbondioxide");
    }
}
