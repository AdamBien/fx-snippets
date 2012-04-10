package org.fxsnippets.transparentstage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author adam bien, adam-bien.com
 */
public class TransparentStage extends Application {

    
    @Override
    public void start(Stage stage) {
        stage.initStyle(StageStyle.TRANSPARENT);
        Text text = new Text("Transparent!");
        text.setFont(new Font(40));
        VBox box = new VBox();
        box.getChildren().add(text);
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(null);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
