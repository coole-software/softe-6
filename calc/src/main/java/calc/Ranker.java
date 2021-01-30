package calc;

public class Ranker implements ExpressionVisitor<Integer>{
    
    public static int rank(Expression e) {
        return e.accept(new Ranker());
    }

    public Integer visitAddition(Addition addition){
        return 2;
    }
    public Integer visitDivision(Division division){
        return 1;
    }
    public Integer visitMultiplication(Multiplication multiplication){
        return 1;
    }
    public Integer visitSubtraction(Subtraction subtraction){
        return 2;
    }
    public Integer visitValue(Value value){
        return 0;
    }
    public Integer visitVariable(Variable variable){
        return 0;
    }
}
