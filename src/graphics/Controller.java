package graphics;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import records.Records;
import javafx.scene.control.Label;


public class Controller {

    public void recordsClicked() {

    }

    public void enterClicked() {  //new Records need to add
        Stage stage = new Stage();
        VBox box = new VBox();
        box.setPadding(new Insets(100));
        Label[] labels = new Label[new Records().studentList.size()];

        Records records = new Records();
        for(int i = 0; i < records.studentList.size(); i++){
            labels[i] = new Label(records.studentList.get(i).getName() + "           " +
                    records.studentList.get(i).getID() + "       " +
                    records.studentList.get(i).getMarks());

            labels[i].setTextFill(Color.BLUEVIOLET);

            box.getChildren().add(labels[i]);
        }

        Scene scene = new Scene(box);
        stage.setScene(scene);
        stage.show();
    }
}
