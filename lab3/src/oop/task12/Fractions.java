package oop.task12;

public class Fractions {
    private double integer;
    private double fractional;

    public Fractions(double integer, double fractional) {
        this.integer = integer;
        this.fractional = Math.abs(fractional);
    }

    public Fractions addition(Fractions fractions){
        double integerPartSum = integer + fractions.getInteger();
        double fractionSum = fractions.getFractional() + fractional;
        return new Fractions(integerPartSum, fractionSum);
    }

//    public double multiplication(){
//        return
//    }
//
//    public double subtraction(){
//        return
//    }
//
//    public double division(){
//        return
//    }

    public double getInteger() {
        return integer;
    }

    public double getFractional() {
        return fractional;
    }
}
