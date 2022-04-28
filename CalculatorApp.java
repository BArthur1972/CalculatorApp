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

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class CalculatorApp extends Application{

	String operator = "";

	public double a = 0;
	public double b = 0;

	double result = 0;

	// Utilities utils = new Utilities();

	TextArea display;
	HBox hbox0;
	Button principalBtn;
	Button rateBtn;
	Button timeBtn;
	Button mortgageBtn;
	HBox hbox1;
	Button sinBtn;
	Button cosBtn;
	Button tanBtn;
	Button logBtn;
	HBox hbox2;
	Button sinInverseBtn;
	Button cosInverseBtn;
	Button tanInverseBtn;
	HBox hbox3;
	Button openParenthesesBtn;
	Button closeParenthesesBtn;
	Button sqrRootBtn;
	Button squareBtn;
	Button pieBtn;
	Button exponent;
	HBox hbox4;
	Button clearBtn;
	Button deleteBtn;
	Button percentBtn;
	Button divideBtn;
	HBox hbox5;
	Button sevenBtn;
	Button eightBtn;
	Button nineBtn;
	Button multiplyBtn;
	HBox hbox6;
	Button fourBtn;
	Button fiveBtn;
	Button sixBtn;
	Button minusBtn;
	HBox hbox7;
	Button oneBtn;
	Button twoBtn;
	Button threeBtn;
	Button plusBtn;
	HBox hbox8;
	Button zeroBtn;
	Button pointBtn;
	Button equalBtn;
	HBox hbox9;
	VBox vbox;
	Scene scene;




	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		// App Title
		primaryStage.setTitle("Calculator App");

		// Text Area dispaying results
		display = new TextArea();
		display.setPrefWidth(330); 
        display.setPrefHeight(80);

        hbox0 = new HBox(display);
		hbox0.setAlignment(Pos.CENTER);
		hbox0.setPadding(new Insets(30));

		// Buttons on first row
		principalBtn = new Button("p");
		principalBtn.getStyleClass().add("principal");
		principalBtn.setPrefWidth(55);
		principalBtn.setPrefHeight(20);


		rateBtn = new Button("r");
		rateBtn.setPrefHeight(20);
		rateBtn.setPrefWidth(55);
		rateBtn.getStyleClass().add("rate");



		timeBtn = new Button("n");
		timeBtn.setPrefWidth(55);
		timeBtn.setPrefHeight(20);
		timeBtn.getStyleClass().add("time");


		mortgageBtn = new Button("mg");
		mortgageBtn.setPrefHeight(20);
		mortgageBtn.setPrefWidth(55);
		mortgageBtn.getStyleClass().add("mortgage");

		hbox1 = new HBox(2,principalBtn, rateBtn, timeBtn, mortgageBtn);

		hbox1.setAlignment(Pos.CENTER);



        // Buttons on second row
		sinBtn = new Button("sin");
		sinBtn.setOnAction(new SinHandler());
		sinBtn.setPrefWidth(55);
		sinBtn.setPrefHeight(20);
		sinBtn.getStyleClass().add("sin");



		cosBtn = new Button("cos");
		cosBtn.setOnAction(new CosHandler());
		cosBtn.setPrefWidth(55);
		cosBtn.setPrefHeight(20);
		cosBtn.getStyleClass().add("cos");



		tanBtn = new Button("tan");
		tanBtn.setOnAction(new TanHandler());
		tanBtn.setPrefWidth(55);
		tanBtn.setPrefHeight(20);
		tanBtn.getStyleClass().add("tan");



		logBtn = new Button("log");
		logBtn.setPrefWidth(55);
		logBtn.setPrefHeight(20);
		logBtn.getStyleClass().add("log");


		hbox2 = new HBox(2,sinBtn, cosBtn, tanBtn, logBtn);
		hbox2.setAlignment(Pos.CENTER);

		// Buttons on third row
		sinInverseBtn = new Button("arcsin");
		sinInverseBtn.setPrefWidth(73.33);
		sinInverseBtn.setPrefHeight(20);
		sinInverseBtn.getStyleClass().add("arcsin");




		cosInverseBtn = new Button("arccos");
		cosInverseBtn.setPrefWidth(73.33);
		cosInverseBtn.setPrefHeight(20);
		cosInverseBtn.getStyleClass().add("arccos");





		tanInverseBtn = new Button("arctan");
		tanInverseBtn.setPrefWidth(73.33);
		tanInverseBtn.setPrefHeight(20);
		tanInverseBtn.getStyleClass().add("arctan");



		hbox3 = new HBox(3,sinInverseBtn, cosInverseBtn, tanInverseBtn);
		hbox3.setAlignment(Pos.CENTER);




		// Buttons on fourth row
		openParenthesesBtn = new Button("(");
		openParenthesesBtn.setPrefWidth(36.6);
		openParenthesesBtn.setPrefHeight(20);
		openParenthesesBtn.getStyleClass().add("openbracket");



		closeParenthesesBtn = new Button(")");
		closeParenthesesBtn.setPrefWidth(36.6);
		closeParenthesesBtn.setPrefHeight(20);
		closeParenthesesBtn.getStyleClass().add("closebracket");



		sqrRootBtn = new Button("\u221A");
		sqrRootBtn.setOnAction(new squareRootHandler());
		sqrRootBtn.setPrefWidth(36.6);
		sqrRootBtn.setPrefHeight(20);
		sqrRootBtn.getStyleClass().add("squareroot");



		squareBtn = new Button("x" + "\u00B2");
		squareBtn.setOnAction(new squarehandler());
		squareBtn.setPrefWidth(36.6);
		squareBtn.setPrefHeight(20);
		squareBtn.getStyleClass().add("square");




		pieBtn = new Button("\u03c0");
		pieBtn.setPrefWidth(36.6);
		pieBtn.setPrefHeight(20);
		pieBtn.getStyleClass().add("pie");



		exponent = new Button("e");
		exponent.setPrefWidth(36.6);
		exponent.setPrefHeight(20);
		exponent.getStyleClass().add("exponent");



		hbox4 = new HBox(1.5,openParenthesesBtn, closeParenthesesBtn, sqrRootBtn, squareBtn, pieBtn, exponent);
		hbox4.setAlignment(Pos.CENTER);



		// Buttons on fifth row
		clearBtn = new Button("C");
		clearBtn.setOnAction(new ClearHandler());
		clearBtn.setPrefWidth(55);
		clearBtn.setPrefHeight(20);
		clearBtn.getStyleClass().add("clear");



		deleteBtn = new Button("DEL");
		deleteBtn.setPrefWidth(55);
		deleteBtn.setPrefHeight(20);
		deleteBtn.getStyleClass().add("delete");


		percentBtn = new Button("%");
		percentBtn.setPrefWidth(55);
		percentBtn.setPrefHeight(20);
		percentBtn.getStyleClass().add("percent");

		divideBtn = new Button("\u00F7");
		divideBtn.setPrefWidth(55);
		divideBtn.setPrefHeight(20);
		divideBtn.getStyleClass().add("divide");

		hbox5 = new HBox(4,clearBtn, deleteBtn, percentBtn, divideBtn);
		hbox5.setAlignment(Pos.CENTER);



		// Buttons on sixth row
		sevenBtn = new Button("7");
		sevenBtn.setOnAction((new sevenHandler()));
		sevenBtn.setPrefWidth(45);
		sevenBtn.setPrefHeight(20);
		sevenBtn.getStyleClass().add("seven");



		eightBtn = new Button("8");
		eightBtn.setOnAction((new eightHandler()));
		eightBtn.setPrefWidth(45);
		eightBtn.setPrefHeight(20);
		eightBtn.getStyleClass().add("eight");



		nineBtn = new Button("9");
		nineBtn.setOnAction(new nineHandler());
		nineBtn.setPrefWidth(45);
		nineBtn.setPrefHeight(20);
		nineBtn.getStyleClass().add("nine");



		multiplyBtn = new Button("X");
		multiplyBtn.setPrefWidth(45);
		multiplyBtn.setPrefHeight(20);
		multiplyBtn.getStyleClass().add("multiply");


		hbox6 = new HBox(17,sevenBtn, eightBtn, nineBtn, multiplyBtn);
		hbox6.setAlignment(Pos.CENTER);

		// Buttons on seventh row
		fourBtn = new Button("4");
		fourBtn.setOnAction(new fourHandler());
		fourBtn.setPrefWidth(45);
		fourBtn.setPrefHeight(20);
		fourBtn.getStyleClass().add("four");


		fiveBtn = new Button("5");
		fiveBtn.setOnAction(new fiveHandler());
		fiveBtn.setPrefWidth(45);
		fiveBtn.setPrefHeight(20);
		fiveBtn.getStyleClass().add("five");


		sixBtn = new Button("6");
		sixBtn.setOnAction(new sixHandler());
		sixBtn.setPrefWidth(45);
		sixBtn.setPrefHeight(20);
		sixBtn.getStyleClass().add("six");


		minusBtn = new Button("-");
		minusBtn.setPrefWidth(45);
		minusBtn.setPrefHeight(20);
		minusBtn.getStyleClass().add("minus");



		hbox7 = new HBox(17,fourBtn, fiveBtn, sixBtn, minusBtn);
		hbox7.setAlignment(Pos.CENTER);

		// Buttons on eigth row
		oneBtn = new Button("1");
		oneBtn.setOnAction(new oneHandler());
		oneBtn.setPrefWidth(45);
		oneBtn.setPrefHeight(20);
		oneBtn.getStyleClass().add("one");

		twoBtn = new Button("2");
		twoBtn.setOnAction(new twoHandler());
		twoBtn.setPrefWidth(45);
		twoBtn.setPrefHeight(20);
		twoBtn.getStyleClass().add("two");


		threeBtn = new Button("3");
		threeBtn.setOnAction(new threeHandler());
		threeBtn.setPrefWidth(45);
		threeBtn.setPrefHeight(20);
		threeBtn.getStyleClass().add("three");

		plusBtn = new Button("+");
		plusBtn.setPrefWidth(45);
		plusBtn.setPrefHeight(20);
		plusBtn.getStyleClass().add("plus");

		hbox8 = new HBox(17,oneBtn, twoBtn, threeBtn, plusBtn);
		hbox8.setAlignment(Pos.CENTER);

		// Buttons on ninth row
		zeroBtn = new Button("0");
		zeroBtn.setOnAction(new zeroHandler());
		zeroBtn.setPrefWidth(55);
		zeroBtn.setPrefHeight(20);
		zeroBtn.getStyleClass().add("zero");

		pointBtn = new Button(".");
		pointBtn.setOnAction(new pointHandler());
		pointBtn.setPrefWidth(55);
		pointBtn.setPrefHeight(20);
		pointBtn.getStyleClass().add("point");


		equalBtn = new Button("=");
		equalBtn.setPrefWidth(55);
		equalBtn.setPrefHeight(20);
		equalBtn.getStyleClass().add("equal");

		hbox9 = new HBox(32.5,zeroBtn, pointBtn, equalBtn);
		hbox9.setAlignment(Pos.CENTER);

		// Vbox containing all the Hboxes
		vbox = new VBox(11.2,hbox0, hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7, hbox8, hbox9);

		// Scene containing the vbox and it's content
		scene = new Scene(vbox, 300, 530);
		scene.getStylesheets().add("mystyles.css");

		primaryStage.setScene(scene);
		primaryStage.show();
	}


	class ClearHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){

			Utilities.clear(display);
		}
	}


	class SinHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){

			Utilities.getSin(display);
		}
	}

	class CosHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){

			Utilities.getCos(display);
		}
	}

	class TanHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){

			Utilities.getTan(display);
		}
	}

	class nineHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("9");
		}
	}


	class eightHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("8");
		}
	}


	class sevenHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("7");
		}
	}

	class sixHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("6");
		}
	}

	class fiveHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("5");
		}
	}


	class fourHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("4");
		}
	}

	class threeHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("3");
		}
	}

	class twoHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("2");
		}
	}

	class oneHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("1");
		}
	}

	class zeroHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText("0");
		}
	}
	class pointHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			display.appendText(".");
		}
	}










	class logHandeler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getLog(display);
		}
	}


	class sinInverseHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getSinInverse(display);
		} 
	}


	class cosInverseHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getCosInverse(display);
		} 
	}

	// class logInverseHandler implements EventHandler<ActionEvent>
	// {
	// 	@Override
	// 	public void handle(ActionEvent event){
	// 		Utilities.getLogInverse(display);
	// 	} 
	// }


	class tanInverseHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getTanInverse(display);
		} 
	}

	class squareRootHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getSquareRoot(display);
		} 
	}

	class squarehandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event){
			Utilities.getSquare(display);
		}
	}









}