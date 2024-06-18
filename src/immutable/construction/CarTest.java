package immutable.construction;

import immutable.AbcCar;

public class CarTest {
    public static void main(String[] args){
        AbcCar car = new AbcCar("black","dashboard","alloyWheel");
        System.out.println(car.getColor());
        System.out.println(car.getEngine());
    }
}
