package day1;

public class Bike {
       public void driverBike() {
       System.out.println("I can drive all Bikes");
       }
       public void applyBrake() {
    	   System.out.println("Brakes are mandatory");
       }
       public void soundHorn() {
    	   System.out.println("Sound horn whenever required");
       }
       
       public void isPuncture() {
    	   System.out.println("Are your byke got punctured!");
    	   
       }
       public static void main(String[] args) {

    	   Bike b = new Bike();
    			b.driverBike();
    			b.applyBrake();
    			b.soundHorn();
    			b.isPuncture();
	}

}
