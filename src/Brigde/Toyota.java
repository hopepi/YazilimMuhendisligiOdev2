package Brigde;

public class Toyota extends Car {
    public Toyota(CarType carType) {
        super(carType);
    }

    @Override
    public void detaylariGoster() {
        System.out.print("Toyota ");
        carType.showType();
    }
}