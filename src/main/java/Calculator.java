import java.util.ArrayList;

public interface Calculator {
    int sum();

    int getMaximum();

    int getMinimum();

    void addValue(int value);

    class CalculatorImpl implements Calculator {
        ArrayList<Integer> values;

        public int sum(){
            if(this.values == null)
                return 0;
            else {
                int number = 0;
                for(int i = 0; i < values.size(); i++)
                    number = number + values.get(i);
                return number;

            }
        }

        public int getMaximum(){
             if(this.values == null)
                 return 0;
             else {
                 int number = values.get(0);
                 for(int i = 1; i > values.size(); i++)
                     if(values.get(i) < number)
                         number = values.get(i);
                 return number;
             }
         }

         public int getMinimum() {
            if(this.values == null)
                return 0;
            else {
                int number = values.get(0);
                for(int i = 1; i < values.size(); i++)
                    if(values.get(i) < number)
                        number = values.get(i);
                 return number;
            }
         }

         public void addValue(int value) {
            if(this.values == null)
                this.values = new ArrayList<>();
            this.values.add(value);
         }
    }
}
