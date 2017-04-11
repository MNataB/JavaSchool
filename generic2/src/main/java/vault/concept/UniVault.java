package vault.concept;

import java.util.Collection;
import java.util.Map;

/**
 * Created by SBT-Biryukov-VV on 06.04.2017.
 */
public interface UniVault<K,V> {

    void put(K key, V value);

    V get(K key);

    void putAll(Map<K, ? extends V> entries);

    Map<K,V> getAllByKeys(Collection<K> keys);

    Collection<V> getAllByPredicate(Predicate<? super V> p);



}
