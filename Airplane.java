public class Airplane {
    private Passenger[] passengers;
    private String airplaneName;
    private int numPassengers;

    public Airplane() {
        this(100, "");
    }

    public Airplane(String airplaneName) {
        this(100, airplaneName);
    }

    public Airplane(int maxPassengers) {
        this(maxPassengers, "");
    }

    private Airplane(int maxPassengers, String airplaneName) {
        this.passengers = new Passenger[maxPassengers < 0 ? 0 : maxPassengers];
        this.airplaneName = airplaneName;
        this.numPassengers = 0;
    }

  public Airplane(String airplaneName, int maxPassengers) {
      if (maxPassengers < 0) {
          this.passengers = new Passenger[0];
      } else {
          this.passengers = new Passenger[maxPassengers];
      }
      this.airplaneName = airplaneName;
      this.numPassengers = 0;
  }

  public void addPassenger(Passenger passenger) {
      if (this.numPassengers < this.passengers.length) {
          this.passengers[this.numPassengers] = passenger;
          this.numPassengers++;
      }
  }

  public String getAirplaneName() {
      return this.airplaneName;
  }

  public Passenger getPassenger(int index) {
      if (index < 0 || index >= this.numPassengers) {
          return null;
      }
      return this.passengers[index];
  }

  public int getNumPassengers() {
      return this.numPassengers;
  }

  public Passenger getFirstPassenger() {
      if (this.numPassengers > 0) {
          return this.passengers[0];
      }
      return null;
  }

  public Passenger getLastPassenger() {
      if (this.numPassengers > 0) {
          return this.passengers[this.numPassengers - 1];
      }
      return null;
  }

  public Passenger[] getPassengers() {
	    return passengers;
	}

	public void setAirplaneName(String airplaneName) {
	    this.airplaneName = airplaneName;
	}

	public void printAllDetails() {
	    System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n",
	            airplaneName, numPassengers, passengers.length);
	    for (Passenger passenger : passengers) {
	        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn:  %d\n",
	                passenger.getName(), passenger.getBirthYear(), passenger.getWeight(),
	                passenger.getGender(), passenger.getNumCarryOn());
	    }
	}

  public Passenger removePassenger(int index) {
      if (index < 0 || index >= this.numPassengers) {
          return null;
      }
      Passenger removedPassenger = this.passengers[index];
      for (int i = index; i < this.numPassengers - 1; i++) {
          this.passengers[i] = this.passengers[i + 1];
      }
      this.passengers[this.numPassengers - 1] = null;
      this.numPassengers--;
      return removedPassenger;
  }

  public void removeAllPassengers() {
	    for (int i = 0; i < numPassengers; i++) {
	        passengers[i] = null;
	    }
	    numPassengers = 0;
	}

	public double getTotalWeightOfAllPassengers() {
	    double totalWeight = 0.0;
	    for (int i = 0; i < numPassengers; i++) {
	        totalWeight += passengers[i].getWeight();
	    }
	    return totalWeight;
	}

	public double getAverageWeightOfAllPassengers() {
	    return numPassengers == 0 ? 0 : getTotalWeightOfAllPassengers() / numPassengers;
	}

	public int getNumberOfPassengersAboveWeight(double weight) {
	    int count = 0;
	    for (int i = 0; i < numPassengers; i++) {
	        if (passengers[i].getWeight() > weight) {
	            count++;
	        }
	    }
	    return count;
	}

	public int getNumberOfPassengersBelowWeight(double weight) {
	    int count = 0;
	    for (int i = 0; i < numPassengers; i++) {
	        if (passengers[i].getWeight() < weight) {
	            count++;
	        }
	    }
	    return count;
	}

	public void increaseWeightOfAllPassengers() {
	    for (int i = 0; i < numPassengers; i++) {
	        passengers[i].gainWeight();
	    }
	}

	public void increaseWeightOfAllPassengers(double weight) {
	    for (int i = 0; i < numPassengers; i++) {
	        passengers[i].gainWeight(weight);
	    }
	}

	public void gainWeightOfAllPassengers(double amount) {
	    for (int i = 0; i < numPassengers; i++) {
	        passengers[i].gainWeight(amount);
	    }
	}
}