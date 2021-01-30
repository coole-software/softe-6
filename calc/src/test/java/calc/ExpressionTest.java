package calc;

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
    public void  argumentAssign(){
        int a = 3;
        int b = 8;
        int result = a*2+b;

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