package LLD.Structural.Decorator;

public class Jalepeno extends ToppingDecorator{
    BasePizza basePizza;
    public Jalepeno (BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
