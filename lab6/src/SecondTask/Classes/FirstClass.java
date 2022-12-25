package SecondTask.Classes;

import SecondTask.Interface.MyInterface;

import java.util.Objects;

public class FirstClass implements MyInterface {
    @Override
    public boolean match(int number1, int number2) {
        return number1>number2;
    }
}
