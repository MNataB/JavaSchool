import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Наталья on 12.04.2017.
 */
public class CountMapImpl<T> implements CountMap<T> {

    private Map<T,Integer> countMapImpl = new HashMap<>();

    @Override
    public void add(T o) {
        if (countMapImpl.containsKey(o))
            countMapImpl.put(o,countMapImpl.get(o) + 1);
        else
            countMapImpl.put(o,1);
    }

    @Override
    public int getCount(T o) {
        if (countMapImpl.containsKey(o))
            return countMapImpl.get(o);
        else
            return 0;
    }

    @Override
    public int remove(T o) {
        int cnt = countMapImpl.get(o);
        countMapImpl.remove(o);
        return cnt;
    }

    @Override
    public int size() {
        return countMapImpl.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T,Integer> innerMap = source.toMap();
        for (Iterator it = innerMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            this.add((T) entry.getKey());
          }
    }

    @Override
    public Map<T,Integer> toMap() {
        return countMapImpl;
    }

    @Override
    public void toMap(Map destination) {
        for (Iterator it = countMapImpl.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            destination.put(entry.getKey(),entry.getValue());
        }

    }
}
