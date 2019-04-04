public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator.CalculatorImpl();

        calc.addValue(20);
        calc.addValue(4);
        calc.addValue(16);
        calc.addValue(15);
        calc.addValue(25);
        calc.addValue(5);
        calc.addValue(1);
        calc.addValue(37);

        System.out.println(calc.getMinimum());
        System.out.println(calc.getMaximum());
        System.out.println(calc.sum());

    }
}
