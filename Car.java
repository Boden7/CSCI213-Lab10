/**
 * Lab 10 Car class
 * @author Boden Kahn
 *
 */
public class Car extends Vehicle {
	
	
    private final int doors;
    private final int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int aDoors, int aPassengers) {
		super(aMake, aModel, aPlate);
        this.doors = aDoors;
        this.passengers = aPassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
    @Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(super.equals(other)) {
			if(this.doors == otherCar.getDoors()) {
				if(this.passengers == otherCar.getPassengers()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
    public Car copy(){
        String cMake = this.getMake();
        String cModel = this.getModel();
        String cPlate = this.getPlate();
        int cDoors = this.getDoors();
        int cPassengers = this.getPassengers();

        Car newCar = new Car(cMake, cModel, cPlate, cDoors, cPassengers);
        return newCar;
    }
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", "BINARY", 2, 1);
        System.out.println(car);
    }
}
