package calc;

public class Ranker implements ExpressionVisitor<Integer>{
    
    public static int rank(Expression e) {
        return e.accept(new Ranker());
    }

    public Integer visitAddition(Addition addition){
        return rank(addition);
    }
    public Integer visitDivision(Division division){
        return rank(division);
    }
    public Integer visitMultiplication(Multiplication multiplication){
        return rank(multiplication);
    }
    public Integer visitSubtraction(Subtraction subtraction){
        return rank(subtraction);
    }
    public Integer visitValue(Value value){
        return 0;
    }
    public Integer visitVariable(Variable variable){
        return 0;
    }
}
