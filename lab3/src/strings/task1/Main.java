package strings.task1;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String isTrueEnd = "hello ed";
        String isFalse = "hello";
        String isFalse3 = "heedllo";

        System.out.println(task1.isEndEd(isTrueEnd));
        System.out.println(task1.isEndEd(isFalse));
        System.out.println(task1.isEndEd(isFalse3));
    }
}
