package calc;

public class Subtraction<T> extends Binary<T> {

    public Subtraction(Expression<T> lhs, Expression<T> rhs) {
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
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitSubtraction(this);
    }
}
