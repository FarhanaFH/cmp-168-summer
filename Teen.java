public class Teen  {
    public Teen(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
        super();
    }

    public double metabolizeAccumulatedCalories() {
        double accumulatedCalories = this.metabolizeAccumulatedCalories();
        int poundsGained = (int) (accumulatedCalories / 5000);
        this.setWeight(this.getWeight() + poundsGained);
        this.setAccumulatedCalories(0);
		return poundsGained;
    }

    private void setWeight(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setAccumulatedCalories(int i) {
		
	}

	private int getWeight() {
		return 0;
	}

	public String move() {
        return "run fast and jump";
    }
}
