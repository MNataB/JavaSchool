package vault.concept;

/**
 * Created by SBT-Biryukov-VV on 06.04.2017.
 */
public interface Predicate<E> {


    /**
     *
     * @param elm
     * @return
     */
    boolean apply(E elm);
}
