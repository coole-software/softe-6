package calc;

public interface ExpressionVisitor<T> {
    T visitAddition(Addition addition);
    T visitDivision(Division division);
    T visitMultiplication(Multiplication multiplication);
    T visitSubtraction(Subtraction subtraction);
    T visitValue(Value value);
    T visitVariable(Variable variable);
}
