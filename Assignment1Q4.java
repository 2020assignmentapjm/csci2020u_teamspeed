//Assignment Question 4
//Albert Galuego 100337957

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
 
public class Assignment1Q4 extends Application 
{
	//initialize nodes
    Label label1;
    TextField tf;
    Button button;
    
    @Override public void start(Stage stage) 
    {
        stage.setTitle("Assignment Question 4");
        final CategoryAxis xAxis = new CategoryAxis();//xaxis for bar chart
        final NumberAxis yAxis = new NumberAxis();//yaxis for barchart
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);//to create bar chart
        bc.setTitle("Occurences of Letters");
        bc.setBarGap(-4);//gap between bars
        bc.setPrefWidth(1);
        //used stackpane to position components
        StackPane pane = new StackPane();
        XYChart.Series series1 = new XYChart.Series();
        
        for(int i = 65;i<91;i++)//use ascii to do A-Z for xaxis on barchart
        {
			series1.getData().add(new XYChart.Data(Character.toString((char)i), 0));//values for x and y in barchart
        }

        label1 = new Label("Filename");
        StackPane.setAlignment(label1,Pos.BOTTOM_LEFT);//position "Filename" bottom left
        tf = new TextField();
        tf.setPromptText("Enter File Path");
        StackPane.setAlignment(tf,Pos.BOTTOM_CENTER);//position textfield bottom middle
        tf.setMaxWidth(700);// to look like assignment pdf
        tf.setMaxHeight(30);// to look like assignment pdf
        tf.setOnKeyPressed(new EventHandler<KeyEvent>() //if enter key is pressed
        {
            public void handle(KeyEvent event) 
            {
                if(event.getCode().equals(KeyCode.ENTER)) 
                {
            		String nameofFile = tf.getText();
            		try
                	{
            			//file input
            			File file = new File(nameofFile); 
            	        FileInputStream fileStream = new FileInputStream(file);//nameOfFile is path to textfile
            	        InputStreamReader input = new InputStreamReader(fileStream); 
            	        BufferedReader readText = new BufferedReader(input); 
                		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, 
                		fCount = 0, gCount = 0, hCount = 0, iCount = 0, jCount = 0, kCount = 0, 
                		lCount = 0, mCount = 0, nCount = 0, oCount = 0, pCount = 0, qCount = 0,
                		rCount = 0, sCount = 0, tCount = 0, uCount = 0, vCount = 0,
        				wCount = 0, xCount = 0, yCount = 0, zCount = 0;//values for each character initialized to 0
                		int x1;
                		while((x1 = readText.read()) != -1) //reads every character in text file and respective characters increase in value depending how many times seen in textfile
                		{
                			  char character = (char) x1;
                			  if((character == 'a')||(character == 'A'))
                			  {
                				  aCount+=1;
                			  }
                			  else if((character == 'b')||(character == 'B'))
                			  {
                				  bCount+=1;
                			  }
                			  else if((character == 'c')||(character == 'C'))
                			  {
                				  cCount+=1;
                			  }
                			  else if((character == 'd')||(character == 'D'))
                			  {
                				  dCount+=1;
                			  }
                			  else if((character == 'e')||(character == 'E'))
                			  {
                				  eCount+=1;
                			  }
                			  else if((character == 'f')||(character == 'F'))
                			  {
                				  fCount+=1;
                			  }
                			  else if((character == 'g')||(character == 'G'))
                			  {
                				  gCount+=1;
                			  }
                			  else if((character == 'h')||(character == 'H'))
                			  {
                				  hCount+=1;
                			  }
                			  else if((character == 'i')||(character == 'I'))
                			  {
                				  iCount+=1;
                			  }
                			  else if((character == 'j')||(character == 'J'))
                			  {
                				  jCount+=1;
                			  }
                			  else if((character == 'k')||(character == 'K'))
                			  {
                				  kCount+=1;
                			  }
                			  else if((character == 'l')||(character == 'L'))
                			  {
                				  lCount+=1;
                			  }
                			  else if((character == 'm')||(character == 'M'))
                			  {
                				  mCount+=1;
                			  }
                			  else if((character == 'n')||(character == 'N'))
                			  {
                				  nCount+=1;
                			  }
                			  else if((character == 'o')||(character == 'O'))
                			  {
                				  oCount+=1;
                			  }
                			  else if((character == 'p')||(character == 'P'))
                			  {
                				  pCount+=1;
                			  }
                			  else if((character == 'q')||(character == 'Q'))
                			  {
                				  qCount+=1;
                			  }
                			  else if((character == 'r')||(character == 'R'))
                			  {
                				  rCount+=1;
                			  }
                			  else if((character == 's')||(character == 'S'))
                			  {
                				  sCount+=1;
                			  }
                			  else if((character == 't')||(character == 'T'))
                			  {
                				  tCount+=1;
                			  }
                			  else if((character == 'u')||(character == 'U'))
                			  {
                				  uCount+=1;
                			  }
                			  else if((character == 'v')||(character == 'V'))
                			  {
                				  vCount+=1;
                			  }
                			  else if((character == 'w')||(character == 'W'))
                			  {
                				  wCount+=1;
                			  }
                			  else if((character == 'x')||(character == 'X'))
                			  {
                				  xCount+=1;
                			  }
                			  else if((character == 'y')||(character == 'Y'))
                			  {
                				  yCount+=1;
                			  }
                			  else if((character == 'z')||(character == 'Z'))
                			  {
                				  zCount+=1;
                			  }
                		}
                		int[] countList = {aCount, bCount, cCount, dCount, eCount, fCount,
                				gCount, hCount, iCount, jCount, kCount, lCount, mCount, nCount,
                				oCount, pCount, qCount, rCount, sCount, tCount, uCount, vCount,
                				wCount, xCount, yCount, zCount};//array of the character values
                		
                		for(int i = 65, j = 0;i<91 && j<countList.length;i++, j++)//increments i and j to print ascii values A-Z and respective character counts
                        {
                			series1.getData().add(new XYChart.Data(Character.toString((char)i), (Integer)countList[j]));
                        }
                	}
            		catch(IOException a)//if nonvalid path entered
            		{
            			System.out.println("Error with file path");
            			System.exit(0);
            		}
                }
            }
        });
        button = new Button("View");//view button added
        StackPane.setAlignment(button,Pos.BOTTOM_RIGHT);//button position
        
        bc.getData().addAll(series1);
        pane.getChildren().addAll(bc,label1, tf, button);//add to stackpane
        
        Scene scene  = new Scene(pane,800,600);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}