package application;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private JFXButton button;

	@FXML
	private TextField kullaniciAdi;

	@FXML
	private PasswordField parola;

	@FXML
	private Label sonuc;

	@FXML
	public void girisYap(ActionEvent actionEvent) {

		if (kullaniciAdi.getText().equals("kemalakçiçek") && parola.getText().equals("1234")) {
			sonuc.setText("Başarıyla Giriş Yapıldı");
		} else {
			sonuc.setText("Hatalı giriş yapıldı");
		}

	}

}
