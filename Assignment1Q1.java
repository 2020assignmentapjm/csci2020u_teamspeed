//Assignment Question 1
//Albert Galuego 100337957

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Assignment1Q1 extends Application
{
	 public void start(Stage primaryStage) 
	 {
		 //GridPane to align images according to assignment pdf
		 GridPane gp = new GridPane();
		 
		 int random = (int)(Math. random() * 53 + 1);//Random first card from 1 to 54
		 String random1 = Integer.toString(random) + ".png"; //png appended to random number
		 Image i = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random1);//image pathway saved to Image variable
		 ImageView helloimage = new ImageView(i);//display image
		 
		 int random_2 = (int)(Math. random() * 53 + 1);//Random second card from 1 to 54
		 String random3 = Integer.toString(random_2) + ".png";
		 Image i2 = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random3);//image variable
		 ImageView helloimage2 = new ImageView(i2);//image displayed
		 
		 int random_3 = (int)(Math. random() * 53 + 1);//Random third card from 1 to 54
		 String random4 = Integer.toString(random_3) + ".png";
		 Image i3 = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random4);
		 ImageView helloimage3 = new ImageView(i3);//image displayed
		 
		 
		 GridPane.setConstraints(helloimage, 0, 0);//first card positioned on left side
		 GridPane.setConstraints(helloimage2, 1, 0);//second card positioned in middle
		 GridPane.setConstraints(helloimage3, 2, 0);//third card positioned on right side
		 gp.getChildren().addAll(helloimage,helloimage2, helloimage3);//images added to gridpane
		 
		 Scene scene = new Scene(gp);
		 primaryStage.setTitle("Assignment Question 1");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	 }
	 
	 public static void main(String[] args)
	 {
		 launch(args);
	 }

}