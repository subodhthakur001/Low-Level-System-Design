package LLD.Behavioural.Interpreter;

public class Main {
    public static void main(String args[]){
        Context context = new Context();
        context.put("a",2);
        context.put("b",3);

        AbstractExpression expression1 = new MultiplyTerminalExpression(new NonTerminalExpression("a"), new NonTerminalExpression("b"));
        System.out.println(expression1.interpret(context));
    }
}
