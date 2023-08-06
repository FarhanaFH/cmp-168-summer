// Homework 5-1
public class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String toString() {
        return String.format("Food - name: %10s | calories: %4d", name, calories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Food food = (Food) other;
        return name.equals(food.getName()) && calories == food.getCalories();
    }
}
