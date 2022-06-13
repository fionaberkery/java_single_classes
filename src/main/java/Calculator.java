public class Calculator {

    private int value1;
    private int value2;

    public Calculator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    // add
    public int addValues() {
        int num1 = value1;
        int num2 = value2;
         return (num1 + num2);
    }


    // subtract
    public int subtractValues() {
        int num1 = value1;
        int num2 = value2;
        return (num1 - num2);
    }

    // multiply
    public int multiplyValues() {
        int num1 = value1;
        int num2 = value2;
        return (num1 * num2);
    }


    //divide
    public int divideValues() {
        int num1 = value1;
        int num2 = value2;
        return (num1 / num2);
    }


}
