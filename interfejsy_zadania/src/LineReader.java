import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LineReader {
    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("D:\\GitHub\\OOP_166309\\interfejsy_zadania\\text.txt"));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        for(String line : lines)
        {
            System.out.println(line);
        }

        System.out.println("Natural order:");

        lines.sort(null);

        for(String line : lines)
        {
            System.out.println(line);
        }

        System.out.println("Shortest to longest:");

        class LineLengthComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }

        lines.sort(new LineLengthComparator());

        for(String line : lines)
        {
            System.out.println(line);
        }

        ArrayList<String> linie = new ArrayList<>(lines);

        System.out.println("Natural order:");

        linie.sort(null);

        for(String line : linie)
        {
            System.out.println(line);
        }

        System.out.println("Shortest to longest:");

        linie.sort(new LineLengthComparator());

        for(String line : linie)
        {
            System.out.println(line);
        }


    }
}
