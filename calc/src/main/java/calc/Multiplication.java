package calc;

public class Multiplication extends Binary implements Associative {

    public Multiplication(Expression lhs, Expression rhs) {
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
    public <T> T accept(ExpressionVisitor<T> visitor){
        return visitor.visitMultiplication(this);
    }
}
