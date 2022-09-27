package strings.task2;

public class Task2 {
    public int getSumOfNumbers(String str) {
        int result = 0;
        for (char e : str.toCharArray())
            result += (e >= '0' && e <= '9') ? Character.getNumericValue(e) : 0;
        return result;
    }
}
