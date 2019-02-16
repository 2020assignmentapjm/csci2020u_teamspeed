import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.DatePicker;

public class Assignment1Q2 extends Application {
    Button calculate;
    Label label1;
    TextField ia;
    Label label2;
    TextField y;
    Label label3;
    TextField ai;
    Label label4;
    Text fv;
    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception
    {
        //Creating a GridPane container
        primaryStage.setTitle("Assignment 1 Question 2");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15, 15, 30, 15));
        grid.setVgap(1);
        grid.setHgap(10);

        //Username
        Label label1 = new Label("Investment Amount");
        ia = new TextField();
        ia.setPromptText("Enter investment amount");
        ia.getText();
        GridPane.setConstraints(ia, 1, 0);
        GridPane.setConstraints(label1, 0, 0);
        grid.getChildren().addAll(label1, ia);
        
        Label label2 = new Label("Years");
        y = new TextField();
        y.setPromptText("Enter years");
        y.getText();
        GridPane.setConstraints(y, 1, 1);
        GridPane.setConstraints(label2, 0, 1);
        grid.getChildren().addAll(label2, y);
        
        Label label3 = new Label("Annual Interest Rate");
        ai = new TextField();
        ai.setPromptText("Enter annual interest rate");
        ai.getText();
        GridPane.setConstraints(ai, 1, 2);
        GridPane.setConstraints(label3, 0, 2);
        grid.getChildren().addAll(label3, ai);
        
        Label label4 = new Label("Future Value");
        GridPane.setConstraints(label4, 0, 3);
        fv = new Text();
        GridPane.setConstraints(fv, 1, 3);
        grid.getChildren().addAll(label4, fv);

        //Register button
        calculate = new Button("Calculate");
        GridPane.setConstraints(calculate, 1, 6);
        grid.getChildren().add(calculate);
        calculate.setOnAction(this::handle);

        //Generating window
        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void handle(ActionEvent event)
    {
        if(event.getSource() == calculate)
        {
        	double investmentAmount = Double.parseDouble(ia.getText());
        	double monthlyInterestRate = (Double.parseDouble(ai.getText())/100)/12;
        	int years = Integer.parseInt(y.getText());
        	double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        	fv.setText(Double.toString(futureValue));
        	fv.getText();
        }
    }
}
