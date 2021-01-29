package calc;


interface Expression<T> extends ExpressionVisitor<T> {
    T accept(ExpressionVisitor<T> visitor);
}
