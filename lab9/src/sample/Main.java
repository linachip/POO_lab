package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TextField numb1;
    TextField numb2;
    Label div;
    Button res;
    Label ans;
    Label error;

    @Override
    public void start(Stage primaryStage) {
        numb1 = new TextField();
        numb1.setPrefWidth(100);
        numb2 = new TextField();
        numb2.setPrefWidth(100);
        div = new Label("/");
        res = new Button("Result");
        res.setPrefWidth(150);
        ans = new Label("Answer");
        ans.setPrefWidth(150);
        error = new Label();
        error.setPrefWidth(150);


        ans.setAlignment(Pos.CENTER);
        ans.setStyle("-fx-border-color: darkblue; -fx-padding: 5px;");

        res.setAlignment(Pos.CENTER);
        res.setStyle("-fx-border-color: darkblue; -fx-padding: 5px;");

        error.setAlignment(Pos.CENTER);
        error.setStyle("-fx-background-color: red; -fx-padding: 5px;");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        root.setHgap(60);
        root.setVgap(10);


        root.add(numb1, 0, 2);
        root.add(numb2, 2, 2);
        root.add(div, 1, 2);
        root.add(res, 0, 3, 2, 1);
        root.add(ans, 0, 4, 2, 1);
        root.add(error, 0, 5, 2, 1);


        attachCode();

        Scene scene = new Scene(root, 350, 300);
        primaryStage.setTitle("Divide Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void attachCode(){
        res.setOnAction( e -> btcode(e));
    }

    public void btcode(ActionEvent e) {
        float num1, num2, result = 0;
        char symbol = 0;

        try {
            error.getText();
            num1 = Float.parseFloat(numb1.getText());
            num2 = Float.parseFloat(numb2.getText());
            if (e.getSource() == res) {
                symbol = '/';
                result = num1 / num2;
            }

            ans.setText("" + num1 + symbol + num2 + "=" + result);

        } catch(NumberFormatException e1){
            error.setText("Wrong number!");
        }
    }
}
