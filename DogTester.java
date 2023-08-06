public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setName("Summer");
        dog1.setBreed("Dachshund");

        dog1.setAgeInDogYears(5);
        dog1.setIsVaccinated(true);

        Dog dog2 = new Dog("Nora", "Labrador Retriever", 7, true);

        System.out.println("Dog 1: ");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println("Age in dog years: " + dog1.getAgeInDogYears());
        System.out.println("Is vaccinated: " + dog1.getIsVaccinated());

        System.out.println("\nDog 2: ");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Age in dog years: " + dog2.getAgeInDogYears());
        System.out.println("Is vaccinated: " + dog2.getIsVaccinated());

        // Test Dog class using if statements and the above 2 objects
        System.out.println("\nTesting Dog class:");
        if (dog1.getName().equals("Summer") &&
            dog1.getBreed().equals("Dachshund") &&
            dog1.getAgeInDogYears() == 5 &&
            dog1.getIsVaccinated()) {
            System.out.println("Dog 1 PASS");
        } else {
            System.out.println("Dog 1 FAIL");
        }

        if (dog2.getName().equals("Nora") &&
            dog2.getBreed().equals("Labrador Retriever") &&
            dog2.getAgeInDogYears() == 7 &&
            dog2.getIsVaccinated()) {
            System.out.println("Dog 2 PASS");
        } else {
            System.out.println("Dog 2 FAIL");
        }
    }
}
