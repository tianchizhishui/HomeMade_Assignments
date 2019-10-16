package com.company;

public class AmericanFood extends Food {

    private String foodOrigin;
    private String foodClassification;

    public AmericanFood() {

    }

    public AmericanFood(String foodOrigin, String foodClassification) {
        this.foodOrigin = foodOrigin;
        this.foodClassification = foodClassification;
    }

    public AmericanFood(String foodName, String foodType, int numOfDish, String foodState, boolean isSpicy, boolean isVegi, String foodOrigin, String foodClassification) {
        super(foodName, foodType, numOfDish, foodState, isSpicy, isVegi);
        this.foodOrigin = foodOrigin;
        this.foodClassification = foodClassification;
    }

    public String getFoodOrigin() {
        return foodOrigin;
    }

    public void setFoodOrigin(String foodOrigin) {
        this.foodOrigin = foodOrigin;
    }

    public String getFoodClassification() {
        return foodClassification;
    }

    public void setFoodClassification(String foodClassification) {
        this.foodClassification = foodClassification;
    }
}
