public abstract class Passenger {
    private String name;
    private int age;
    private int birthYear;
    private double weight;
    private char gender;
    private int numCarryOn;
    private double height;
    private int caloriesConsumed;
    private int caloriesAccumulator;

    public Passenger() {
        this.name = "";
        this.birthYear = 1900;
        this.weight = 0.0;
        this.gender = 'u';
        this.numCarryOn = 0;
    }

    public Passenger(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.caloriesConsumed = 0;
        this.caloriesAccumulator = 0;
    }

    public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
        this();
        this.name = name;
        this.birthYear = birthYear;
        setWeight1(weight);
        setGender1(gender);
        setNumCarryOn(numCarryOn);
    }

    public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
        this(name, birthYear, weight, gender, numCarryOn);
        setHeight(height);
    }

    public int calculateAge(int year) {
        if (year < this.birthYear) {
            return -1;
        }
        return year - this.birthYear;
    }

    public void gainWeight() {
        this.weight += 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public abstract void metabolizeAccumulatedCalories();

    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    // Setters
    public void setName1(String name) {
        this.name = name;
    }

    public void setAge1(int age) {
        this.age = age;
    }

    public void setBirthYear1(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setWeight1(double weight) {
        this.weight = weight;
    }

    public void setGender1(char gender) {
        this.gender = gender;
    }

    public void setNumCarryOn(int numCarryOn) {
        this.numCarryOn = numCarryOn;
    }

public void setCaloriesConsumed(int caloriesConsumed) {
    this.caloriesConsumed = caloriesConsumed;
}

public int getCaloriesAccumulator() {
    return caloriesAccumulator;
}

public void setCaloriesAccumulator(int caloriesAccumulator) {
    this.caloriesAccumulator = caloriesAccumulator;
}

  public double calculateBMI() {
    if (height < 0) {
        return -1;
    } else {
        double bmi = (weight * 703) / (height * height);
        return bmi;
    }
  }
  public void gainWeight(double x){
    if(x < 0){

    }else{
      this.weight += x;
    }
  }
  public int getBirthYear(){
    return this.birthYear;
  }
  public char getGender(){
    return this.gender;
  }
  public String getName(){
    return this.name;
  }
  public double getWeight(){
    return this.weight;
  }
  public int getNumCarryOn(){
    return this.numCarryOn;

  }
  public void setAge(int age) {
    this.age = age;
}
  public boolean isFemale(){
    if(this.gender == 'f' || this.gender == 'F'){
      return true;
    }
    return false;
  }
  public boolean isMale(){
    if(this.gender == 'm' || this.gender == 'M'){
      return true;
    }
    return false;
  }
  public void loseWeight(){
    this.weight -= 1;
    if (this.weight < 0){
      this.weight = 0;
    }
  }
  public void loseWeight(double x){
    this.weight -= x;
    if (this.weight < 0){
      this.weight = 0;
    }
  }
  public void printDetails() {
	    System.out.printf("Name: %-20s | Year of Birth: %4d | Weight: %8.2f | Height: %8.2f | Gender: %c | NumCarryOn: %2d%n",
	                      name, birthYear, weight, height, gender, numCarryOn);
	}

	@Override
	public String toString() {
	    return String.format("Name: %-20s | Year of Birth: %4d | Weight: %8.2f | Height: %8.2f | Gender: %c | NumCarryOn: %2d%n",
	                         name, birthYear, weight, height, gender, numCarryOn);
	}
@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof Passenger)) {
        return false;
    }
    Passenger other = (Passenger) obj;
    return name.equals(other.name) &&
            birthYear == other.birthYear &&
            weight == other.weight &&
            height == other.height &&
            gender == other.gender &&
            numCarryOn == other.numCarryOn;
}
public void setGender(char Gen) {
    this.gender = (Gen != 'f' && Gen != 'm') ? 'u' : Gen;
}

public void setName(String x) {
    this.name = x;
}

public void setBirthYear(int x) {
    this.birthYear = x;
}

public void setWeight(double x) {
    this.weight = (x < 0) ? -1 : x;
}

public void setNumCarryOn1(int x) {
    this.numCarryOn = (x < 0) ? 0 : (x > 2) ? 2 : x;
}
}
