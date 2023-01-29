import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> group = new ArrayList<>();
        group.add(new Person("Johnes", 14, 6, 1986));
        group.add(new Person("Johnes", 21, 11, 1989));
        group.add(new Person("Thomson", 14, 6, 1986));
        group.add(new Person("Phillips", 14, 6, 1979));
        group.add(new Person("Roberts", 18, 3, 1991));
        System.out.println(group);
        group.sort(null);
        System.out.println(group);

        ArrayList<Student> studentGroup = new ArrayList<>();
        studentGroup.add(new Student("Johnes", 14, 6, 1986, 3.45));
        studentGroup.add(new Student("Johnes", 14, 6, 1986, 4.95));
        studentGroup.add(new Student("Thomson", 14, 6, 1986, 4.25));
        studentGroup.add(new Student("Phillips", 14, 6, 1979, 4.25));
        studentGroup.add(new Student("Roberts", 18, 3, 1991, 3.45));
        System.out.println(studentGroup);
        group.sort(null);
        System.out.println(studentGroup);
        Student studentClone = studentGroup.get(4).clone();
        System.out.println(studentClone);
        System.out.println(studentGroup.get(1).compareTo(studentGroup.get(0)));
        System.out.println("================================");
        Print.print(group);
    }


}