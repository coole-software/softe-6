package calc;

import java.util.Map;

public abstract class Binary implements Expression {
    public final Expression lhs;
    public final Expression rhs;
    
    public Binary(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

}
