import java.util.*;

/**
 * Created by Наталья on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(Arrays.asList("1","2","3","5","4"));
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
        List<person> personList = new ArrayList<person>();

        personList.add(new person("Nata M", new Date()));
        personList.add(new person("Irina B", new Date()));
        personList.add(new person("Tamara T", new Date()));

        Collections.sort(personList, new Comparator<person>() {
            public int compare(person o1, person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(personList.toString());
        //System.out.println(PersonsUtils.getPersonsCount(personList).toString());

        System.out.println(PersonsUtils.getPersonsCount(Collections.unmodifiableCollection(personList)).toString());
        System.out.println(personList.toString());

    }

}
