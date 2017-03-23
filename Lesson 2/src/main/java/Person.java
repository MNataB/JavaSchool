/**
 * Created by Наталья on 22.03.2017.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry (Person person) {
        if ((this.man == person.man) || (this.spouse != null) && (this.spouse == person)) return false;
        if (this.spouse != null) this.spouse.divorce();
        this.divorce();
        if (person.spouse != null) person.spouse.divorce();
        person.divorce();
        person.spouse = this;
        this.spouse = person;
        return true;
      }

    public boolean divorce() {
        if (this.spouse != null) {
            spouse = null;
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person(true, "John");
        Person person2 = new Person(false, "Marry");
        Person person3 = new Person(true, "Andrew");
        Person person4 = new Person(false, "Katy");
        Person person5 = new Person(false, "Samanta");

        person1.spouse = person2;
        person2.spouse = person1;
        person3.spouse = person4;
        person4.spouse = person3;

        System.out.println(person2.marry(person1));
        System.out.println(person1.marry(person2));
        System.out.println(person2.marry(person3));
        System.out.println(person2.marry(person4));
        System.out.println(person2.marry(person5));
        System.out.println(person5.marry(person1));
    }
}

