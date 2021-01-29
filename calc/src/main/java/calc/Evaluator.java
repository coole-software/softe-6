package calc;

import java.util.Map;

public class Evaluator implements ExpressionVisitor<Integer> {
    
    public static int evaluate(Expression e, Map<String,Integer> variables) {
        return e.accept(new Evaluator(variables));
    }
}
