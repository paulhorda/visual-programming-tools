package oop.task9;

public class Class2 extends Class1{
    @Override
    public double addition(double firstNumber, double secondNumber) {
        System.out.println("Переопределенный метод суммирования");
        return super.addition(firstNumber, secondNumber);
    }
}
