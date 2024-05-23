package Brigde;

public abstract class Car {
    protected CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public abstract void detaylariGoster();
}
