package com.company;

public class Food {

    protected String foodName;
    private String foodType;
    private int numOfDish;
    private String foodState;
    private boolean isSpicy;
    private boolean isVegi;

    public Food() {

    }
    public Food(String foodName, String foodType, int numOfDish, String foodState, boolean isSpicy, boolean isVegi) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.numOfDish = numOfDish;
        this.foodState = foodState;
        this.isSpicy = isSpicy;
        this.isVegi = isVegi;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumOfDish() {
        return numOfDish;
    }

    public void setNumOfDish(int numOfDish) {
        this.numOfDish = numOfDish;
    }

    public String getFoodState() {
        return foodState;
    }

    public void setFoodState(String foodState) {
        this.foodState = foodState;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public boolean isVegi() {
        return isVegi;
    }

    public void setVegi(boolean vegi) {
        isVegi = vegi;
    }

    protected void eatFood() {
        System.out.println("eat food!");
    }
}
