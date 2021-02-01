package calc;

import java.util.Map;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionTest {
    @Test
    public void testParse(){
        String expression = "a * 2 + b";
        Expression e = Parser.parse(expression);
        
        assertEquals(expression, Printer.toString(e));
    }

    @Test
    public void testArgumentAssign() {
        String expression = "a * 2 + b";
        Expression e = Parser.parse(expression);
        Map<String, Integer> variables = new HashMap<>();
        variables.put("a", 3);
        variables.put("b", 8);
        int result = Evaluator.evaluate(e, variables);

        assertEquals(14,result);
    }

    @Test
    public void testParseBrackets(){
        String expression = "a / (b - (c + d))";
        Expression e = Parser.parse(expression);

        assertEquals(expression, Printer.toString(e));
    }

    @Test
    public void testParseBracketsShort(){
        String expression = "a / (b + (c + d))";
        Expression e = Parser.parse(expression);
        String newExpression = "a / (b + c + d)";

        assertEquals(newExpression,Printer.toString(e));
    }
    
}