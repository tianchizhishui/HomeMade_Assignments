package com.company;

public class AsianFood extends Food {
    private String foodIngredients;
    private String foodOriginalArea;
    private int numOfFoodIngredients;

    public AsianFood() {

    }

    // constructor1
    public AsianFood(String foodIngredients, String foodOriginalArea, int numOfFoodIngredients) {
        this.foodIngredients = foodIngredients;
        this.foodOriginalArea = foodOriginalArea;
        this.numOfFoodIngredients = numOfFoodIngredients;
    }

    // constructor2
    public AsianFood(String foodName, String foodType, int numOfDish, String foodState, boolean isSpicy, boolean isVegi, String foodIngredients, String foodOriginalArea, int numOfFoodIngredients) {
        super(foodName, foodType, numOfDish, foodState, true, isVegi);
        this.foodIngredients = foodIngredients;
        this.foodOriginalArea = foodOriginalArea;
        this.numOfFoodIngredients = numOfFoodIngredients;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    public String getFoodOriginalArea() {
        return foodOriginalArea;
    }

    public void setFoodOriginalArea(String foodOriginalArea) {
        this.foodOriginalArea = foodOriginalArea;
    }

    public int getNumOfFoodIngredients() {
        return numOfFoodIngredients;
    }

    public void setNumOfFoodIngredients(int numOfFoodIngredients) {
        this.numOfFoodIngredients = numOfFoodIngredients;
    }

    @Override
    protected void eatFood() {
        System.out.println("eat " + this.foodName);
    }
}
