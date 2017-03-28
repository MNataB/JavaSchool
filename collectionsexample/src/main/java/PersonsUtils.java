import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Наталья on 28.03.2017.
 */
public class PersonsUtils {
    public static Integer getPersonsCount (Collection<person> personList) {
        personList.add(new person("Ivan K", new Date()));
        return personList.size();
    }
}
