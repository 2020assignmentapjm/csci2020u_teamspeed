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
		 GridPane gp = new GridPane();
		 
		 int random = (int)(Math. random() * 55 + 1);
		 String random1 = Integer.toString(random) + ".png";
		 Image i = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random1);
		 ImageView helloimage = new ImageView(i);
		 
		 int random_2 = (int)(Math. random() * 55 + 1);
		 String random3 = Integer.toString(random_2) + ".png";
		 Image i2 = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random3);
		 ImageView helloimage2 = new ImageView(i2);
		 
		 int random_3 = (int)(Math. random() * 55 + 1);
		 String random4 = Integer.toString(random_3) + ".png";
		 Image i3 = new Image("file:///C:/Users/Albert/Desktop/Assignment/Cards/" + random4);
		 ImageView helloimage3 = new ImageView(i3);
		 
		 
		 GridPane.setConstraints(helloimage, 0, 0);
		 GridPane.setConstraints(helloimage2, 1, 0);
		 GridPane.setConstraints(helloimage3, 2, 0);
		 gp.getChildren().addAll(helloimage,helloimage2, helloimage3);
		 
		 Scene scene = new Scene(gp);
		 primaryStage.setTitle("Flags");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
	 
	 }
	 public static void main(String[] args)
	 {
		 launch(args);
	 }

}