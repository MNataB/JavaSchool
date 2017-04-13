package pecs;

/**
 * Created by sbt-manuilova-nb on 13.04.2017.
 */
public class Cats extends Pets {
    String name;

    public Cats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }
}
