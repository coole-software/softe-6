package calc;


interface Expression extends ExpressionVisitor<T> {
    T accept(ExpressionVisitor<T> visitor);
}
