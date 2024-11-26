module LoginApp5 {
	requires javafx.controls;
	requires javafx.fxml;

	requires com.jfoenix;
	opens application to javafx.graphics, javafx.fxml;
}

