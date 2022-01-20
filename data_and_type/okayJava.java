import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class okayJava {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		 
		// elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off 
		Security mySecurity = new Security(id);
		mySecurity.off();
		// light on 
		Lighting hallLamp = new Lighting("JAVA APT 507 / HALL LAMP");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting("JAVA APT 507 / HALL LAMP");
		floorLamp.on();

	}

}
