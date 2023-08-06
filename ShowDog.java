public class ShowDog 
extends AbstractDog {
    private static int numDogs = 0;

    private int dogID;
    private int numTrophies;

    // Constructors
    public ShowDog() {
        this("Unspecified", "Unspecified", false, 0, 0);
    }

    public ShowDog(String name) {
        this(name, "Unspecified", false, 0, 0);
    }

    public ShowDog(String name, String breed, boolean isVaccinated, int ageInDogYears, int numTrophies) {
        super(name, breed, ageInDogYears, isVaccinated);
        numDogs++;
        this.dogID = Integer.parseInt("SD" + ageInDogYears + (isVaccinated ? "Y" : "N") + String.format("%03d", numDogs));
        this.numTrophies = numTrophies;
    }

    // Getter methods
    public static int getNumDogs() {
        return numDogs;
    }

    public int getDogID() {
        return dogID;
    }

    public int getNumTrophies() {
        return numTrophies;
    }

    // Method to add a trophy
    public void addTrophy() {
        numTrophies++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDog ID: " + dogID + "\nTrophies: " + numTrophies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowDog showDog = (ShowDog) o;
        return dogID == showDog.dogID;
    }

    @Override
    public void speak() {
        System.out.println("Woof~~");
    }

    @Override
    public void sit() {
        System.out.println("Sitting up~~~");
    }
}
