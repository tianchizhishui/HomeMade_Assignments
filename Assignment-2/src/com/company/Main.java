package com.company;

public class Main {
    public static void main(String[] args) {
        AsianFood aFood1 = new AsianFood("chicken, peanut", "Sichuan Province", 10 );
        aFood1.setFoodName("宫保鸡丁");
        System.out.println(aFood1.getFoodName());
        aFood1.eatFood();

        Food food = new Food();
        food.setFoodName("爆炒鱿鱼");
        food.eatFood();

        String s = "sdfsd";
        System.out.println(s.length());

        int[] arr = new int[2];
        System.out.println(arr.length);
    }
}
