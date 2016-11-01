import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.HBox;
import javax.swing.JOptionPane;
import javafx.scene.control.TextInputControl;


public class loginfx41 extends Application {
	public enum accounttype {Administrator, Student, Staff, Guest}
	public void start (Stage primaryStage){ 
		
		primaryStage.setTitle("Login account");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Scene scene = new Scene(grid, 500, 200);
		primaryStage.setScene(scene);

		Text scenetitle = new Text("Select account and write username and password");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("Username:");
		grid.add(userName, 0 , 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0 , 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		Button button = new Button("Sign in");
		HBox hbutton = new HBox(10);
		hbutton.setAlignment(Pos.BOTTOM_LEFT);
		hbutton.getChildren().add(button);
		grid.add(hbutton, 1, 4);
		primaryStage.show();

		button.setOnAction(new EventHandler<ActionEvent>() {
		
		int tries = 3;	
		public void handle(ActionEvent event) {
		tries--;
		primaryStage.close();
		do {
			
			accounttype[] choices = {accounttype.Administrator, accounttype.Student, accounttype.Staff, accounttype.Guest};
			accounttype input = (accounttype) JOptionPane.showInputDialog(null, "Sellect your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
			String username = userTextField.getText();
			String password = pwBox.getText();
			if (username.equalsIgnoreCase("athanacia")&&password.equals("12345")) {
			JOptionPane.showMessageDialog(null, "Welcome! Athanacia");
			System.exit(0);
			}
			else if(tries<=0) {
			primaryStage.close();
			}
			else {
			JOptionPane.showMessageDialog(null, "Wrong username or password");
			primaryStage.show();
			break;

			}
			


		} while (tries>0); {
			if (tries<=0) {
			JOptionPane.showMessageDialog(null, "Please contact your administrator to to unlock you account!");
			}
		}

		}	
		});

		}
	}	
	
