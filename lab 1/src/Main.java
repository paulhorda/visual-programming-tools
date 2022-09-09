import Task3.Task3;
import task1.Task1;
import task2.FizzBuzzGame;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        //Task 1
        int[] arrayForTest = {1, 2, 3, 4, 5, 6};
        Task1 task1 = new Task1();
        boolean resultTask1 = task1.isIncreaseProgressive(arrayForTest);
        System.out.println("Array: "+ Arrays.toString(arrayForTest));
        System.out.println("Result for this array is: " + resultTask1);*/
/* //Task 2
        FizzBuzzGame fizzBuzz = new FizzBuzzGame();
        System.out.println("Task 2");
        fizzBuzz.play();*/
        //Task 3
        Task3 task3 = new Task3();
        boolean resultTask3 = task3.isEqualPartsOfMassive(new int[]{34, 12, 22});
        System.out.println("Result of equals first and second parts of massive is "+resultTask3);

    }
}
