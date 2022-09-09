class FizzBuzz implements Game {

    @Override
    public void play() {
        for (int i = 1; i <= 100; i++) {
            String result = getResultFor(i);
            System.out.println(result);
        }
    }

    private String getResultFor(int number) {
        String result = number+"";
        if (multipleOf(number, 3)) {
            result = "Fizz";
            if (multipleOf(number, 5))
                result += "Buzz";
        }
        else if (multipleOf(number, 5))
            result = "Buzz";
        return result;
    }

    private boolean multipleOf(int numberForMultiple, int multipleNumber) {
        return numberForMultiple % multipleNumber == 0;
    }
}