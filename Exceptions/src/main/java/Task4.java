/**
 * Created by Наталья on 11.04.2017.
 */
public class Task4 {
    Object o = new Object();
    public static void main(String[] args) {
        try {
            throw new Exception("first");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
