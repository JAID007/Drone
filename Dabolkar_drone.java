import java.util.Scanner;

//Author Name - Jai Dabolkar
//Date - 515/2022
//Program Name - Drone Navigation
//Purpose - To simulate a drone navigational menu using buttons for x, y, and z locations

public class Dabolkar_drone {

	public static void main(String[] args) {
		System.out.println("Which direction would you like to move the drone?");
		System.out.println("1. Move Up\n"
				+ "2. Move Down\n"
				+ "3. Move Forward\n"
				+ "4. Move Backward\n"
				+ "5. Turn Left\n"
				+ "6. Turn Right\n"
				+ "7. Display Position\n"
				+ "8. Exit Navigation");
		
		Dabolkar_droneSettings dron1 = new Dabolkar_droneSettings();
		Dabolkar_droneSettings dron2 = new Dabolkar_droneSettings();
		
		Scanner input = new Scanner(System.in);
		int option = Integer.parseInt(input.nextLine());
		

			switch(option) {
			case 1: 
				dron1.setDroneUp(1);
				System.out.println("You have moved the drone forward");
				break;
			case 2:
				dron1.setDroneDown(1);
				System.out.println("You have moved the drone backwards");
				break;
			case 3:
				dron1.setDroneForward(1);
				System.out.println("You moved the drone forwards");
				break;
			case 4:
				dron1.setDroneBackward(1);
				System.out.println("You moved the drone backwards");
				break;				
			case 5:
				dron1.setDroneOrientation("Left");
				dron1.setDroneLeft(1);
				System.out.println("Drone orientation is left");
				break;
			case 6:
				dron1.setDroneOrientation("Right");
				dron1.setDroneRight(1);
				System.out.println("Drone orientation is right");
				break;
			case 7:
				System.out.println("Current drone 1 position is: x_pos = " + (dron1.getDroneLeft() - dron1.getDroneRight()) + 
						", y_pos = " + (dron1.getDroneForward()-dron1.getDroneBackward()) + ", current orientation = " + dron1.getDroneOrientation());
				break;
			case 8:
				System.out.println("Exiting Navigation");
				break;
			}
		}
	
}
