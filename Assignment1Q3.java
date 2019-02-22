//Assignment Question 3
//Albert Galuego 100337957
import java.awt.Point;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignment1Q3 extends Application 
{
	//initialize components
    public Circle bigCircle;
    public Circle circle2; 
    public Circle circle3; 
    public Circle circle4;
    public Line l1; 
    public Line l2; 
    public Line l3;
    public Text t1;
    public Text t2; 
    public Text t3;

    public void start(Stage primaryStage) 
    {
    	//for main circle
        bigCircle = new Circle(150);
        bigCircle.setCenterX(250);//horizontal position
        bigCircle.setCenterY(250);//vertical position
        bigCircle.setFill(Color.TRANSPARENT);
        bigCircle.setStroke(Color.BLACK);
        
        //for first of points to be moved potentially on the main circle
        circle2 = new Circle(10);
        circle2.setFill(Color.RED);
        circle2.setStroke(Color.BLACK);
        circle2.setOnMouseDragged(e -> movePoint(circle2, e));//for mouse input on point

        //for second point to be moved potentially on the main circle
        circle3 = new Circle(10);
        circle3.setFill(Color.RED);
        circle3.setStroke(Color.BLACK);
        circle3.setOnMouseDragged(e -> movePoint(circle3, e));//for mouse input on second point

        //for third point to be moved potentially on the main circle
        circle4 = new Circle(10);
        circle4.setFill(Color.RED);
        circle4.setStroke(Color.BLACK);
        circle4.setOnMouseDragged(e -> movePoint(circle4, e));//for mouse input on 3rd point

        startup();//start initial position of all components
        updateValues();//updates lines and angles as theyre moved
        
        Pane pane = new Pane();
        pane.getChildren().addAll(bigCircle, circle2, circle3, circle4, l1, l2, l3, t1, t2, t3);//add to pane
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Assignment Question 3");
        primaryStage.show();
    }

    public void startup() 
    {   
        double angle = 0;
        double positionX = (bigCircle.getCenterX() + (bigCircle.getRadius()) * (Math.cos(Math.toRadians(angle))));//getting position of first point horizontally
        double positionY = (bigCircle.getCenterY() + (bigCircle.getRadius()) * (Math.sin(Math.toRadians(angle))));//getting position of first point vertically
        circle2.setCenterX(positionX);//setting x position of first point
        circle2.setCenterY(positionY);//setting y position of first point
        positionX = (bigCircle.getCenterX()) + (bigCircle.getRadius() - 50) * Math.cos(Math.toRadians(angle));//x position of angle next to point
        positionY = (bigCircle.getCenterY()) + (bigCircle.getRadius() - 50) * Math.sin(Math.toRadians(angle));//y position of angle next to point
        t1 = new Text();
        t1.setLayoutX(positionX);//setting x position of angle next to point
        t1.setLayoutY(positionY);//setting y position of angle next to point

        angle = 90;//90 degrees from first point
        positionX = (bigCircle.getCenterX()) + (bigCircle.getRadius()) * Math.cos(Math.toRadians(angle));
        positionY = (bigCircle.getCenterY()) + (bigCircle.getRadius()) * Math.sin(Math.toRadians(angle));
        circle3.setCenterX(positionX);//setting x position of second point
        circle3.setCenterY(positionY);//setting y position of second point
        positionX = (bigCircle.getCenterX()) + (bigCircle.getRadius() - 50) * Math.cos(Math.toRadians(angle));
        positionY = (bigCircle.getCenterY()) + (bigCircle.getRadius() - 50) * Math.sin(Math.toRadians(angle));
        t2 = new Text();
        t2.setLayoutX(positionX);//setting x position of angle text next to second point
        t2.setLayoutY(positionY);//setting y position of angle text next to second point

        angle = 180;//180 degrees from first point 90 degrees from second point
        positionX = bigCircle.getCenterX() + bigCircle.getRadius() * Math.cos(Math.toRadians(angle));
        positionY = bigCircle.getCenterY() + bigCircle.getRadius() * Math.sin(Math.toRadians(angle));
        circle4.setCenterX(positionX);//setting x position of third point
        circle4.setCenterY(positionY);//setting y position of third point
        positionX = bigCircle.getCenterX() + (bigCircle.getRadius() - 50) * Math.cos(Math.toRadians(angle));
        positionY = bigCircle.getCenterY() + (bigCircle.getRadius() - 50) * Math.sin(Math.toRadians(angle));
        t3 = new Text();
        t3.setLayoutX(positionX);//setting x position of angle next to third point
        t3.setLayoutY(positionY);//setting y position of angle next to third point

        l1 = new Line(circle2.getCenterX(), circle2.getCenterY(), circle3.getCenterX(), circle3.getCenterY());//line from point 1 to point 2
        l2 = new Line(circle3.getCenterX(), circle3.getCenterY(), circle4.getCenterX(), circle4.getCenterY());//line from point 2 to point 3
        l3 = new Line(circle4.getCenterX(), circle4.getCenterY(), circle2.getCenterX(), circle2.getCenterY());//line from point 3 to point 1
    }
    
    public void updateValues() 
    {
    	//update line 1 as points move
        l1.setStartX(circle2.getCenterX());
        l1.setEndX(circle3.getCenterX());
        l1.setStartY(circle2.getCenterY());
        l1.setEndY(circle3.getCenterY());

        //update line 2 as points move
        l2.setStartX(circle3.getCenterX());
        l2.setEndX(circle4.getCenterX());
        l2.setStartY(circle3.getCenterY());
        l2.setEndY(circle4.getCenterY());

        //update line 3 as points move
        l3.setStartX(circle4.getCenterX());
        l3.setEndX(circle2.getCenterX());
        l3.setStartY(circle4.getCenterY());
        l3.setEndY(circle2.getCenterY());

        //distance from points to each other
        double a = Point.distance(circle3.getCenterX(), circle3.getCenterY(), circle4.getCenterX(), circle4.getCenterY());
        double b = Point.distance(circle2.getCenterX(), circle2.getCenterY(), circle4.getCenterX(), circle4.getCenterY());
        double c = Point.distance(circle3.getCenterX(), circle3.getCenterY(), circle2.getCenterX(), circle2.getCenterY());

        //angle equations as per assignment pdf
        double angle1 = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double angle2 = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double angle3 = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

        //display changing angles
        t1.setText(String.format("%.1f", Math.toDegrees(angle1)));
        t2.setText(String.format("%.1f", Math.toDegrees(angle2)));
        t3.setText(String.format("%.1f", Math.toDegrees(angle3)));
    }

    public void movePoint(Circle point, MouseEvent e) 
    {

        double angle = Math.atan2(e.getY() - bigCircle.getCenterY(), e.getX() - bigCircle.getCenterX());
        double newX = bigCircle.getCenterX() + bigCircle.getRadius() * Math.cos(angle);
        double newY = bigCircle.getCenterY() + bigCircle.getRadius() * Math.sin(angle);

        point.setCenterX(newX);//as mouse clicks on point new position for points are set - horizontal value
        point.setCenterY(newY);//as mouse clicks on point new position for points are set - vertical value

        newX = bigCircle.getCenterX() + (bigCircle.getRadius() - 50) * Math.cos(angle);//as mouse clicks on point new position for angle texts are set - horizontal value
        newY = bigCircle.getCenterY() + (bigCircle.getRadius() - 50) * Math.sin(angle);//as mouse clicks on point new position for angle texts are set - vertical

        if(point.equals(circle2))
        {
            t1.setLayoutX(newX);
            t1.setLayoutY(newY);
        } 
        else if(point.equals(circle3)) 
        {
            t2.setLayoutX(newX);
            t2.setLayoutY(newY);
        } 
        else 
        {
            t3.setLayoutX(newX);
            t3.setLayoutY(newY);
        }
        updateValues();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }

}