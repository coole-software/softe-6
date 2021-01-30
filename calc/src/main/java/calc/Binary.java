package calc;

public abstract class Binary implements Expression {
    public final Expression lhs;
    public final Expression rhs;

    public String brackets(Expression e, boolean strict) {
        String s = Printer.toString(e);
        int outerRank = Ranker.rank(this);
        int innerRank = Ranker.rank(e);
        if (innerRank > outerRank || strict && innerRank == outerRank) {
            s = "(" + s + ")";
        }
        return s;
    }

    public Binary(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

}
