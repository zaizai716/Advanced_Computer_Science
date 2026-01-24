public class Food {
    private int nutrition;
    private String foodName;

    public Food(String foodName, int nutrition) {
        this.foodName = foodName;
        this.nutrition = nutrition;
    }

    public int getNutrition() {
        return nutrition;
    }

    public String getFoodName() {
        return foodName;
    }
}
