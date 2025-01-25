
// Compile-time Polymorphism Example
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Multiplication (int): " + calc.multiply(3, 4));
        System.out.println("Multiplication (double): " + calc.multiply(2.5, 4.5));
    }
}
