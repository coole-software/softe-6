package calc;

public class Multiplication extends Binary implements Associative {

    public Multiplication(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor){
        return visitor.visitMultiplication(this);
    }
}
