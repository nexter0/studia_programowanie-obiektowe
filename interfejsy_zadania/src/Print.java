import java.util.Iterator;

public class Print{
    public static <E> void print(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            if (iterator.hasNext())
                System.out.print(", ");
        }
        System.out.println();
    }
}
