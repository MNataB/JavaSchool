/**
 * Created by Наталья on 04.04.2017.
 */
public class OrderPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    public OrderPair(K key, V i) {
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

}
