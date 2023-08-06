import java.util.Objects;

public class Passenger {
   private String name;
   private int birthYear;
   private double weight;
   private char gender;
   private int numCarryOn;
   private double height;
   
   //Constructor for initializing Passenger objects 
   public Passenger() {
      this.name = "";
      this.birthYear = 1900;
      this.weight = 0.0;
      this.gender = 'u';
      this.numCarryOn = 0;
      this.height = 0;
   }

public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
   this.name=name;
   this.birthYear= birthYear;
   this.weight= weight;
   this.numCarryOn= numCarryOn;
   this.gender= gender;
   this.height= height;
}
public int calculateAge(int currentYear) {
   int age= currentYear-birthYear;
   if(currentYear<birthYear)
      
   age=-1;
   return age;
}
public void gainWeight() {
   this.weight++;
}
public void gainWeight(double weight) {
   this.weight +=weight;
}
public int getBirthYear() {
   return this.birthYear;
}
public char getGender() {
   return this.gender;
}
public String getName() {
   return this.name;
}
public double getWeight() {
   return this.weight;
}
public int getNumCarryOn() {
   return this.numCarryOn;
}
public double getHeight() {
   return this.height;
}
public void setHeight(double height) {
   if(height<0)
       height=-1;
}
public double calcaulateBMI() {
   return (weight*703)/(height*height);
}

public boolean isFemale() {
return   this.getGender()=='f'||this.getGender()=='f';
}
public boolean isMale() {
   return this.getGender()=='m'||this.getGender()=='m';
}
public void loseWeight() {
   this.weight--;
}
public void loseWeight(double weight) {
   this.weight-=weight;
}
public void printDetails() {
   System.out.printf("Name: %20s | Year of Birth:%4d |Weight:%10.2f | Height: %10.2f | Gender:%c| NumCarryOn:%2d\n",this.getName(),this.getBirthYear(),this.getWeight(),this.getHeight(),this.getGender(),this.getNumCarryOn());
}
public void setGender(char gender) {
   if(gender!='f'&& gender!='m')gender='u';
   this.gender=gender;
}
public void setName(String name) {
   this.name= name;
}
public void setBirthYear(int birthYear) {
   this.birthYear= birthYear;
}
public void setWeight(double weight) {
   if (weight<0)weight=-1;
   this.weight= weight;
}
public void setNumCarryOn(int numCarryOn) {
   if (numCarryOn<0)numCarryOn=0;
   if (numCarryOn>2)numCarryOn=2;
  
  
}


   @Override
public String toString() {
   return "Passenger [name= %20s" + name + ", birthYear=%4d" + birthYear + ", weight=%10.2f" + weight + ", gender=%c" + gender
           + ", numCarryOn=%2d\n" + numCarryOn + ", height=%10.2f" + height + "]";
}
  
    @Override
    public int hashCode() {
        return Objects.hash(birthYear, gender, height, name, numCarryOn, weight);
    }

    // Override the equals() method 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // If the objects are same, they are equal.
        if (!(obj instanceof Passenger))
            return false; // If the object is not a Passenger, they are not equal.
        Passenger other = (Passenger) obj;
        return birthYear == other.birthYear && gender == other.gender
                && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
                && Objects.equals(name, other.name) && numCarryOn == other.numCarryOn
                && Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
    }

    public static void main(String[] args) {
        // Create a new Passenger object.
        Passenger p = new Passenger();

        // Set passenger properties.
        p.setName("John");
        p.setBirthYear(1996);
        p.setGender('f');
        p.setWeight(65);

        // Call methods to update passenger properties.
        p.loseWeight(4);
        p.gainWeight();
        p.printDetails();
        p.setNumCarryOn(1);
        p.setHeight(5.5);
    }
}
