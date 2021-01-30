package calc;

public class Addition extends Binary implements Associative {

    public Addition(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    protected int compute(int a, int b) {
        return a + b;
    }

    protected String symbol() {
        return "+";
    }

    public int rank() {
        return 2;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitAddition(this);
    }

}
