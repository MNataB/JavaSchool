package pecs;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by sbt-manuilova-nb on 13.04.2017.
 */
public class CollectionUtils<T> {
    public static <T> void addAll (List<? extends T> source, List<? super T> desination) {
        desination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> sourse, T o){
        return sourse.indexOf(o);
    };

    public static <T> List<T> limit(List<? extends T> source, int size){
        List<T> result = new ArrayList<T>();
        result.addAll(source.subList(0,size));
        return result;
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }
    public static <T> void removeAll(List<? super T> removeFrom, List<?  extends T> c2) {
        for (T elm : c2) {
            removeFrom.remove(elm);
        }
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        for (T elm : c2) {
            if (c1.contains(elm)) continue;
            else return false;
        }
        return true;
    }

    public static <T> boolean containsAny (List<? extends T> c1, List<? extends T> c2) {
        for (T elm : c2) {
            if (c1.contains(elm)) return true;
        }
        return false;
    }

    // ?? comparable ??
    public static <T> List<? super T> range(List<? extends T> list, T min, T max) {
        List<? super T> rangeList = new ArrayList<>();
        return rangeList;
    }

    // ?? comparable ??
    public static <T> List<? super T> range(List<? extends T> list, T min, T max, Comparator comparator) {
        List<? super T> rangeList = new ArrayList<>();
        return rangeList;
    }
}
