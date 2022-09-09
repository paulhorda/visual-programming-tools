package task1;

public class Task1 {
    public boolean isIncreaseProgressive(int[] mas) {
        if (mas.length < 2) return false;

        boolean result = true;

        for (int i = 1; i < mas.length; i++)
            if (mas[i - 1] > mas[i]) {
                result = false;
                break;
            }
        return result;
    }
}
