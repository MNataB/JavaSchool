package pecs;

import java.util.Arrays;
import java.util.List;

import static pecs.CollectionUtils.newArrayList;


/**
 * Created by sbt-manuilova-nb on 13.04.2017.
 */
public class MainPECS {
    public static void main(String[] args) {

        List<Pets> pets1 = CollectionUtils.newArrayList();
        List<Cats> cats1 = CollectionUtils.newArrayList();


        Cats cat1 = new Cats("Besik");
        Cats cat2 = new Cats("Yasha");

        cats1.add(cat1);
        //cats1.add(cat2);

        System.out.println("---------- pets1 ---------");
        System.out.println(pets1);
        CollectionUtils.addAll(cats1,pets1);
        System.out.println(pets1);

        List<Pets> pets2 = CollectionUtils.newArrayList();
        pets2 = CollectionUtils.limit(pets1,1);
        System.out.println("---------- pets2 ---------");
        System.out.println(pets2);

        System.out.println("---------- cats1 ---------");
        System.out.println(cats1);

        CollectionUtils.removeAll(pets1,cats1);
        System.out.println("---------- pets1 ---------");
        System.out.println(pets1);

        List<Animals> animals1 = CollectionUtils.newArrayList();
        animals1.add(cat1);
        animals1.add(cat2);
        System.out.println("---------- animals1 ---------");
        System.out.println(animals1);
//        CollectionUtils.removeAll(animals1,cats1);
//        System.out.println("---------- animals1 ---------");
//        System.out.println(animals1);

        if (CollectionUtils.containsAny(animals1,cats1) == true)
            System.out.println("contains");
        else
            System.out.println("not contains");
    }
}
