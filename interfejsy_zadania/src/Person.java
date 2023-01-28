import java.time.LocalDate;

public class Person implements Cloneable, Comparable<Person> {

    private String surname;
    private LocalDate dateOfBirth;


    public Person(String surname, int dayOfBirth, int monOfBirth, int yrOfBirth) {
        this.surname = surname;
        this.dateOfBirth = LocalDate.of(yrOfBirth, monOfBirth, dayOfBirth);
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return surname.equals(person.surname) && dateOfBirth.equals(person.dateOfBirth);
    }

    public String toString() {
        return getClass().getSimpleName() + " [surname= " + surname + ", " + dateOfBirth.toString() + "]";
    }

    @Override
    public int compareTo(Person p) {
        int comparison = surname.compareTo(p.surname);
        if (comparison != 0) {
            return comparison;
        }
        return dateOfBirth.compareTo(p.dateOfBirth);
    }
}
