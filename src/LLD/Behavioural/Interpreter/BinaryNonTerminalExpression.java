package LLD.Behavioural.Interpreter;

public class BinaryNonTerminalExpression implements  AbstractExpression{
    AbstractExpression leftExpression;
    AbstractExpression rightExprssion;
    char opertaor;

    public BinaryNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExprssion, char opertaor) {
        this.leftExpression = leftExpression;
        this.rightExprssion = rightExprssion;
        this.opertaor = opertaor;
    }

    @Override
    public int interpret(Context context) {
        switch (opertaor){
            case '+' :
                return leftExpression.interpret(context) + rightExprssion.interpret(context);
            case '-' :
                return leftExpression.interpret(context) - rightExprssion.interpret(context);
            case '*':
                return  leftExpression.interpret(context) * rightExprssion.interpret(context);
            default :
                return 0;
        }
    }
}
