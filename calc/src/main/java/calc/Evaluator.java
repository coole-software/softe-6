
package calc;

import java.util.Map;

public class Evaluator implements ExpressionVisitor<Integer> {

    private final Map<String, Integer> variables;

    public Evaluator(Map<String, Integer> variables) {
        this.variables = variables;
    }

    public static int evaluate(Expression e, Map<String, Integer> variables) {
        return e.accept(new Evaluator(variables));
    }
    @Override
    public Integer visitAddition(Addition addition) {
        return evaluate(addition, variables);
    }

    @Override
    public Integer visitDivision(Division division) {
        return evaluate(division, variables);
    }

    @Override
    public Integer visitMultiplication(Multiplication multiplication) {
        return evaluate(multiplication, variables);
    }

    @Override
    public Integer visitSubtraction(Subtraction subtraction) {
        return evaluate(subtraction, variables);
    }
    


}
