package com.pc.oop.di;

/**
 *
 *
 * @author pengchao
 * @since 2022/7/15 14:36
 */
public class GoodClient {

    private Car car;
    private Driver driver;

    public GoodClient(Car car, Driver driver) {
        this.car = car;
        this.driver = driver;
    }


    public void start() {
        driver.drive(car);
    }

    public static void main(String[] args) {
        /*
         * 如果现在需要新增一辆宝马车，或者将奔驰车换成宝马车，或者换一个司机。需要改动高层得Client
         */
        GoodClient client = new GoodClient(new GoodBMWCar(), new GoodCardADriver());
        client.start();

    }

}

interface Car {
    void run();
}

interface Driver {
    void drive(Car car);
}


class GoodBenzCar implements Car {
    public void run() {
        System.out.println("奔驰车开起来");
    }
}

class GoodBMWCar implements Car {
    public void run() {
        System.out.println("宝马车开起来");
    }
}

class GoodCardADriver implements Driver {
    public void drive(Car car) {
        car.run();
    }
}
