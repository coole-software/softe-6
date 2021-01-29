package calc;

public class Subtraction<T> extends Binary<T> {

    public Subtraction(Expression<T> lhs, Expression<T> rhs) {
        super(lhs, rhs);
    }

/*     @Override
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
    } */

    @Override
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitSubtraction(this);
    }
}
