import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Lec", "dst", (short) 32, 4, 32);
        Student student2 = new Student("sf", "sdf", (short) 32, 4, 32);
        Lecturer lecturer1 = new Lecturer("erw", "cxv", (short) 32, "Math", 32333);
        Lecturer lecturer2 = new Lecturer("jslfl", "sdlfjk", (short) 32, "EMMA", 32333);

        List<Person> mas = Arrays.asList(student1, student2, lecturer1, lecturer2);

        for (Person p : mas) {
            System.out.println(p.printInfo());
        }


        BritishСat britishСat = new BritishСat("Brit", "mice");
        RussianBlueСat russianBlueСat = new RussianBlueСat("Russ", "ice");
        ChineseCat chineseCat = new ChineseCat("China", "Mice");

        System.out.println(britishСat);
        System.out.println(russianBlueСat);
        System.out.println(chineseCat);
    }
}