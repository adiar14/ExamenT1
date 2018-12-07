package application.view;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Control {
	@FXML
	ImageView perfil;
	@FXML
	JFXButton boton;
	@FXML
	JFXButton btnCerrar;
	Stage stage;
	//metodo que inicializa la transición
public void initialize() {

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), perfil);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();

	}
	//metodo que pasa de pantalla y cierra el stage
public void siguientePantalla(){
	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));
		
		AnchorPane ventanaDos = (AnchorPane) loader.load();
		stage = new Stage();
		Scene scene = new Scene(ventanaDos);
		stage.setTitle("GET ME");
		stage.setScene(scene);
		stage.show();
		Stage thisStage= (Stage) boton.getScene().getWindow();
		thisStage.close();	
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	//metodo que cierra el stage
	public void  closeStage(){
		Stage thisStage= (Stage) btnCerrar.getScene().getWindow();
		thisStage.close();
	
	}
}
