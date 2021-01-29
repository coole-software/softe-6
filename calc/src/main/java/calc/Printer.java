package calc;

public class Printer implements ExpressionVisitor<String>{
    public static String toString(Expression e) {
        return e.accept(new Printer());
    }

    T visitAddition(Addition addition);
    T visitDivision(Division division);
    T visitMultiplication(Multiplication multiplication);
    T visitSubtraction(Subtraction subtraction);
}
