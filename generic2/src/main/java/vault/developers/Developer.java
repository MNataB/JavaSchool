package vault.developers;

/**
 * Created by SBT-Biryukov-VV on 06.04.2017.
 */
public class Developer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Developer(String name, Integer iq) {

        this.name = name;
        this.iq = iq;
    }

    private Integer iq;


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                '}';
    }
}
