package calc;

public class Multiplication<T> extends Binary<T> implements Associative {

    public Multiplication(Expression<T> lhs, Expression<T> rhs) {
        super(lhs, rhs);
    }

    protected int compute(int a, int b) {
        return a * b;
    }

    protected String symbol() {
        return "*";
    }


    public int rank() {
        return 1;
    } 
    
    @Override
    public T accept(ExpressionVisitor<T> visitor){
        return visitor.visitMultiplication(this);
    }
}
