package oop.task12;

public class Main {
    public static void main(String[] args) {
        Fractions one = new Fractions(12, 23);
        Fractions two = new Fractions(23, 2);
        Fractions result = one.addition(two);
        System.out.println((int)result.getInteger()+ "."+ (int)result.getFractional());
    }
}
