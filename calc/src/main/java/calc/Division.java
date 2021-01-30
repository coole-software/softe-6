package calc;

public class Division extends Binary {

    public Division(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    protected int compute(int a, int b) {
        return a / b;
    }

    protected String symbol() {
        return "/";
    }

    public int rank() {
        return 1;
    } 

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor){
        return visitor.visitDivision(this);
    }
}
