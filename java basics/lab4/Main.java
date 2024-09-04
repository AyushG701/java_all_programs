package lab4;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.operation();
        int ans = sample.add();
        System.out.println(ans);
        sample.operation2();
    }

}
