package implement;

import vault.concept.Predicate;
import vault.concept.UniVault;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapVault<K,V> implements UniVault<K,V> {
    private Map<K,V> map = new HashMap<K,V>();

    @Override
    public void put(K key, V value) {
        map.put (key,value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void putAll(Map<K, V> entries) {
        map.putAll(entries);
    }

    @Override
    public Map<K, V> getAllByKeys (Collection<K> keys) {

        return null;
    }

    @Override
    public Collection<V> getAllByPredicate(Predicate<V> p) {
        return null;
    }
}
