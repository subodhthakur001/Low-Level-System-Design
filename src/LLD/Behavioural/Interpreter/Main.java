package LLD.Behavioural.Interpreter;

public class Main {
    public static void main(String args[]){
        Context context = new Context();
        context.put("a",2);
        context.put("b",3);
        context.put("c",3);
        context.put("d",3);

        //(a * b)
        AbstractExpression expression1 = new MultiplyTerminalExpression(new NonTerminalExpression("a"), new NonTerminalExpression("b"));
        // ((a*b) + (b *c))
        AbstractExpression expression2 = new SumNonTerminalExpression(new MultiplyTerminalExpression(new NonTerminalExpression("a"), new NonTerminalExpression("b"))
                                        ,new MultiplyTerminalExpression(new NonTerminalExpression("c"), new NonTerminalExpression("d")));

        // same using BinaryNonTerminalExpression
        AbstractExpression expression3 = new BinaryNonTerminalExpression(new BinaryNonTerminalExpression(new NonTerminalExpression("a"),
                                         new NonTerminalExpression("b"),'+'),new BinaryNonTerminalExpression(new NonTerminalExpression("c"), new NonTerminalExpression("d"),'*'),'*');

        System.out.println(expression3.interpret(context));
    }
}
