package calc;

import java.util.Map;

public abstract class Binary implements Expression {
    private final Expression lhs;
    private final Expression rhs;


    public Binary(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

}
