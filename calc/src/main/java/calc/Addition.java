package calc;

public class Addition<T> extends Binary<T> implements Associative {

    public Addition(Expression<T> lhs, Expression<T> rhs) {
        super(lhs, rhs);
    }

/*     @Override
    protected int compute(int a, int b) {
        return a + b;
    }
    @Override
    protected String symbol() {
        return "+";
    }
    @Override
    public int rank() {
        return 2;
    } */

    @Override
    public T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitAddition(this);
    }
}
