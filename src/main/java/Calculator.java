public class Calculator {

    int Add(int a, int b){ return a + b;}

    double divide(double a, double b){

        if(b == 0){
            //throws an error if the condition is true
            throw new IllegalArgumentException("Division by 0 is not allowed");

        }
        return a / b;
    }
}
