// Importing necessary libraries and classes

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.collections.*;
import java.util.*;

// importing event handler and action event to allow functionality of butttons
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class CalculatorApp extends Application
{

	// Creating an instance of the Utilities Class
	Utilities utils = new Utilities();


	// Instantiating the TextArea variable
	TextArea display;

	// Instantiating the first HBox which represents the first row
	HBox hbox0;

	// Initiating the Button for Principal Amount
	Button principalBtn;

	// Initiating the Button for the rate of mortgage
	Button rateBtn;

	// Initiating the Button for entering Time
	Button timeBtn;

	// Initiating the button which displays mortgage 
	Button mortgageBtn;

	// Initiating the second HBox for the second row
	HBox hbox1;

	// Initiating the button for getting sine of a value
	Button sinBtn;

	// Initiating the button to get the cosine of a value 
	Button cosBtn;

	// Initiating the cosine 
	Button tanBtn;

	// Initiating the button to find the logarithm of a number
	Button logBtn;

	// Initiating the hbox that contains the third row
	HBox hbox2;

	// Initiating the button to find sin inverse
	Button sinInverseBtn;

	// Initiating the button to find cos inverse
	Button cosInverseBtn;

	// Initiating the button to find tan inverse
	Button tanInverseBtn;

	// Initiating HBox that serves as the fourth row
	HBox hbox3;

	// Initiating the button that inputs an open parentheses
	Button openParenthesesBtn;

	//Initiating the button closes a parentheses
	Button closeParenthesesBtn;

	// Initiating the button that finds the square root of a number
	Button sqrRootBtn;

	// Initiating a button that finds the square of a number
	Button squareBtn;

	// Initiating the button that produces the value of pie
	Button pieBtn;

	// Initiating the button that represents the exponenent(e)
	Button exponent;

	// Initiating the HBox that represents the fifth row
	HBox hbox4;

	// Initiating the button that clears the textArea
	Button clearBtn;

	// Initiating the button that deletes text from the textArea
	Button deleteBtn;

	// Initiating the button that finds the percentage
	Button percentBtn;

	// Initiating the button for division
	Button divideBtn;

	// Initiating the HBox that represents the sixth row
	HBox hbox5;

	// Initiating the button that represents the number seven
	Button sevenBtn;

	// Initiating the button that represents the number eight
	Button eightBtn;

	// Initiating the button that represents the number nine
	Button nineBtn;

	// Initiating the button for multiplying 
	Button multiplyBtn;

	// Initiating the HBox that represents the seventh row
	HBox hbox6;

	// Initiating the button that represents the number four
	Button fourBtn;

	// Initiating the button that represents the number five
	Button fiveBtn;

	// Initiating the button that represents the number six
	Button sixBtn;

	// Initiating the button that represents the minus operator
	Button minusBtn;

	// Initiating the HBox that contains the eighth row
	HBox hbox7;

	// Initiating the button that represents the number one
	Button oneBtn;

	// Initiating the button that represents the number two
	Button twoBtn;

	// Initiating the button that represents the number three
	Button threeBtn;

	// Initiating the button that represents the plus operator
	Button plusBtn;

	// Initiating the HBox that holds the ninth row 
	HBox hbox8;

	// Initiating the button that represents the number zero
	Button zeroBtn;

	// Initiating the button that represents a decimal point
	Button pointBtn;

	// Initiating the button that represents the equals operator
	Button equalBtn;

	// Initiating the button that represents the answer function
	Button answerBtn;

	// Initiating the HBox that holds the tenth row
	HBox hbox9;

	// Initiating the VBox that contains the horizontal column that contains all rows
	VBox vbox;

	// Initiating the scene for the application
	Scene scene;


	// Main method that launches the Calculator
	public static void main(String[] args)
	{
		// Launches the app
		launch(args);
	}

	// Ovverides the start method which contains all the components of the app
	@Override
	public void start(Stage primaryStage)
	{

		// App Title
		primaryStage.setTitle("Calculator App");



		// TEXT AREA

		// Text Area dispaying results
		display = new TextArea();

		// Setting width for the text area 
		display.setPrefWidth(330); 

		// Setting the height for the text area
        display.setPrefHeight(80);

        // Putting the text area in the first row
        hbox0 = new HBox(display);

        // Centre aligning the text area
		hbox0.setAlignment(Pos.CENTER);

		// Adding padding to the text area
		hbox0.setPadding(new Insets(30));




		// PRINCIPAL BUTTON


		// Buttons on first row
		principalBtn = new Button("p");

		// Setting an event listener on the principal button
		principalBtn.setOnAction(new PrincipalHandler());

		// Adding the style class to the button
		principalBtn.getStyleClass().add("principal");

		// Setting width for the button
		principalBtn.setPrefWidth(55);

		// Setting height for the button
		principalBtn.setPrefHeight(20);




		// RATE BUTTON

		// Setting up the button label
		rateBtn = new Button("r");

		// Setting an event listener on the rate button
		rateBtn.setOnAction(new RateHandler());

		// Setting height for the button
		rateBtn.setPrefHeight(20);

		// Setting width for the button
		rateBtn.setPrefWidth(55);

		// Adding the style class to the button
		rateBtn.getStyleClass().add("rate");




		// TIME BUTTON


		// Adding the button label
		timeBtn = new Button("n");

		// Setting an event listener on the time button
		timeBtn.setOnAction(new TimeHandler());
		timeBtn.setPrefWidth(55);
		timeBtn.setPrefHeight(20);
		timeBtn.getStyleClass().add("time");



		// MORTGAGE BUTTON


		// Adding the label for the mortgage button
		mortgageBtn = new Button("mg");

		// Setting an event listener on the mortgage button
		mortgageBtn.setOnAction(new MortgageHandler());

		// Setting height for the button
		mortgageBtn.setPrefHeight(20);

		// Setting width for the button
		mortgageBtn.setPrefWidth(55);

		// Adding the style class to the button
		mortgageBtn.getStyleClass().add("mortgage");

		// Putting the buttons in the second row
		hbox1 = new HBox(2,principalBtn, rateBtn, timeBtn, mortgageBtn);

		// Center aligning the Hbox
		hbox1.setAlignment(Pos.CENTER);



		// SIN BUTTON


        // Buttons on second row
		sinBtn = new Button("sin");

		// Setting an event listener on the sin button
		sinBtn.setOnAction(new SinHandler());

		// Setting width for the button
		sinBtn.setPrefWidth(55);

		// Setting height for the button
		sinBtn.setPrefHeight(20);

		// Adding the style class to the button
		sinBtn.getStyleClass().add("sin");




		// COS BUTTON


		// Buttons on second row 
		cosBtn = new Button("cos");

		// Setting an event listener on the cos button
		cosBtn.setOnAction(new CosHandler());

		// Setting width for the button
		cosBtn.setPrefWidth(55);

		// Setting height for the button
		cosBtn.setPrefHeight(20);

		// Adding the style class to the button
		cosBtn.getStyleClass().add("cos");


		// TAN BUTTON //

		// Adding the label
		tanBtn = new Button("tan");

		// Setting an event listener on the tan button
		tanBtn.setOnAction(new TanHandler());

		// Setting width for the button
		tanBtn.setPrefWidth(55);

		// Setting height for the button
		tanBtn.setPrefHeight(20);

		// Adding the style class to the button
		tanBtn.getStyleClass().add("tan");



		// LOG BUTTON //

		logBtn = new Button("log");

		// Setting an event listener on the log button
		logBtn.setOnAction(new logHandler());


		// Setting width for the button
		logBtn.setPrefWidth(55);


		// Setting height for the button
		logBtn.setPrefHeight(20);

		// Adding the style class to the button
		logBtn.getStyleClass().add("log");


		// Puttin the buttons on the third row
		hbox2 = new HBox(2,sinBtn, cosBtn, tanBtn, logBtn);

		// Positioning them in the center
		hbox2.setAlignment(Pos.CENTER);




		// SIN INVERSE BUTTON //


		// Buttons on third row
		sinInverseBtn = new Button("arcsin");

		// Setting an event listener on the sin inverse button
		sinInverseBtn.setOnAction(new sinInverseHandler());

		// Setting width for the button
		sinInverseBtn.setPrefWidth(73.33);

		// Setting height for the button
		sinInverseBtn.setPrefHeight(20);

		// Adding the style class to the button
		sinInverseBtn.getStyleClass().add("arcsin");




		// COS INVERSE BUTTON

		// Adding the label for cos inverse
		cosInverseBtn = new Button("arccos");

		// Setting an event listener on the cos inverse button
		cosInverseBtn.setOnAction(new cosInverseHandler());

		// Setting width for the button
		cosInverseBtn.setPrefWidth(73.33);

		// Setting height for the button
		cosInverseBtn.setPrefHeight(20);

		// Adding the style class to the button
		cosInverseBtn.getStyleClass().add("arccos");




		// TAN INVERSE BUTTON


		// Adding the tan inverse label
		tanInverseBtn = new Button("arctan");

		// Setting an event listener on the tan inverse button
		tanInverseBtn.setOnAction(new tanInverseHandler());

		// Setting width for the button 
		tanInverseBtn.setPrefWidth(73.33);

		// Setting height for the button
		tanInverseBtn.setPrefHeight(20);

		// Adding the style class to the button
		tanInverseBtn.getStyleClass().add("arctan");

		// Putting them in the fourth row
		hbox3 = new HBox(3,sinInverseBtn, cosInverseBtn, tanInverseBtn);

		// Centre aligning the items
		hbox3.setAlignment(Pos.CENTER);




		// OPEN PARENTHESES

		// Adding the label for the button
		openParenthesesBtn = new Button("(");


		// Setting an event listener on the open parentheses button
		openParenthesesBtn.setOnAction(new OpenParenthesesHandler());


		// Setting width for the button		
		openParenthesesBtn.setPrefWidth(36.6);

		// Setting height for the button
		openParenthesesBtn.setPrefHeight(20);

		// Adding the style class to the button
		openParenthesesBtn.getStyleClass().add("openbracket");




		// CLOSE PARENTHESES // 
		closeParenthesesBtn = new Button(")");

		// Setting an event listener on the close Parentheses button
		closeParenthesesBtn.setOnAction(new CloseParenthesesHandler());

		// Setting width for the button
		closeParenthesesBtn.setPrefWidth(36.6);

		// Setting height for the button
		closeParenthesesBtn.setPrefHeight(20);

		// Adding the style class to the button
		closeParenthesesBtn.getStyleClass().add("closebracket");




		// SQUARE ROOT BUTTON

		// Adding the label
		sqrRootBtn = new Button("\u221A");

		// Setting an event listener on the Square root button
		sqrRootBtn.setOnAction(new squareRootHandler());


		//setting width for the button
		sqrRootBtn.setPrefWidth(36.6);

		//setting height for the button
		sqrRootBtn.setPrefHeight(20);

		//adding style class to the button
		sqrRootBtn.getStyleClass().add("squareroot");


// SQUARE BUTTON

		//Adding the label
		squareBtn = new Button("x" + "\u00B2");

		// Setting an event listener on the square button
		squareBtn.setOnAction(new squarehandler());

		//setting width for the button
		squareBtn.setPrefWidth(36.6);

		//setting width for the button
		squareBtn.setPrefHeight(20);


		//adding style class to the button
		squareBtn.getStyleClass().add("square");


//PIEBTN


		//ADDING THE LABEL

		pieBtn = new Button("\u03c0");

		// Setting an event listener on the pie button
		pieBtn.setOnAction(new PieHandler());

		//adding widtht the button
		pieBtn.setPrefWidth(36.6);

		//setting height for the button
		pieBtn.setPrefHeight(20);




//adding style class to the button
		pieBtn.getStyleClass().add("pie");



//EXPONENT


		//adding label

		exponent = new Button("e");

		// Setting an event listener on the exponent button
		exponent.setOnAction(new ExponentHandler());

		//adding widtht the button
		exponent.setPrefWidth(36.6);

		//adding heightthe button
		exponent.setPrefHeight(20);


		//adding style class to the button
		exponent.getStyleClass().add("exponent");


// Putting them in the fourth row
		hbox4 = new HBox(1.5,openParenthesesBtn, closeParenthesesBtn, sqrRootBtn, squareBtn, pieBtn, exponent);



		// Centre aligning the items
		hbox4.setAlignment(Pos.CENTER);



		// Buttons on fifth row
		clearBtn = new Button("C");

		// Setting an event listener on the clear button
		clearBtn.setOnAction(new ClearHandler());


		//adding width the button
		clearBtn.setPrefWidth(55);


		//adding height the button
		clearBtn.setPrefHeight(20);


		//adding style class to the button
		clearBtn.getStyleClass().add("clear");



//DELETEBTN

		deleteBtn = new Button("DEL");

		// Setting an event listener on the delete button
		deleteBtn.setOnAction(new DeleteHandler());


		//adding width the buttoN
		deleteBtn.setPrefWidth(55);

		//adding height the button
		deleteBtn.setPrefHeight(20);


		//adding style class to the button
		deleteBtn.getStyleClass().add("delete");


		//PERCENTBTN


		percentBtn = new Button("%");

		// Setting an event listener on the percent button
		percentBtn.setOnAction(new PercentHandler());

		//adding width the button
		percentBtn.setPrefWidth(55);

		//adding height the button
		percentBtn.setPrefHeight(20);

		//adding style class to button
		percentBtn.getStyleClass().add("percent");


		//DIVEDE BTN

		divideBtn = new Button("\u00F7");

		// Setting an event listener on the divide button
		divideBtn.setOnAction(new DivideHandler());


		//adding width the button
		divideBtn.setPrefWidth(55);


		//adding heightthe button
		divideBtn.setPrefHeight(20);


		//adding style class the button
		divideBtn.getStyleClass().add("divide");




// Putting them in the fifth row
		hbox5 = new HBox(4,clearBtn, deleteBtn, percentBtn, divideBtn);


		//center aligning items
		hbox5.setAlignment(Pos.CENTER);


		// Buttons on sixth row

		//SEVENBTN
		sevenBtn = new Button("7");

		// Setting an event listener on the seven button
		sevenBtn.setOnAction((new sevenHandler()));

		//adding width The button
		sevenBtn.setPrefWidth(45);

		//adding height the button
		sevenBtn.setPrefHeight(20);

		//adding style class to the button
		sevenBtn.getStyleClass().add("seven");



//EIGHTBTN

		eightBtn = new Button("8");

		// Setting an event listener on the eight button
		eightBtn.setOnAction((new eightHandler()));

		//adding WIDTH the button
		eightBtn.setPrefWidth(45);

		//adding height the button
		eightBtn.setPrefHeight(20);

		// adding style class to the button
		eightBtn.getStyleClass().add("eight");

//	NINEBTN

		nineBtn = new Button("9");

		// Setting an event listener on the nine button
		nineBtn.setOnAction(new nineHandler());

		//adding WIDTH the button
		nineBtn.setPrefWidth(45);

		//adding HEIGHT the button
		nineBtn.setPrefHeight(20);


		////adding STYLE CLASS button
		nineBtn.getStyleClass().add("nine");




//MULTIPLU BTN
		multiplyBtn = new Button("X");



		// Setting an event listener on the multiply button
		multiplyBtn.setOnAction(new MultiplyHandler());

		//adding WIDTH the button
		multiplyBtn.setPrefWidth(45);

		//adding height the button
		multiplyBtn.setPrefHeight(20);

		//adding style class to the  button
		multiplyBtn.getStyleClass().add("multiply");


// Putting them in the sixth row

		hbox6 = new HBox(17,sevenBtn, eightBtn, nineBtn, multiplyBtn);


		//setting alignment 
		hbox6.setAlignment(Pos.CENTER);



		// Buttons on seventh row


		//FOURBTN


		fourBtn = new Button("4");

		// Setting an event listener on the four button
		fourBtn.setOnAction(new fourHandler());


//adding WIDTH the button
		fourBtn.setPrefWidth(45);

		//adding height the button
		fourBtn.setPrefHeight(20);


//adding style class to the  button
		fourBtn.getStyleClass().add("four");


		//FIVEBTN


		fiveBtn = new Button("5");

		// Setting an event listener on the five button
		fiveBtn.setOnAction(new fiveHandler());

		//adding WIDTH the button
		fiveBtn.setPrefWidth(45);

		//adding height the button
		fiveBtn.setPrefHeight(20);


		//adding style class to the  button
		fiveBtn.getStyleClass().add("five");


		//SIXBTN


		sixBtn = new Button("6");

		// Setting an event listener on the six button
		sixBtn.setOnAction(new sixHandler());


		//adding WIDTH the button
		sixBtn.setPrefWidth(45);

		//adding height the button
		sixBtn.setPrefHeight(20);



		//adding style class to the  button
		sixBtn.getStyleClass().add("six");


		//MINUSBTN



		minusBtn = new Button("-");

		// Setting an event listener on the minus button
		minusBtn.setOnAction(new Minushandler());


		//adding WIDTH the button
		minusBtn.setPrefWidth(45);

		//adding height the button
		minusBtn.setPrefHeight(20);



//adding style class to the  button

		minusBtn.getStyleClass().add("minus");


// Putting them in the seventh row
		hbox7 = new HBox(17,fourBtn, fiveBtn, sixBtn, minusBtn);


		//setting yp the alignment
		hbox7.setAlignment(Pos.CENTER);




		// Buttons on eigth row


		//ONEBTN


		oneBtn = new Button("1");

		// Setting an event listener on the one button
		oneBtn.setOnAction(new oneHandler());


		//adding WIDTH the button
		oneBtn.setPrefWidth(45);


		//adding height the button
		oneBtn.setPrefHeight(20);



//adding style class to the  button
		oneBtn.getStyleClass().add("one");


		//TWOBTN

		twoBtn = new Button("2");

		// Setting an event listener on the two button
		twoBtn.setOnAction(new twoHandler());

		//adding WIDTH the button
		twoBtn.setPrefWidth(45);


		//adding height the button
		twoBtn.setPrefHeight(20);




//adding style class to the  button
		twoBtn.getStyleClass().add("two");


//THREEBTN



		threeBtn = new Button("3");

		// Setting an event listener on the three button
		threeBtn.setOnAction(new threeHandler());

		//adding WIDTH the button
		threeBtn.setPrefWidth(45);


		//adding height the button
		threeBtn.setPrefHeight(20);

//adding style class to the  button
		threeBtn.getStyleClass().add("three");



//PLUSBTN



		plusBtn = new Button("+");

		// Setting an event listener on the plus button
		plusBtn.setOnAction(new PlusHandler());



//adding WIDTH the button
		plusBtn.setPrefWidth(45);


		//adding height the button
		plusBtn.setPrefHeight(20);


		//adding style class to the  button
		plusBtn.getStyleClass().add("plus");




		// Putting them in the eigthrow

		hbox8 = new HBox(17,oneBtn, twoBtn, threeBtn, plusBtn);


		//setting up the alignment
		hbox8.setAlignment(Pos.CENTER);



		// Buttons on ninth row


		//ZEROBTN


		zeroBtn = new Button("0");

		// Setting an event listener on the zero button
		zeroBtn.setOnAction(new zeroHandler());


		//adding WIDTH the button
		zeroBtn.setPrefWidth(45);


		//adding height the button
		zeroBtn.setPrefHeight(20);

		//adding style class to the  button
		zeroBtn.getStyleClass().add("zero");


		//POINTBTN

		pointBtn = new Button(".");

		// Setting an event listener on the point button
		pointBtn.setOnAction(new pointHandler());


		//adding WIDTH the button
		pointBtn.setPrefWidth(45);


		//adding height the button
		pointBtn.setPrefHeight(20);


//adding style class to the  button
		pointBtn.getStyleClass().add("point");

		//EQUALBTN


		equalBtn = new Button("=");

		// Setting an event listener on the equal button
		equalBtn.setOnAction(new EqualHandler());

		//adding WIDTH the button
		equalBtn.setPrefWidth(45);


		//adding height the button
		equalBtn.setPrefHeight(20);



//adding style class to the  button

		equalBtn.getStyleClass().add("equal");


//ANSWERBTM


		answerBtn = new Button("Ans");

		// Setting an event listener on the answer button
		answerBtn.setOnAction(new AnswerHandler());


		//adding WIDTH the button
		answerBtn.setPrefWidth(45);



		//adding height the button
		answerBtn.setPrefHeight(20);



//adding style class to the  button
		answerBtn.getStyleClass().add("ans");


		// Putting them in the night row

		hbox9 = new HBox(17, zeroBtn, pointBtn, answerBtn ,equalBtn);

		//settign up the alignment
		hbox9.setAlignment(Pos.CENTER);



		// Vbox containing all the Hboxes
		vbox = new VBox(11.2,hbox0, hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7, hbox8, hbox9);



		// SCENE //


		// Scene containing the vbox and it's content
		scene = new Scene(vbox, 300, 530);



		// Linking the stylesheet to the scene
		scene.getStylesheets().add("mystyles.css");




		// Setting the scene on the stage
		primaryStage.setScene(scene);



		// Show the stage
		primaryStage.show();




	}




	//HANDELS PRINCPAL BUTTON FUNBTIONALITY

	class PrincipalHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addPrincipal(display);



		}
	}


	//HANDELS RATE BUTTON FUNBTIONALITY

	class RateHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addRate(display);



		}
	}


	//HANDELS TIMEBUTTON FUNBTIONALITY


	class TimeHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addTime(display);


		}
	}


	//HANDELS MORTGAGE BUTTON FUNBTIONALITY

	class MortgageHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getMortgage(display);


		}
	}



//HANDELS CLEAR BUTTON FUNBTIONALITY
	class ClearHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.clear(display);



		}
	}


//HANDELS DELETE BUTTON FUNBTIONALITY

	class DeleteHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS



		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.delete(display);



		}
	}


//HANDELS OPEN PARENTHESIS BUTTON FUNBTIONALITY

	class OpenParenthesesHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS



		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText("(");


		}
	}


//HANDELS CLOSE PARENTHESIS  BUTTON FUNBTIONALITY
	class CloseParenthesesHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText(")");



		}
	}



//HANDELS SIN BUTTON FUNBTIONALITY
	class SinHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getSin(display);



		}
	}


	//HANDELS COS BUTTON FUNBTIONALITY

	class CosHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getCos(display);



		}
	}

	//HANDELS TAN BUTTON FUNBTIONALITY

	class TanHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getTan(display);




		}
	}



//HANDELS PERCENT BUTTON FUNBTIONALITY


	class PercentHandler implements EventHandler<ActionEvent> {

		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event) {

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getPercentage(display);



		}
	}



//HANDELS PIE BUTTON FUNBTIONALITY


	class PieHandler implements EventHandler<ActionEvent> {

		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event) {


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getPie(display);




		}
	}


	//HANDELS EXPONENT BUTTON FUNBTIONALITY


	class ExponentHandler implements EventHandler<ActionEvent> {

		@Override


		//HANDLE CLASS



		public void handle(ActionEvent event) {


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getExponential(display);
		}
	}


	//HANDELS NINE BUTTON FUNBTIONALITY



	class nineHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText("9");
		}
	}

	//HANDELS EIGHT BUTTON FUNBTIONALITY


	class eightHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText("8");


		}
	}


//HANDELS SEVEN BUTTON FUNBTIONALITY



	class sevenHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS



		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("7");



		}
	}


	//HANDELS SIX BUTTON FUNBTIONALITY



	class sixHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS



		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText("6");



		}
	}


	//HANDELS FIVE BUTTON FUNBTIONALITY

	class fiveHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS



		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("5");


		}
	}

//HANDELS FOUR BUTTON FUNBTIONALITY


	class fourHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("4");


		}
	}



	//HANDELS THREE BUTTON FUNBTIONALITY



	class threeHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS



		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("3");


		}
	}


	//HANDELS TWO BUTTON FUNBTIONALITY

	class twoHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("2");
		}
	}



//HANDELS ONE BUTTON FUNBTIONALITY


	class oneHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("1");


		}
	}


	//HANDELS ZERO BUTTON FUNBTIONALITY



	class zeroHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			display.appendText("0");



		}
	}



	//HANDELS POINTBUTTON FUNBTIONALITY



	class pointHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){


			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			display.appendText(".");


		}
	}



	//HANDELS LOG BUTTON FUNBTIONALITY




	class logHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getLog(display);
		}
	}




//HANDELS SINEINVERSE BUTTON FUNBTIONALITY


	class sinInverseHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED
			utils.getSinInverse(display);


		} 
	}





	//HANDELS COSINVERSE BUTTON FUNBTIONALITY


	class cosInverseHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED
			utils.getCosInverse(display);


		} 
	}




//HANDELS TANINVERSE BUTTON FUNBTIONALITY

	class tanInverseHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED
			utils.getTanInverse(display);


		} 
	}



	//HANDELS SQUARE BUTTON FUNBTIONALITY



	class squareRootHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			utils.getSquareRoot(display);

		} 
	}



	//HANDELS SQUARE BUTTON FUNBTIONALITY

	class squarehandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.getSquare(display);


		}
	}



	//HANDELS PLUSBUTTON FUNBTIONALITY

	class PlusHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			utils.addPlus(display);


		}
	}



//HANDELS MINUS BUTTON FUNBTIONALITY
	class Minushandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addMinus(display);


		}
	}


	//HANDELS DIVIDE BUTTON FUNBTIONALITY

	class DivideHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addDivide(display);


		}
	}


//HANDELS MULTIPLY BUTTON FUNBTIONALITY


	class MultiplyHandler implements EventHandler<ActionEvent>
	{
		@Override


		//HANDLE CLASS


		public void handle(ActionEvent event){
			//PERFORMS THIS WHEN BUTTON IS TRIGGERED

			utils.addMultiply(display);
		

		

		}
	}


	//HANDELS EQUAL BUTTON FUNBTIONALITY

	class EqualHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			utils.equals(display);
		

		}
	}




//HANDELS ANSWER BUTTON FUNBTIONALITY



	class AnswerHandler implements EventHandler<ActionEvent>
	{
		@Override



		//HANDLE CLASS
		public void handle(ActionEvent event){

			//PERFORMS THIS WHEN BUTTON IS TRIGGERED


			utils.storeAnswer(display);
		


		}
	}

}