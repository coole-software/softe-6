package calc;

public class Ranker implements ExpressionVisitor<Integer>{
    
    public static int rank(Expression e) {
        return e.accept(new Ranker());
    }

    T visitAddition(Addition addition);
    T visitDivision(Division division);
    T visitMultiplication(Multiplication multiplication);
    T visitSubtraction(Subtraction subtraction);
}
