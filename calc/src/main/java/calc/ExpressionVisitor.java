package calc;

public interface ExpressionVisitor<T> {
    T visitAddition(Addition visitor);
    T visitDivision(Division division);
    T visitMultiplication(Multiplication multiplication);
    T visitSubtraction(Subtraction subtraction);
}
