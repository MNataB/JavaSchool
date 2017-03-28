/**
 * Created by sbt-manuilova-nb on 27.03.2017.
 */
import java.util.Comparator;
import java.util.TreeSet;

/*class Dog {
    int size;

    Dog(int s) {
        size = s;
    }
}

class SizeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.size - d2.size;
    }
}

public class ImpComparable {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<Dog>(new SizeComparator()); // pass comparator
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));

        for (Dog dd : d) {
            System.out.println(dd.size);
        };
    }
}
*/

class Dog implements Comparable<Dog>{
    int size;

    Dog(int s) {
        size = s;
    }

    @Override
    public int compareTo(Dog o) {
        return this.size - o.size;
    }
}

public class ImpComparable {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<Dog>();
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
        for (Dog dd : d) {
            System.out.println(dd.size);
        };
    }
}

