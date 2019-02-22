//Assignment Question 2
//Albert Galuego 100337957
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class Assignment1Q2 extends Application 
{
	//initialize node variables
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

        primaryStage.setTitle("Assignment Question 2");
        GridPane grid = new GridPane();//gridpane initialized
        grid.setPadding(new Insets(15, 15, 30, 15));
        grid.setVgap(1); //gaps from top and bottom border
        grid.setHgap(10);//gaps from left and right border

        Label label1 = new Label("Investment Amount");//label for first row
        ia = new TextField();
        ia.setPromptText("Enter investment amount");
        ia.getText();//retrieves what user types for investment amount
        GridPane.setConstraints(ia, 1, 0);//positioning of textfield first row
        GridPane.setConstraints(label1, 0, 0);//positioning of label first row
        grid.getChildren().addAll(label1, ia);//add to gridpane
        
        Label label2 = new Label("Years");//label for second row
        y = new TextField();
        y.setPromptText("Enter years");
        y.getText();//retrieves what user types for years
        GridPane.setConstraints(y, 1, 1);//positioning of textfield second row
        GridPane.setConstraints(label2, 0, 1);//positioning of label second row
        grid.getChildren().addAll(label2, y);//add to gridpane
        
        Label label3 = new Label("Annual Interest Rate");//label for third row
        ai = new TextField();
        ai.setPromptText("Enter annual interest rate");
        ai.getText();//retrieve user input for annual interest rate
        GridPane.setConstraints(ai, 1, 2);//positioning
        GridPane.setConstraints(label3, 0, 2);//positioning
        grid.getChildren().addAll(label3, ai);//add to gridpane
        
        Label label4 = new Label("Future Value");
        GridPane.setConstraints(label4, 0, 3);//positioning for 4th row
        fv = new Text();//text to display calculation
        GridPane.setConstraints(fv, 1, 3);//positioning for 4th row
        grid.getChildren().addAll(label4, fv);//add to gridpane

        calculate = new Button("Calculate");//button to click when user wishes to calculate future value
        GridPane.setConstraints(calculate, 1, 6);//positioning
        grid.getChildren().add(calculate);//add to gridpane
        calculate.setOnAction(this::handle);//if clicked by user

        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void handle(ActionEvent event)
    {
    	try
    	{
    		if(event.getSource() == calculate)
            {
            	double investmentAmount = Double.parseDouble(ia.getText());
            	double monthlyInterestRate = (Double.parseDouble(ai.getText())/100)/12;//for monthly interest rate
            	int years = Integer.parseInt(y.getText());
            	double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);//as per assignment pdf
            	fv.setText(Double.toString(futureValue));
            	fv.getText();
            }
    	}
    	catch(RuntimeException e)
    	{
    		System.out.println("error");//if invalid numbers inputted
    		System.exit(0);
    	}
    }
}
