// Problem 3: 
public abstract class AbstractDog {
    private String name;
    private String breed;
    private int ageInDogYears;
    private boolean isVaccinated;

    public AbstractDog() {
        this.name = "Unspecified";
        this.breed = "Unspecified";
        this.ageInDogYears = 0;
        this.isVaccinated = false;
    }

    public AbstractDog(String name, String breed, int ageInDogYears, boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.ageInDogYears = (ageInDogYears < 0) ? 0 : ageInDogYears;
        this.isVaccinated = isVaccinated;
    }

    // Same getter and setter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public int getAgeInDogYears() {
        return ageInDogYears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void setAgeInDogYears(int ageInDogYears) {
        this.ageInDogYears = (ageInDogYears < 0) ? 0 : ageInDogYears;
    }

    // Step 1:  toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\nBreed: " + breed + "\nAge (in dog years): " + ageInDogYears + "\nIs Vaccinated: " + isVaccinated;
    }

    // Step 2: abstract methods
    public abstract void speak();
    public abstract void sit();
}
