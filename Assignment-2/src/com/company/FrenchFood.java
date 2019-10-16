package com.company;

public class FrenchFood extends Food {

    private String foodIngredients;
    private int foodPrice;
    private boolean withGarlic;

    public FrenchFood() {

    }

    public FrenchFood(String foodIngredients, int foodPrice, boolean withGarlic) {
        this.foodIngredients = foodIngredients;
        this.foodPrice = foodPrice;
        this.withGarlic = withGarlic;
    }

    public FrenchFood(String foodName, String foodType, int numOfDish, String foodState, boolean isSpicy, boolean isVegi, String foodIngredients, int foodPrice, boolean withGarlic) {
        super(foodName, foodType, numOfDish, foodState, isSpicy, isVegi);
        this.foodIngredients = foodIngredients;
        this.foodPrice = foodPrice;
        this.withGarlic = withGarlic;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public boolean isWithGarlic() {
        return withGarlic;
    }

    public void setWithGarlic(boolean withGarlic) {
        this.withGarlic = withGarlic;
    }
}
