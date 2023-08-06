// Problem 1 
public class Dog {
    //all private member variables.
    private String name; // default value is "Unspecified"
    private String breed; // default value is "Unspecified"
    private int ageInDogYears; // default value is 0
    private boolean isVaccinated; // default value is false

    // default constructor and overloaded constructor.
    //input age is negative, set age to 0.
    public Dog() {
        this.name = "Unspecified";
        this.breed = "Unspecified";
        this.ageInDogYears = 0;
        this.isVaccinated = false;
    }

    public Dog(String name, String breed, int ageInDogYears, boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.ageInDogYears = (ageInDogYears < 0) ? 0 : ageInDogYears;
        this.isVaccinated = isVaccinated;
    }

    // all getter and setter methods.
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
}
