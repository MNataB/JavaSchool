import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Наталья on 04.04.2017.
 */
public class MainGenerics {
    public static void main(String[] args) {
//        Box<String> StringBox = new Box<String>("Strring");
//        Map<String, Integer> map = new HashMap<>();
        Pair<String, Integer> pair = new OrderPair<> ("key", 0);
    }

}
