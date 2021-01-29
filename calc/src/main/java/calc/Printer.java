package calc;

public class Printer implements ExpressionVisitor<String>{
    public static String toString(Expression e) {
        return e.accept(new Printer());
    }
}
