package calc;

public class Multiplication<T> extends Binary<T> implements Associative {

    public Multiplication(Expression<T> lhs, Expression<T> rhs) {
        super(lhs, rhs);
    }

/*     @Override
    protected int compute(int a, int b) {
        return a * b;
    }

    @Override
    protected String symbol() {
        return "*";
    }

    @Override
    public int rank() {
        return 1;
    } */
    @Override
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitMultiplication(this);
    }
}
