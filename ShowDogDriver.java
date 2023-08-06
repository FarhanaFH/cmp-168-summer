public class ShowDogDriver {
    public static void main(String[] args) {
        ShowDog dog1 = new ShowDog("Charlie");
        ShowDog dog2 = new ShowDog("Luna");
        ShowDog dog3 = new ShowDog("Buddy", "Labrador Retriever", true, 5, 2);

        try {
            checkQualification(dog1);
            System.out.println(dog1.getName() + " is qualified.");
        } catch (UnqualifiedShowDogException e) {
            System.out.println(dog1.getName() + " is unqualified. Reason: " + e.getMessage());
        }

        try {
            checkQualification(dog2);
            System.out.println(dog2.getName() + " is qualified.");
        } catch (UnqualifiedShowDogException e) {
            System.out.println(dog2.getName() + " is unqualified. Reason: " + e.getMessage());
        }

        try {
            checkQualification(dog3);
            System.out.println(dog3.getName() + " is qualified.");
        } catch (UnqualifiedShowDogException e) {
            System.out.println(dog3.getName() + " is unqualified. Reason: " + e.getMessage());
        }
    }

    public static void checkQualification(ShowDog showDog) throws UnqualifiedShowDogException {
        if (showDog.getName().equals("Unspecified") || showDog.getBreed().equals("Unspecified")) {
            throw new UnqualifiedShowDogException("Name or breed not specified.");
        }
        if (!showDog.getIsVaccinated()) {
            throw new UnqualifiedShowDogException("Dog is not vaccinated.");
        }
        if (showDog.getAgeInDogYears() < 3) {
            throw new UnqualifiedShowDogException("Dog is not at least 3 years old.");
        }
    }
}

