// : Without Lambda

interface MyInterface {
    void show();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // : Without Lambda
        // MyInterface obj = new MyInterface() {
        // public void show() {
        // System.out.println("Hello from normal way! ");
        // }
        // };

        MyInterface obj = () -> System.out.println("Hello from lambda! ");
        obj.show();
    }

}
