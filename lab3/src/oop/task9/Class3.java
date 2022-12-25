package oop.task9;

public class Class3 {
    public static void main(String[] args) {
        Class1 classElement = new Class1();
        System.out.println("Вызван метод addition класса Class1");
        System.out.println(classElement.addition(23, 344));
        System.out.println("Вызван метод multiplication класса Class1");
        System.out.println(classElement.multiplication(34.53, 34.00));

        Class2  classElement2 = new Class2();
        System.out.println("Вызван метод subtraction класса Class2");
        System.out.println(classElement2.subtraction(23, 344));
        System.out.println("Вызван метод division класса Class2");
        System.out.println(classElement2.division(34.53, 34.00));
    }
}
