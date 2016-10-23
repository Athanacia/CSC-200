import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Dialog;

public class accounttype3_5 extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog instructions = new TextInputDialog();
		instructions.setHeaderText("Write the number corresponding to an account:\n" +
		"1. Admistrator\n2. Faculty\n3. Staff\n4. Student\n5. Guest"
		);
		Optional<String> accountnum = instructions.showAndWait();
		String account = accountnum.get();
		int number = Integer.parseInt(account);
		
		Alert typeofaccount = new Alert(AlertType.INFORMATION);

		switch(number) {
		
		case 1:
			typeofaccount.setContentText("Welcome! Administrator account");
			typeofaccount.showAndWait();
			break;
		case 2:

			typeofaccount.setContentText("Welcome! Faculty account");
			typeofaccount.showAndWait();
			break;
		case 3:

			typeofaccount.setContentText("Welcome! Staff account");
			typeofaccount.showAndWait();
			break;
		case 4:
		
			typeofaccount.setContentText("Welcome! Student account");
			typeofaccount.showAndWait();
			break;
		case 5:

			typeofaccount.setContentText("Welcome! Guest account");
			typeofaccount.showAndWait();
			break;
		default:

			typeofaccount.setContentText("Invalid number. Try again.");
			typeofaccount.showAndWait();

		}

	
	}
}
