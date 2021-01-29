package calc;


interface Expression<T> {
    void accept(ExpressionVisitor<T> visitor);
}
