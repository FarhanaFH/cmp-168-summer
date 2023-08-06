public interface Eater {

    public void eat(Food food);

    public void eat(Food[] food);

    public double metabolizeAccumulatedCalories();

    public int caloriesConsumed = 0;
}
