package calc;

import java.util.Map;

public abstract class Binary<T> implements Expression<T>{
    private final Expression<T> lhs;
    private final Expression<T> rhs;


    public Binary(Expression<T> lhs, Expression<T> rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public int evaluate(Map<String, Integer> variables) {
        return compute(lhs.evaluate(variables), rhs.evaluate(variables));
    }

    private String brackets(Expression<T> e, boolean strict) {
        String s = e.toString();
        int outerRank = rank();
        int innerRank = e.rank();
        if (innerRank > outerRank || strict && innerRank == outerRank) {
            s = "(" + s + ")";
        }
        return s; 
        return null;
    } 

}
