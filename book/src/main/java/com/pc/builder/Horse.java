package com.pc.builder;

/**
 *
 * @author pengchao
 * @since 2022/8/3 11:45
 */
public class Horse {

    private String jiaDian;
    private String diBan;

    public Horse(String jiaDian, String diBan) {
        this.jiaDian = jiaDian;
        this.diBan = diBan;
    }

    public static HorseBuilder builder() {
        return new HorseBuilder();
    }

    public static class HorseBuilder {
        //维护和创建类一样的属性
        private String jiaDian;
        private String diBan;

        public HorseBuilder jiaDian(String jiaDian) {
            this.jiaDian = jiaDian;
            return this;
        }

        public HorseBuilder diBan(String diBan) {
            this.diBan = diBan;
            return this;
        }

        public Horse build() {
            return new Horse(jiaDian,diBan);
        }
    }

    public static void main(String[] args) {
        Horse horse1 = Horse.builder().diBan("大理石").jiaDian("冰箱").build();
        Horse horse2 = Horse.builder().jiaDian("冰箱").build();
    }

}
