package com.company;

public class ItalianFood extends Food {
    private String foodIngredients;
    private String sauceType;
    private String pastaType;

    public ItalianFood() {

    }

    public ItalianFood(String foodIngredients, String sauceType, String pastaType) {
        this.foodIngredients = foodIngredients;
        this.sauceType = sauceType;
        this.pastaType = pastaType;
    }

    public ItalianFood(String foodName, String foodType, int numOfDish, String foodState, boolean isSpicy, boolean isVegi, String foodIngredients, String sauceType, String pastaType) {
        super(foodName, foodType, numOfDish, foodState, isSpicy, isVegi);
        this.foodIngredients = foodIngredients;
        this.sauceType = sauceType;
        this.pastaType = pastaType;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getPastaType() {
        return pastaType;
    }

    public void setPastaType(String pastaType) {
        this.pastaType = pastaType;
    }
}
