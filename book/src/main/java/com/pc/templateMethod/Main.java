package com.pc.templateMethod;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();


        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
