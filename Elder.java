public class Elder extends Person implements Mover {

    @Override
    public double metabolizeAccumulatedCalories() {
        double weightGained = 0;
        int calories = this.getCaloriesAccumulator();
        while (calories - 300 >= 0) {
            weightGained++;
            this.gainWeight();
            calories -= 300;
        }
        if (calories < 300) {
            double frac = calories / 300.00;
            this.gainWeight(frac);
        }
        this.setCaloriesAccumulator(0);
        return weightGained;
    }

    private void setCaloriesAccumulator(int i) {
		// TODO Auto-generated method stub
		
	}

	private int getCaloriesAccumulator() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public void eat(Food food) {
        int foodCals = food.getCalories();

        int calsConsumed = this.getCaloriesConsumed();
        this.setCaloriesConsumed(calsConsumed + foodCals);

        int calsAccumulated = this.getCaloriesAccumulator();
        this.setCaloriesAccumulator(calsAccumulated + foodCals);
    }

    @Override
    public void eat(Food[] food) {
        int totalCaloriesAdded = 0;
        for (Food nomnom : food) {
            totalCaloriesAdded += nomnom.getCalories();
        }

        int caloriesConsumed = this.getCaloriesConsumed();
        this.setCaloriesConsumed(caloriesConsumed + totalCaloriesAdded);

        int caloriesAccumulated = this.getCaloriesAccumulator();
        this.setCaloriesAccumulator(caloriesAccumulated + totalCaloriesAdded);
    }

    @Override
    public String move() {
        return "ouch my back wait for me";
    }

    @Override
    public String move(int count) {
        StringBuilder movement = new StringBuilder();
        while (count > 1) {
            movement.append("ouch my back wait for me\n");
            count--;
        }
        movement.append("ouch my back wait for me");
        return movement.toString();
    }
}
