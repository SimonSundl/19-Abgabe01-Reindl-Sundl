public class Main {

    public static void main(String[] args) {
        // TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
        Calculator calc = new Calculator.CalculatorImpl();

        calc.addValue(20);	// currently highest number
        calc.addValue(4);	// currently lowest number
        calc.addValue(16);

        System.out.println(calc.getMinimum());
        System.out.println(calc.getMaximum());
        System.out.println(calc.sum());
        // add other integers

        // output lowest number

        // output highest number

        // output sum of all numbers

    }
}
