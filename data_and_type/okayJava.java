import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class okayJava {

	public static void main(String[] args) {
		
		//String id = JOptionPane.showInputDialog("Enter a ID");
		String id = args[0];
		//String bright = JOptionPane.showInputDialog("Enter a Bright Level");
		String bright = args[1];
		 
		// elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off 
		Security mySecurity = new Security(id);
		mySecurity.off();
		// light on 
		Lighting hallLamp = new Lighting(id+"/ HALL LAMP");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"/ HALL LAMP");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
