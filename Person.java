public abstract class Person extends Passenger {
    private int numOffspring;

    public Person() {
        super();
        this.numOffspring = 0;
    }

    public Person(int numOffspring) {
        super();
        setNumOffspring(numOffspring);
    }

    public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
        super(name, birthYear, weight, height, gender, numCarryOn);
        setNumOffspring(numOffspring);
    }

    public void setNumOffspring(int numOffspring) {
        if (numOffspring >= 0) {
            this.numOffspring = numOffspring;
        } else {
            this.numOffspring = 0;
        }
    }

    public int getNumOffspring() {
        return this.numOffspring;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Person: Number of Offspring: %4d\n", this.getNumOffspring());
    }

    @Override
    public String toString() {
        String passengerDetails = super.toString();
        String personDetails = String.format("Person: Number of Offspring: %4d\n", this.getNumOffspring());
        return passengerDetails + personDetails;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return super.equals(person) && this.getNumOffspring() == person.getNumOffspring();
        }
        return false;
    }

	public double metabolizeAccumulatedCalories() {
		// TODO Auto-generated method stub
		return 0;
	}
}
