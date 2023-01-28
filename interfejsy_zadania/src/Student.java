public class Student extends Person implements Cloneable, Comparable<Person>{
    private double gpa;
    public Student(String surname, int dayOfBirth, int monOfBirth, int yrOfBirth, double gpa) {
        super(surname, dayOfBirth, monOfBirth, yrOfBirth);
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            int comparison = super.compareTo(s);
            if (comparison != 0) {
                return comparison;
            }
            return Double.compare(gpa, s.gpa);
        }
        return super.compareTo(p);
    }

    @Override
    public String toString() {
        return super.toString() +
                "[gpa=" + gpa + ']';
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.gpa = gpa;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
