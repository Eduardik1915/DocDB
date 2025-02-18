package lv.projekts.dokdb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFxLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane layout = new Pane();

        Button button = new Button("Save");
        button.setLayoutX(130);
        button.setLayoutY(120);
        layout.getChildren().add(button);

        TextField textField = new TextField();
        textField.setLayoutX(80);
        textField.setLayoutY(80);
        layout.getChildren().add(textField);


        stage.setTitle("Hello!");

        button.setOnAction(e -> {
            System.out.println(textField.getText());
        });

        Scene scene = new Scene(layout, 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void startFX() {
        launch();
    }

}
