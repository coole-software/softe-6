package calc;

import java.beans.Expression;
import java.util.Map;

public class Value extends Expression {
    private final int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(Map<String, Integer> variables) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
