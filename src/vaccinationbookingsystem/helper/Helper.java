package vaccinationbookingsystem.helper;

import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import vaccinationbookingsystem.GUI.Menu;


/**
 *
 * @author Omar essam
 */
public class Helper {
	final String ERROR_MESSAGE = "ERROR_MESSAGE";
	/**
	 *  ping to google to check the user connectivy with internet 
	 * @return true if the user can ping to google, false if the user can't ping to google
	 */
	public static boolean checkInternetConnectivity() {
		try {
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	/**
	 * Show dialog message
	 * @param message     - a message that you would to display
	 * @param messageType - error, normal, info, or warnning
	 */
	public static void showDialogMessage(String message, String messageType) {
		JOptionPane.showMessageDialog(null, message, "Vaccination Booling System",
				getMessageType().get(messageType));
	}
	/**
	 * 
	 * @return map that contain key - value pair, to a specifc message type
	 */
	public static Map<String, Integer> getMessageType() {
		Map<String, Integer> messageType = new HashMap<String, Integer>();
		messageType.put("error", 0);
		messageType.put("normal", -1);
		messageType.put("info", 1);
		messageType.put("warnning", 2);
		return messageType;
	}
	public static void redirectToHomePage() {
		new Menu().setVisible(true);
	}

}
