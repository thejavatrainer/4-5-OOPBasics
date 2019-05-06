package workshop;

import java.util.Objects;

public class Person {

    private String name;
    private String CNP;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(CNP, person.CNP);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, CNP);
    }
}
