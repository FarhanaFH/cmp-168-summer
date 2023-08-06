import java.util.Objects;
public class Person extends Passenger {
    private int numOffspring;

    public Person() {
        super();
        numOffspring = 0;
    }

    public Person(int numOff) {
        super();
        this.numOffspring = numOff;
    }

    public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOff) {
        super(name, birthYear, weight, height, gender, numCarryOn);

        if (numOff <= 0)
            numOffspring = 0;
        else
            numOffspring = numOff;
    }

    public void setNumOffspring(int numOff) {
        if (numOff <= 0)
            numOffspring = 0;
        else
            numOffspring = numOff;
    }

    public int getNumOffspring() {
        return numOffspring;
    }

    public void printDetails() {
        super.printDetails();
        System.out.printf("Person: Number of Offspring: %4d\n", getNumOffspring());
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("\nPerson: Number of Offspring: %4d\n", numOffspring);
        return str;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(numOffspring);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        return numOffspring == other.numOffspring;
    }
}
