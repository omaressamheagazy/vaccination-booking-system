package vaccinationbookingsystem;
import vaccinationbookingsystem.helper.Helper;
import vaccinationbookingsystem.GUI.Menu;
public class Application {
	Menu mainMenu;
	public Application(Menu menu) {
		mainMenu = menu;
		displayAppGUI();
	}	
	
	/**
	 *  This function is responisble for displaying the main menu of the application
	 **/	
	private void displayAppGUI() {
		mainMenu.setVisible(true);
	}
	/**
	 * In order to use the system, you should have an internet connecitvity, since we have datbase, this function check the internet connectiviy 
	 */
	public static void checkingInternetConnectiviy() {
		if (!Helper.checkInternetConnectivity()) {  
			Helper.showDialogMessage("You need to be connected to the internet in order to use the system", "warnning");
			System.exit(1);
		}	
	}
	public static void main(String[] args) {
		Application.checkingInternetConnectiviy();
		Application app = new Application(new Menu());
	}

}
