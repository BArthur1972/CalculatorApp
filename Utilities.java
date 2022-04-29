
// basic libraries necessary in the implementation 

// are imported and used, including javaFx

// this file sevs as the drive force of the app

// app function here affect the way the app behaves

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

import java.math.*;
import java.text.DecimalFormat;

// main class that serves as 

// control house, to drive

// the calculators functionality

public class Utilities 
	

{

	int operator = 0;

	double a = 0;

	double b = 0;

	double result = 0;

//For mortgage calculation functionality 

// P reprsents the principal,

// Principal is the money that you originally agreed to pay back. 

// Starts the mortgage calculation process

	double p = 0;


	
// R reprsents the rate

// The interest rate is the amount a lender charges a borrower 

//and is a percentage of the principal—the amount loaned. 

//The interest rate on a loan is typically noted on an annual basis 

//known as the annual percentage rate (APR). 
	double r = 0;
	
	
// T reprsents the time

//time take for the mortage loan to be paid

// has a massive contribution to the toatl outcome 

// of the loan with intrest
	int t = 0;
	
	
// for decimal functionality 

	DecimalFormat df = new DecimalFormat("0.00");
	
	
// function for the clear button

// replaces text on the text area with an empty string

// indirectly clearing everything on the text area
	
	public void clear(TextArea textArea) 
	{
		
//gets text from text area
		textArea.setText("");
		
		result = 0;
	}
	
	//function to delete the items on textview
	//removes last item form the textview
	// indirectly deletes last item

	public void delete(TextArea textArea) 
		// this is a void funtion
	{
		// current context in textarea
		
		String s = textArea.getText();
		
		textArea.setText("");
		
		//reconstructing string to skip the last item
		
		// relays the new string
		
		for(int i=0;i<s.length()-1;i++) 
		{
			//for loop to go over items in the extracted string in the text view
			
			textArea.setText(textArea.getText()+s.charAt(i));


		}
	}



	
	
// evaluates the sin operation
	public void getSin (TextArea textArea) 
		// doesn not return anything
	{
		String s_Result = "";
		
		// current context in textarea
		a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		
		//evaluates the sin function operation and stores it in
		// the variable result
		
		result = Math.sin(Math.toRadians(a));
		
		s_Result = Double.toString(result);
		// presents the results in the text area
		
		textArea.setText("sin"+"("+a+")"+ "\n"+ s_Result);


	}
	


// evaluates the cos operation
	
	public void getCos (TextArea textArea) 
		// doesn not return anything
	{
		String s_Result = "";
		// current context in textarea
		
		a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		//performs the cosine function 
		
		result = Math.cos(Math.toRadians(a));
		s_Result = Double.toString(result);
		
		// returns the result to the user on the textArea
		textArea.setText("cos"+"("+a+")"+ "\n"+ s_Result);



	}



	
	// evaluates the tan operation

	public void getTan (TextArea textArea) 
		// doesn not return anything
	{
		String s_Result = "";
		// current context in textarea
		
		a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		//performs the tangent function 
		
		result = Math.tan(Math.toRadians(a));
		
		// converts result to string
		s_Result = Double.toString(result);
		
		// returns the result to the user on the textArea
		
		textArea.setText("tan"+"("+a+")"+ "\n"+ s_Result);


	}


	
// evaluates the log operation


	public void getLog(TextArea textArea)
		// doesn not return anything
	{
		String s_Result = "";
		// current context in textarea
		
	    a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		//performs the logarithim function 
		
		result = Math.log10(a);
		// converts result to string
		
		s_Result = Double.toString(result);
		
		// returns the result to the user on the textArea
		
		textArea.setText("log"+"("+a+")"+ "\n"+ s_Result);


	}


	
	// evaluates the sinInverse operation

	public void getSinInverse(TextArea textArea)
		// doesn not return anything
	{
		String s_Result = "";
		// current context in textarea
		
		a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		
		//in other to cath the error from sinInverse
		
			if (a>1)
				textArea.setText("Math Error");
		
		
			else 
				//perfomes the sinInverse operation
			{
				double result = Math.asin(a);
				
				result = Math.toDegrees(result);
				//converts result to degerees
				
				s_Result = Double.toString(result);
				//converts the result to a string 
				
				// returns the result to the user on the textArea
				textArea.setText("sin-1("+a+")"+"\n"+s_Result);


			}

	}


	
	// evaluates the cosInverse operation

	public void getCosInverse(TextArea textArea)
		// doesn not return anything
	{
		String s_Result = "";
		// current context in textarea
		
		a = Double.parseDouble(textArea.getText());
		
		// converts double to radians for cosine operation
		//to be perfomed on
		
		
		//in other to cath the error from sinInverse
			if (a>1)
				textArea.setText("cos-1("+a+")"+"\n"+"Math Error");
			else
				//perfomes the coseInverse operation
			{
				result = Math.acos(a);
				
				//converts result to degerees
				result = Math.toDegrees(result);
				
				//converts the result to a string
				s_Result = Double.toString(result);
				
				// returns the result to the user on the textArea
				textArea.setText(s_Result);


			}

	}



// evaluates the TanInverse operation

	public void getTanInverse(TextArea textArea)

	// doesn not return anything
	{
		String s_Result = "";

		// current context in textarea


		a = Double.parseDouble(textArea.getText());

		// converts double to radians for  operation

		//to be perfomed on


		result = Math.atan(a);

		//performs the coseInverse operation

		result = Math.toDegrees(result);

		//converts result to degerees

		//converts the result to a string

		s_Result = Double.toString(result);

		// returns the result to the user on the textArea

		textArea.setText("tan-1("+a+")"+"\n"+s_Result);


	}



// evaluates the TanInverse operation

	public void getSquareRoot(TextArea textArea)

	// doesn not return anything

	{

		String s_Result = "";

		// current context in textarea


		a = Double.parseDouble(textArea.getText());

		//performs the square root operation

		result = Math.sqrt(a);

		//performs the coseInverse operation

		//converts result to degerees

		//converts the result to a string


		String f_result = Double.toString(result);
		//converts the result to a string


		// returns the result to the user on the textArea
		textArea.setText(f_result);


	}



// evaluates the square operation

	public void getSquare(TextArea textArea)

	// doesn not return anything

	{
		String s_Result = "";

		// current context in textarea

		a = Double.parseDouble(textArea.getText());
		//performs the square operation


		result = a * a;

		//performs the square operation

		//converts result to degerees

		//converts the result to a string


		String f_result = Double.toString(result);
		//converts the result to a string

		// returns the result to the user on the textArea

		textArea.setText(f_result);


	}



// evaluates the pie button 

	public void getPie(TextArea textArea)

	// doesn not return anything


	{
		String s_Result = "";

		// current context in textarea


		result = Math.PI;

		//get pi value

		//obtains it from math funtion

		//converts the result to a string

		s_Result = Double.toString(result);
		//converts the result to a string

		// returns the result to the user on the textArea

		textArea.setText(s_Result);	


	}


//evaluates  the exponential button

	public void getExponential(TextArea textArea)

	// doesn not return anything

	{

		String s_Result = "";

		// current context in textarea


		a = Double.parseDouble(textArea.getText());


		result = Math.exp(a);

		//get exponential value

		//obtains it from math funtion

		//converts the result to a string


		String f_result = Double.toString(result);

		//converts the result to a string

		// returns the result to the user on the textArea


		textArea.setText(f_result);


	}


//evaluates the percentage button


	public void getPercentage(TextArea textArea)

	// doesn not return anything

	{


		String s_Result = "";

		// current context in textarea


		a = Double.parseDouble(textArea.getText());

		// converts string to be operated on 


		result = a/100;

		//ezpresses value in function

		//obtains it from math funtion

		//converts the result to a string

		String f_result = Double.toString(result);

		//converts the result to a string

		// returns the result to the user on the textArea


		textArea.setText(f_result);


	}



	
//evaluates the addition function

	public void addPlus(TextArea textArea)
	// does not return anuthing
	{
		//converts content in text area to be operated on
		a = Double.parseDouble(textArea.getText());
		//changes it to a double for operatiom
		//represents switch value
		operator = 1;
		//sets result in text arae
		textArea.setText("");	


	}


// stores previous answer

	//vital in further addition process and other

	// vital in multiple arithemtic funtion continuatlity 

	public void storeAnswer(TextArea textArea)

	//does not return anything

	//a void funtion

	{	
	//converts context in arae to be operated

		//on by the funtion

		textArea.setText(Double.toString(result));

		//changes it to a double for operation

		/// sets result in text area


	}



	//adds minus funtion

	public void addMinus(TextArea textArea)


	//vital in further addition process and other

	// vital in multiple arithemtic funtion continuatlity 

	{

		if (textArea.getText().isEmpty())

			//adds the minus sign


			//if it is empty


			{

				textArea.appendText("-");

			}


			else

			{

				//parse the content in text area

				// to a double

				a = Double.parseDouble(textArea.getText());

				operator = 2;

				//represnts switch operation

				//sects text after perofoming operation

				textArea.setText("");


			}	


	}


//adds minus funtion

	public void addDivide(TextArea textArea)

		//vital in further addition process and other

	// vital in multiple arithemtic funtion continuatlity 



	{

		//adds the divide sign


			//if it is empty

		//parse the content in text area

				// to a double


		a = Double.parseDouble(textArea.getText());

		//represnts switch operation

				//sects text after perofoming operation



		operator = 4;


		//sects text after performing operation


		// Setting text Area empty
		textArea.setText("");	


	}



	// This method updates the operator to multiplication 

	public void addMultiply(TextArea textArea)
	{
		
		// Update a
		a = Double.parseDouble(textArea.getText());

		// Update operator to multiplication
		operator = 3;

		// Update the operator to empty

		textArea.setText("");

		// Print operator to the terminal
		System.out.println("operator is " + operator);
	}




	// Equals method to obtain results


	public void equals(TextArea textArea) {

		// Updates b

		b = Double.parseDouble(textArea.getText());

		// Prints a and b
		System.out.println("Equal button pressed " + "a = " + a + ", b = " + b);
			

		// Setting up BigDecimals to handle high precision numbers
		String first = Double.toString(a);
		String second = Double.toString(b);


		// Creating Big decimal objects
		

		// bigNum 2
		BigDecimal biggerNum1 = new BigDecimal(first);

		// bigNum 2
		BigDecimal biggerNum2 = new BigDecimal(second);

		// Handles which operation gets called
		handleOperation(textArea, b, biggerNum1, biggerNum2);


	}

	// Does the calculations

	public void handleOperation(

		// Text area that displays results		
		TextArea textArea,

		// Second value
		double b,

		// first number
		BigDecimal reallyBig,

		// second number
		BigDecimal reallyBig1
		) 
	{


		// T_result for total
		String T_result = "";


		BigInteger intValue;
		BigDecimal decValue;

		switch(operator)

		{
		// First case for addition
			
		case 1:

			// adds the two numbers
			BigDecimal result1 = reallyBig.add(reallyBig1);



			intValue = result1.toBigInteger();


			// Converts tresult to string

			T_result = intValue.toString();

			// Check if result is less than 9

			if (T_result.length() > 9)

			{
				// Convert result to string

				T_result = result1.toString();

				// Set text area to equation

				textArea.setText(reallyBig +" + "+reallyBig1 +" = "+ T_result);

				// Convert result to double

				result = Double.parseDouble(T_result);

			}

			else

			{

				// Convert result to string
				T_result = result1.toString();

				// Set Text Area to equation 

				textArea.setText(reallyBig +" + "+reallyBig1 +" = "+ T_result);

				// Convert result to double
				result = Double.parseDouble(T_result);


			}

			break;
		
		// Case  2 for subtraction

		case 2:

			// Subtracting numbers

			BigDecimal result2 = reallyBig.subtract(reallyBig1);

			// Converting result to Big Integer
			intValue = result2.toBigInteger();

			// Converting result to String
			T_result = intValue.toString();


			// Check if length result is less than 9
			if (T_result.length() > 9)

			{
				// Converts result to String
				T_result = result2.toString();

				// Sets textArea to equation
				textArea.setText(reallyBig +" - "+reallyBig1 +" = "+ T_result);

				// Converts results to double
				result = Double.parseDouble(T_result);

			}

			else

			{
				// Converts result to String

				T_result = result2.toString();

				// Sets text area to Equation

				textArea.setText(reallyBig +" - "+reallyBig1 +" = "+ T_result);

				// Converts result to double

				result = Double.parseDouble(T_result);

			}
			

			// Breaks the program
			break;
		

		// Case 4 for multiplication
		case 3:

			// Multiplying the two numbers

			BigDecimal result3 = reallyBig.multiply(reallyBig1);


			// Adding intValue

			intValue = result3.toBigInteger();

			// Convert the result to string

			T_result = intValue.toString();

			// Checks if length of result is greater than 9


			if (T_result.length() > 9)

			{

				// Converts result to string
				T_result = result3.toString();

				// Sets text area to equation
				textArea.setText(reallyBig +" * "+reallyBig1 +" = "+ T_result);

				// Converts result to double
				result = Double.parseDouble(T_result);
			}


			else

			{

				// Converts result3 to string

				T_result = result3.toString();

				// Sets text area to equation

				textArea.setText(reallyBig +" * "+reallyBig1 +" = "+ T_result);

				// updates result

				result = Double.parseDouble(T_result);

			}

			break;
			
		// Case for for division

		case 4:

			// Divides a and b
			result += a / b;


			// Sets f_result to result

			Double f_result = result;

			// Converts f_result to string

			String s = Double.toString(f_result);

			// Checks of string s is enfinity

			if (s.equals("Infinity"))

			{
				// Assigns result to error

				T_result = "Error";

				// Sets textArea to result

				textArea.setText(T_result);

				// Converts result to Double
				result = Double.parseDouble(T_result);

			}

			else

				// Converts result to string
				T_result = Double.toString(result);

				// Sets text area to equation
				textArea.setText(reallyBig +" / "+reallyBig1 +" = "+ T_result);

				// Converts result to double
				result = Double.parseDouble(T_result);
		

		// Sets default case

		default:

			// Sets result to 0
			result = 0;

		}

	}


	// Extracts the principal from the text area
	public void addPrincipal(TextArea textArea) 

	{
		// Updates p
		p = Double.parseDouble(textArea.getText());

		// Sets text area to value of p
		textArea.setText("Principal:"+p);

	}

	// Extracts the rate from the textArea
	public void addRate(TextArea textArea) 

	{
		// Updates r
		r = Double.parseDouble(textArea.getText());

		// Sets text area to value of p and r		
		textArea.setText("Principal:"+p+", Rate:"+r+"%");

	}

	// Extracts the time from the text Area 
	public void addTime(TextArea textArea) 

	{

		// Updates t
		t = Integer.parseInt(textArea.getText());

		// Sets text area to value of the principal, rate and payments
		textArea.setText("Principal:"+p+", Rate:"+r+"%"+", Payments:"+t);

	}

	// Extract the mortgage from the text area

	public void getMortgage(TextArea textArea) 

	{
		// Sets text area to null
		textArea.setText("");

		// divide r by 100 and then by 12
		r = (r/100)/12;

		// format it in decimal format
		String format_r = df.format(r);

		// Find time in months
		t = t *12;

		// Calculates the mortgage

		Double pay = (p*r)/(1-Math.pow(1+r,-t));

		// Formats the result in decimal form

		String format_pay = df.format(pay);

		// Sets text area to null

		textArea.setText(" ");


		// Displays mortgage on text area
		textArea.setText(
			"Principal:" + p + 
			"\nRate:" + format_r +
			"\nNo_payment:" + t +
			"\n" +"Mortgage:" + format_pay
		);
	}


	// TESTING CODE /
	// End class

}
