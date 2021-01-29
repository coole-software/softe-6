package calc;

public class Ranker implements ExpressionVisitor<Integer>{
    
    public static int rank(Expression e) {
        return e.accept(new Ranker());
    }
}
