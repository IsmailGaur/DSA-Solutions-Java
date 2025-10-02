interface Addable {
    int add(int a, int b);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        Addable sum = (a, b) -> a + b;
        System.out.println("sum" + sum.add(21, 32));
    }

}
