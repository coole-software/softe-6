package calc;

public class Printer implements ExpressionVisitor<String>{

    public static String toString(Expression<String> e) {
        return e.accept(new Printer());
    }

    public String visitAddition(Addition addition) {
        return toString(addition);
    }
    public String visitDivision(Division division){
        return toString(division);
    }
    public String visitMultiplication(Multiplication multiplication){
        return toString(multiplication);
    }
    public String visitSubtraction(Subtraction subtraction){
        return toString(subtraction);
    }
}
