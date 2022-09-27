package strings.task2;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int result1 = task2.getSumOfNumbers("1234dfg56789");
        int result2 = task2.getSumOfNumbers("dfg1dfg2");
        int result3 = task2.getSumOfNumbers("dfgdfg");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
