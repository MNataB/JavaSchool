package vault.production;

import vault.concept.UniVault;
import vault.developers.Developer;
import vault.developers.java.JavaDeveloper;
import vault.implement.HashMapVault;
import vault.implement.HighIQPredicate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Наталья on 12.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        //////////////// Consumer Super ////////////////

        // Объявляем хранилище javaDeveloper'ов
        UniVault<String, JavaDeveloper> javaDeveloperVault = new HashMapVault<>();

        javaDeveloperVault.put("Yanis", new JavaDeveloper("Yanis",120));
        javaDeveloperVault.put("Maxim", new JavaDeveloper("Maxim",125));
        javaDeveloperVault.put("Irina", new JavaDeveloper("Irina",140));
        javaDeveloperVault.put("Vadim", new JavaDeveloper("Vadim",130));

        // За счет сигнатуры Collection<V> getAllByPredicate(Predicate<? super V> p);
        // можем теперь применять(принимать) предикаты, работающие и с предками объектов хранилища
        Collection<JavaDeveloper> allByPredicate = javaDeveloperVault.getAllByPredicate(new HighIQPredicate());


        System.out.println("---- Consumer Super ------------------------");
        System.out.println(allByPredicate);
        System.out.println("------------------- ------------------------");

        //////////////// Producer Extends ////////////////

        // Объявляем хранилище обычных Developer'ов
        UniVault<String, Developer> developerVault = new HashMapVault<>();

        Map<String, JavaDeveloper> javaDeveloperMap = new HashMap<>();

        javaDeveloperMap.put("Yanis", new JavaDeveloper("Yanis",120,false));
        javaDeveloperMap.put("Maxim", new JavaDeveloper("Maxim",125,true));
        javaDeveloperMap.put("Irina", new JavaDeveloper("Irina",140,false));
        javaDeveloperMap.put("Vadim", new JavaDeveloper("Vadim",130,true));

        // За счет сигнатуры void putAll(Map<K, ? extends V> entries)
        // можем теперь сохранять(поставлять) в хранилище не только Developer'ов, но и их потомков
        developerVault.putAll(javaDeveloperMap);

        System.out.println("---- Producer Extends ----------------------");
        System.out.println(developerVault);
        System.out.println("------------------- ------------------------");

    }
}

