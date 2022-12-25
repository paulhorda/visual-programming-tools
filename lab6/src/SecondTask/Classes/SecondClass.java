package SecondTask.Classes;

import SecondTask.Interface.MyInterface;

import java.math.BigInteger;
import java.util.Objects;

public class SecondClass implements MyInterface {
    @Override
    public boolean match(int number1, int number2) {
        BigInteger first = BigInteger.valueOf(number1);
        BigInteger second = BigInteger.valueOf(number2);
        boolean probablePrimeFirst = first.isProbablePrime((int) Math.log(number1));
        boolean probablePrimeSecond = second.isProbablePrime((int) Math.log(number2));
        return probablePrimeFirst && probablePrimeSecond;
    }
}
