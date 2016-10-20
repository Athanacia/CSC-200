import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.application.Application;
import java.lang.Object;
import javafx.scene.control.Dialog;
	
	public class loginlimited extends Application {	
	@Override
		public void start(Stage primaryStage) {
		Alert instructions = new Alert(AlertType.INFORMATION);

		TextInputDialog inputusername = new TextInputDialog();
		inputusername.setHeaderText("Enter username");
		Alert faileduser = new Alert(AlertType.INFORMATION);

		TextInputDialog inputpassword = new TextInputDialog();
		inputpassword.setHeaderText("Enter password");
		Alert failedpass = new Alert(AlertType.INFORMATION);

		Alert loginsucess = new Alert(AlertType.INFORMATION);

		Alert limitreached = new Alert(AlertType.INFORMATION);

		int counter = 3;
			
			do {
			instructions.setTitle("Login instructions");
			instructions.setContentText("After pressing OK, Write your username and password to enter to your account");
			instructions.showAndWait();
			Optional<String> unir = inputusername.showAndWait();
			String username = unir.get();
			counter--;

				if (username.equalsIgnoreCase("athanacia")) {
				Optional<String> pwir = inputpassword.showAndWait();
				String password = pwir.get();
					if (password.equals("12345")) {
					loginsucess.setTitle("Login Successful");
					loginsucess.setContentText("Welcome! Athanacia");
					loginsucess.showAndWait();
					break;
					}
					else {
					failedpass.setTitle("Error");
					failedpass.setContentText("Wrong password");
					failedpass.showAndWait();
					}
				}

				else {
				faileduser.setTitle("Error");
				faileduser.setContentText("Invalid username");
				faileduser.showAndWait();
				}

				}

			 
			
			while (counter>0); {
				if (counter<=0) {
				limitreached.setTitle("Tries Limit Reached");
				limitreached.setContentText("You have reached the amount of try. Try again after 24 hours.");
				limitreached.showAndWait();
				}
			}


		}

	}

