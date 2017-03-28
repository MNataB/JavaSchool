import java.util.Date;

/**
 * Created by Наталья on 28.03.2017.
 */
public class person {
    private String name;
    private Date dateBirthday;

    public person(String name, Date dateBirthday) {
        this.name = name;
        this.dateBirthday = dateBirthday;
    }

    public String getName() {
        return name;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                '}' + "\n";
    }
}

