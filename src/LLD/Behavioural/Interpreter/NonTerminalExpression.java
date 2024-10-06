package LLD.Behavioural.Interpreter;

public class NonTerminalExpression implements AbstractExpression{
    String stringvalue;
    NonTerminalExpression(String stringvalue){
        this.stringvalue = stringvalue;
    }
    @Override
    public int interpret(Context context) {
        return context.get(stringvalue);
    }
}
