package se.iths.lambda;

@FunctionalInterface
//@FunctionalInterface säger att interfacet bara får ha en metod
// Detta eftersom den används i samband med lambda
public interface MathCalculation {
    int calculate(int a, int b);
}
