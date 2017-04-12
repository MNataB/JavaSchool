package vault.implement;

import vault.concept.Predicate;
import vault.concept.UniVault;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SBT-Biryukov-VV on 06.04.2017.
 */
public class HashMapVault<K,V> implements UniVault<K,V> {

    private Map<K,V> map = new HashMap<>();


    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void putAll(Map<K, ? extends V> entries) {
        map.putAll(entries);
    }

    @Override
    public Map<K, V> getAllByKeys(Collection<K> keys) {

        Map<K,V> innerMap = new HashMap<K, V>();

        for (K key : keys) {
            innerMap.put(key,map.get(key));

        }

        return innerMap;
    }

    @Override
    public Collection<V> getAllByPredicate(Predicate<? super V> p) {

        Collection<V> collection = new ArrayList<V>();

        for (V v : map.values()) {
            if (p.apply(v)){
                collection.add(v);
            }
        }

        return collection;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
