package lab6;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int res1 = myCalculator.operation(2, 3);
        int res2 = myCalculator.operation(2, 4, 6);
        float res3 = myCalculator.operation(2.4f, 4.5f);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        AdvanceCal myAdvanceCal = new AdvanceCal();

        int diff = myAdvanceCal.operation(2,3);

        int mul = myAdvanceCal.operation(2,3,4);

        float  div = myAdvanceCal.operation(2.0f,3.0f);

        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);


    }
}
