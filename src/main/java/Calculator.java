public interface Calculator {
    int getMaximum();

    int getMinimum();

    void addValue(int value);

    class CalculatorImpl implements Calculator {
         public int getMaximum(){
            return 0;
         }

         public int getMinimum() {
            return 0;
         }

         public void addValue(int value) {

         }
    }
}
