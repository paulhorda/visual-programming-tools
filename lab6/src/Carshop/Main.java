package Carshop;

import Carshop.Cars.Car;
import Carshop.Cars.Ford;
import Carshop.Cars.Sedan;
import Carshop.Cars.Truck;
import Carshop.Impl.MyOwnAutoShop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(new Ford(324, true, 5000.0, "dark", 2022, 4));
        arrayList.add(new Sedan(324, true, 3000.0, "dark", 2022));
        arrayList.add(new Truck(324, true, 5000.0, "dark", 2022));
        MyOwnAutoShop myOwnAutoShop = new MyOwnAutoShop(arrayList);

        System.out.println(myOwnAutoShop.getIncome());
        System.out.println(myOwnAutoShop.getCarColors());
    }
}
