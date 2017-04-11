package vault.implement;

import vault.concept.Predicate;
import vault.developers.Developer;

/**
 * Created by SBT-Biryukov-VV on 06.04.2017.
 */
public class HighIQPredicate implements Predicate<Developer> {
    @Override
    public boolean apply(Developer elm) {

        if (elm.getIq().compareTo(130) > 0)
            return true;

        return false;
    }
}
