package lv.projekts.dokdb.javaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lv.projekts.dokdb.Document;
import lv.projekts.dokdb.DocumentHandling;
import lv.projekts.dokdb.SessionCreater;

public class JavaFxLayout extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello!");

        Pane layout = new Pane();

        Button btnSave = new Button("Save");
        btnSave.setLayoutX(130);
        btnSave.setLayoutY(120);
        layout.getChildren().add(btnSave);

        Button btnClose = new Button("Close");
        btnClose.setLayoutX(200);
        btnClose.setLayoutY(120);
        layout.getChildren().add(btnClose);

        TextField textField = new TextField();
        textField.setLayoutX(80);
        textField.setLayoutY(80);
        layout.getChildren().add(textField);

        btnClose.setOnAction(e -> {
            stage.close();
        });

        btnSave.setOnAction(e -> {
            String text = textField.getText();
            Document document = new Document(text);
            DocumentHandling documentHandling = new DocumentHandling(new SessionCreater());
            documentHandling.create(document);
        });

        Scene scene = new Scene(layout, 320, 240);
        stage.setScene(scene);
        stage.show();



    }

    public static void startFX() {
        launch();
    }

}
