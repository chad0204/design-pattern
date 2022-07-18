package com.pc.oop.di;

/**
 * 高层模块是Client，让司机开车
 *
 * 低层模块是司机和车
 *
 * @author pengchao
 * @since 2022/7/15 14:26
 */
public class BadClient {

    private BenzCar car;
    private CardADriver driver;

    public BadClient(BenzCar car, CardADriver driver) {
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
        BadClient client = new BadClient(new BenzCar(), new CardADriver());
        client.start();

    }

}

class BenzCar {
   void run() {
       System.out.println("奔驰车开起来");
   }
}

class CardADriver {
    void drive(BenzCar car) {
        car.run();
    }
}


