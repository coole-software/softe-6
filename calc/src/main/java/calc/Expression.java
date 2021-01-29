package calc;


interface Expression<T> extends ExpressionVisitor<T> {
    void accept(ExpressionVisitor<T> visitor);
}
