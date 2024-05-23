package Brigde;

public class BMW extends Car {
    public BMW(CarType carType) {
        super(carType);
    }

    @Override
    public void detaylariGoster() {
        System.out.print("BMW ");
        carType.showType();
    }
}