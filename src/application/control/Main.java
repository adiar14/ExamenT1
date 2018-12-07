package application.control;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 
 * @author Álvaro
 * @version 1.0
 * 
 */

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass()
				.getResource("/application/view/Profile.fxml"));
		AnchorPane pane = loader.load();
		Scene scene = new Scene(pane);
		scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Poiret+One");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	//main de la activity
	public static void main(String[] args) {
		launch(args);
	}
}

