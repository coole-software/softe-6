package calc;

public class Division<T> extends Binary<T> {

    public Division(Expression<T> lhs, Expression<T> rhs) {
        super(lhs, rhs);
    }

/*     @Override
    protected int compute(int a, int b) {
        return a / b;
    }

    @Override
    protected String symbol() {
        return "/";
    }

    @Override
    public int rank() {
        return 1;
    } */

    @Override
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitDivision(this);
    }
}
