package calc;

public class Subtraction extends Binary {

    public Subtraction(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int compute(int a, int b) {
        return a - b;
    }

    @Override
    protected String symbol() {
        return "-";
    }

    @Override
    public int rank() {
        return 2;
    }

    T accept(ExpressionVisitor<T> visitor){
        
    }
}
