import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 
 */

/**
 * @author jones 
 * Questions for Module 1 include:
 * Does the Elevator need to be able to account for multiple floors at once
 */
public class ElevatorModule1 {

	/**
	 * @param args
	 * @return 
	 */
	public static void testElevator() {

        try (Scanner keyboard = new Scanner(System.in)) {
        	
        	System.out.print("Get on Elevator? (Type Yes or No): ");
        	String rideElevator = keyboard.nextLine();
        	
        	if(rideElevator.equalsIgnoreCase("yes")) {
				System.out.println("Welcome to CrowdStreet Offices");			
				System.out.println("Select a Floor");
				int floor = keyboard.nextInt();
				
				String eleButtonString;
				do {
					switch (floor) {
				    	case 1:  eleButtonString = "Floor 1";
				    		 break;
				    	case 2:  eleButtonString = "Floor 2";
				             break;
				    	case 3:  eleButtonString = "Floor 3";
				             break;
				    	case 4:  eleButtonString = "Floor 4";
				             break;
				    	case 5:  eleButtonString = "Floor 5";
				             System.out.println("5th Floor not available");
				    		 break;
				    	case 6:  eleButtonString = "Floor 6";
				             break;
				    	case 7:  eleButtonString = "Floor 7";
				             break;
				    	case 8:  eleButtonString = "Floor 8";
				             break;
				    	case 9:  eleButtonString = "Floor 9";
				             break;
				    	case 10: eleButtonString = "Floor 10";
				             break;
				    	default: eleButtonString = "Invalid month";
				             break;
					}//end switch
					//Floor 5 is not working, disable ability to access
					if(floor != 5) {
						System.out.println("Now Headed to the " + eleButtonString + ".");
					}else{
						testElevator();
					}
					
					//Wait 3 seconds then Alert passenger
					try {
						TimeUnit.SECONDS.sleep(3);
						System.out.println("Floor Reached.");
						testElevator();
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}while(keyboard.hasNextInt());
        	}
		}
	}
	public static void main(String[] args) {
		testElevator();
	}//end main
}//end class
