package calc;

public class Printer implements ExpressionVisitor<String>{

    public static String toString(Expression e) {
        return e.accept(new Printer());
    }



    public String brackets(Expression e, boolean strict) {
        String s = toString(e);
        int outerRank = 0;
        int innerRank = Ranker.rank(e);
        if (innerRank > outerRank || strict && innerRank == outerRank) {
            s = "(" + s + ")";
        }
        return s;
    }

    public String visitAddition(Addition addition) {
        return toString(addition.lhs) + "+" + toString(addition.rhs);
    }
    public String visitDivision(Division division){
        return toString(division.lhs) + "/" + toString(division.rhs);
    }
    public String visitMultiplication(Multiplication multiplication){
        return toString(multiplication.lhs) + "*" + toString(multiplication.rhs);
    }
    public String visitSubtraction(Subtraction subtraction){
        return toString(subtraction.lhs) + "-" + toString(subtraction.rhs);
    }
    public String visitValue(Value value){
        return Integer.toString(value.value);
    }
    public String visitVariable(Variable variable){
        return variable.name;
    }
}
