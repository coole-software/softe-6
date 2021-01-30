package calc;

public class Printer implements ExpressionVisitor<String>{

    public static String toString(Expression e) {
        return e.accept(new Printer());
    }

    public String visitAddition(Addition addition) {
        return addition.brackets(addition.lhs, false) + " + "
            + addition.brackets(addition.rhs, !(this instanceof Associative));
    }
    public String visitDivision(Division division){
        return division.brackets(division.lhs, false) + " / "
            + division.brackets(division.rhs, !(this instanceof Associative));
    }
    public String visitMultiplication(Multiplication multiplication){
        return multiplication.brackets(multiplication.lhs, false) + " * "
            + multiplication.brackets(multiplication.rhs, !(this instanceof Associative));
    }
    public String visitSubtraction(Subtraction subtraction){
        return subtraction.brackets(subtraction.lhs, false) + " - "
            + subtraction.brackets(subtraction.rhs, !(this instanceof Associative));
    }
    public String visitValue(Value value){
        return Integer.toString(value.value);
    }
    public String visitVariable(Variable variable){
        return variable.name;
    }
}
