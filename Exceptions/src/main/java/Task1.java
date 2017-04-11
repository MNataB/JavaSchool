/**
 * Created by Наталья on 11.04.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        anyMethod();
    }
    private static void anyMethod () {
        divisionByZero();
    }
    private static void divisionByZero () {
        System.out.println(1/0);
    }
}
