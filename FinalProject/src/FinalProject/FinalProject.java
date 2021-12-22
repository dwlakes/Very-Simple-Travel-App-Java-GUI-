//Author: David Lakes
//Date: Nov. 18, 2021
/*Purpose: The program prompts the user to enter details of their travel trips, and creates
 * objects that corresponds with the overall trip, activities, people, and food. The program
 * uses GUIs across four panes. Each pane corresponds to a class. 
 */


package FinalProject;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinalProject extends Application{
	
	Scene scene1, scene2, scene3, scene4;
	
	//Create variables that correspond to the text fields
	  private static TextField tfTripName = new TextField();
	  private static TextField tfContinent = new TextField();
	  private static TextField tfCountry = new TextField();
	  private static TextField tfState = new TextField();
	  private static TextField tfCity = new TextField();
	  private static TextField tfPlaceStayed = new TextField();
	  private static TextField tfPeopleMet = new TextField();
	  private static TextField tfDateArrived = new TextField();
	  private static TextField tfDateLeft = new TextField();
	  private static TextField tfActivities = new TextField();
	  private TextField tfActivity= new TextField();
	  private TextField tfActivityPlace=new TextField();
	  private TextField tfWithWho = new TextField();
	  private TextField tfDateStarted = new TextField();
	  private TextField tfName = new TextField();
	  private TextField tfNationality = new TextField();
	  private TextField tfCitymet = new TextField();
	  private TextField tfLanguages = new TextField();
	  private TextField tfDateMet = new TextField();
	  private TextField tfHowSpicey = new TextField();
	  private Button btSave = new Button("Save");
	  private Button btNext1 = new Button("Next");
	  
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		
		 
	  // Create UI
	  GridPane gridPane = new GridPane();
	  gridPane.setHgap(10);
	  gridPane.setVgap(10);
	  gridPane.add(new Label("Trip Name:"), 0, 0);
	  gridPane.add(tfTripName, 1, 0);
	  gridPane.add(new Label("Continent:"), 0, 1);
	  gridPane.add(tfContinent, 1, 1);
	  gridPane.add(new Label("Country:"), 0, 2);
	  gridPane.add(tfCountry, 1, 2);
	  gridPane.add(new Label("State/Providence:"), 0, 3);
	  gridPane.add(tfState, 1, 3);
	  gridPane.add(new Label("City:"), 0, 4);
	  gridPane.add(tfCity, 1, 4);
	  gridPane.add(new Label("Place Stayed:"), 0, 5);
	  gridPane.add(tfPlaceStayed, 1, 5);
	  gridPane.add(new Label("People Met:"), 0, 6);
	  gridPane.add(tfPeopleMet, 1, 6);
	  gridPane.add(new Label("Date Arrived:"), 0, 7);
	  gridPane.add(tfDateArrived, 1, 7);
	  gridPane.add(new Label("Date Left:"), 0, 8);
	  gridPane.add(tfDateLeft, 1, 8);
	  gridPane.add(new Label("Activities:"), 0, 9);
	  gridPane.add(tfActivities, 1, 9);
	  gridPane.add(btSave, 0, 10);
	  gridPane.add(btNext1, 1, 10);
	  
	  // Set properties for UI
	  gridPane.setAlignment(Pos.CENTER);
	  GridPane.setHalignment(btNext1, HPos.RIGHT);
	  
	  // Process events
	  
	
	  // Create a scene and place it in the stage
	  Scene scene1 = new Scene(gridPane, 400, 400);
	  primaryStage.setTitle("Trip Overview"); // Set title
	  primaryStage.setScene(scene1); // Place the scene in the stage
	  primaryStage.show(); // Display the stage
	  
	  //Second gridpane
	  Button btBack1 = new Button("Back");
	  Button btSave2 = new Button("Save");
	  Button btNext2= new Button("Next");
	  GridPane gridPane2 = new GridPane();
	  gridPane2.setHgap(10);
	  gridPane2.setVgap(10);
	  gridPane2.add(new Label("Activity"), 0, 0);
	  gridPane2.add(tfActivity, 1, 0);
	  gridPane2.add(new Label("Activity Place:"), 0, 1);
	  gridPane2.add(tfActivityPlace, 1, 1);
	  gridPane2.add(new Label("With Who:"), 0, 2);
	  gridPane2.add(tfWithWho, 1, 2);
	  gridPane2.add(new Label("Date:"), 0, 3);
	  gridPane2.add(tfDateStarted, 1, 3);
	  gridPane2.add(btNext2, 1, 4);
	  gridPane2.add(btBack1, 0, 4);
	  gridPane2.add(btSave2, 1, 4);
	  gridPane2.setAlignment(Pos.CENTER);
	  GridPane.setHalignment(btNext2, HPos.RIGHT);
	  
	  
	  btBack1.setOnAction(e -> primaryStage.setScene(scene1));
	  VBox layout2= new VBox(20);
	  //layout2.getChildren().addAll( button2);
	  scene2= new Scene(gridPane2,400,400);
	  
	  //third gridpane
	  Button btBack2 = new Button("Back");
	  Button btSave3 = new Button("Save");
	  Button btNext3 = new Button("Next");
	  GridPane gridPane3 = new GridPane();
	  gridPane3.setHgap(10);
	  gridPane3.setVgap(10);
	  gridPane3.add(new Label("Name"), 0, 0);
	  gridPane3.add(tfName, 1, 0);
	  gridPane3.add(new Label("Nationality:"), 0, 1);
	  gridPane3.add(tfNationality, 1, 1);
	  gridPane3.add(new Label("Languages:"), 0, 2);
	  gridPane3.add(tfLanguages, 1, 2);
	  gridPane3.add(new Label("Date Met:"), 0, 3);
	  gridPane3.add(tfDateMet, 1, 3);
	  gridPane3.add(btBack2, 0, 4);
	  gridPane3.add(btSave3, 1, 4);
	  gridPane3.add(btNext3, 1, 4);
	  gridPane3.setAlignment(Pos.CENTER);
	  GridPane.setHalignment(btNext3, HPos.RIGHT);
	  
	  
	  btBack2.setOnAction(e -> primaryStage.setScene(scene2));
	  VBox layout3= new VBox(20);
	  //layout2.getChildren().addAll( button2);
	  scene3= new Scene(gridPane3,400,400);
	  
	  //fourth gridpane
	  Button btBack3 = new Button("Back");
	  Button btSave4 = new Button("Save");
	  GridPane gridPane4 = new GridPane();
	  gridPane4.setHgap(10);
	  gridPane4.setVgap(10);
	  gridPane4.add(new Label("How Spicey?(Hit back to enter specifically food): "), 0, 0);
	  gridPane4.add(tfHowSpicey, 1, 0);
	  gridPane4.add(btBack3, 0, 4);
	  gridPane4.add(btSave4, 1, 4);
	  gridPane4.setAlignment(Pos.CENTER);
	  GridPane.setHalignment(btNext2, HPos.RIGHT);
	  
	  
	  btBack3.setOnAction(e -> primaryStage.setScene(scene3));
	  VBox layout4= new VBox(20);
	  //layout2.getChildren().addAll( button2);
	  scene4= new Scene(gridPane4,450,400);
	  
	 
	  btNext1.setOnAction(e-> primaryStage.setScene(scene2));
	  btNext2.setOnAction(e-> primaryStage.setScene(scene3));
	  btSave.setOnAction(e -> page1());
	  btSave2.setOnAction(e -> page2());
	  btSave3.setOnAction(e -> page3());
	  btSave4.setOnAction(e-> page4());
	  btNext3.setOnAction(e -> primaryStage.setScene(scene4));
	  
	  }



//Method that corresponds to the button being clicked
public void page1() {
	
	//Gets user input and turns it into variable
	String tripName=tfTripName.getText();
	String continent=tfContinent.getText();
	String country=tfCountry.getText();
	String state=tfState.getText();
	String city=tfCity.getText();
	String placeStayed=tfPlaceStayed.getText();
	String peopleMet=tfPeopleMet.getText();
	String dateArrived=tfDateArrived.getText();
	String dateLeft=tfDateLeft.getText();
	String activities=tfActivities.getText();
	
	
	Trip trip1= new Trip(tripName,continent,country,state,city,placeStayed,peopleMet,dateArrived,dateLeft,activities);
	System.out.println(trip1.toString());
	

	}
//Other method for the output of the second page
public void page2() {
	String activity=tfActivity.getText();
	String activityPlace = tfActivityPlace.getText();
	String withWho= tfWithWho.getText();
	String dateStarted = tfDateStarted.getText();
	
	Activity activity1 = new Activity(activity,activityPlace,withWho,dateStarted);
	System.out.println(activity1.toString());
	
	}

//Other method for the output of the third page
public void page3() {
	String name = tfName.getText();
	String nationality = tfNationality.getText();
	String languages = tfLanguages.getText();
	String dateMet = tfDateMet.getText();
	
	People people1 = new People(name, nationality, languages, dateMet);
	System.out.println(people1.toString());
	
}

//Other method for the output of the fourth page
public void page4() {
	String activity=tfActivity.getText();
	String activityPlace = tfActivityPlace.getText();
	String withWho= tfWithWho.getText();
	String dateStarted = tfDateStarted.getText();
	String howSpicey = tfHowSpicey.getText();
	
	Food food1 = new Food(activity,activityPlace,withWho,dateStarted,howSpicey);
	System.out.println(food1.toString());
}




public static void main(String[] args) {
	//Trip trip1= new Trip();
	//System.out.println(trip1.toString());
	
	launch(args);


	}
}