package calc;

public class Subtraction extends Binary {

    public Subtraction(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    protected int compute(int a, int b) {
        return a - b;
    }


    protected String symbol() {
        return "-";
    }


    public int rank() {
        return 2;
    } 

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor){
        return visitor.visitSubtraction(this);
    }
}
