package SecondTask;

import SecondTask.Classes.FirstClass;
import SecondTask.Classes.SecondClass;

public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.match(15, 2));
        SecondClass secondClass = new SecondClass();
        System.out.println(secondClass.match(11, 3));
    }
}
