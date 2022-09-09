package task2;

public class FizzBuzzGame implements Game {
    final String FIZZ = "Fizz";
    final String BUZZ = "Buzz";

    @Override
    public void play() {
        for (int i = 1; i <= 100; i++) {
            String result = getResultFor(i);
            System.out.println(result);
        }
    }

    private String getResultFor(int number) {
        String result = number + "";
        boolean multipleOf3 = multipleOf(number, 3);
        boolean multipleOf5 = multipleOf(number, 5);

        if (multipleOf3) {
            result = FIZZ;
            if (multipleOf5)
                result += BUZZ;
        } else if (multipleOf5)
            result = BUZZ;
        return result;
    }

    private boolean multipleOf(int numberForMultiple, int multipleNumber) {
        return numberForMultiple % multipleNumber == 0;
    }
}