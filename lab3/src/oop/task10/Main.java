package oop.task10;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Jon", "m", 180, 80);
        OldHuman oldHuman = new OldHuman("Old Jon", "f", 180, 60, 60, 50000);
        System.out.println(human);
        System.out.println(oldHuman);

        human.congratulation();
        oldHuman.parting();
        human.greeting();
        oldHuman.greeting();
    }
}
