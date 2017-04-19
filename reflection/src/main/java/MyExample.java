import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;

/**
 * Created by sbt-manuilova-nb on 18.04.2017.
 */
public class MyExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        Class cl = Class.forName("java.lang.String");
//        Class clSuper = cl.getSuperclass();
//        System.out.println(cl);
//        Method[] m = clSuper.getMethods();
//        for (int i = 0; i < m.length; i++) {
//            if (m[i].toString().indexOf("get") >= 0) System.out.println(m[i]);
//        }

        Field[] f = Calendar.class.getDeclaredFields();
        for (int i = 0; i < f.length; i++) {
            System.out.println("f[i] = " + f[i] + ", name = " + f[i].getName() + ", name = " + f[i].getName());
        }
    }
}
