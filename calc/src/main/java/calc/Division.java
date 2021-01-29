package calc;

public class Division<T> extends Binary<T> {

    public Division(Expression<T> lhs, Expression<T> rhs) {
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
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitDivision(this);
    }
}
