package chapter01;

public class IfTest {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x должен равняться 3");
        } else {
            System.out.println("x не равняется 3");
        }
        System.out.println("Эта строка выполняется в любом случае");
    }
}
