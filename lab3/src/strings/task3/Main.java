package strings.task3;

import strings.task2.Task2;

public class Main {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        System.out.println(task3.lengthOfMaxChars("aadfsgd"));
        System.out.println(task3.lengthOfMaxChars("aaadddfff"));
        System.out.println(task3.lengthOfMaxChars("aaaaddddddffff"));
        System.out.println(task3.lengthOfMaxChars("adfsdfadsfasdfasdf"));
    }
}