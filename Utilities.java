// basic libraries necessary in the implementation 
// are imported and used, including javaFx

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


	public void getTanInverse(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.atan(a);
		result = Math.toDegrees(result);
		s_Result = Double.toString(result);
		textArea.setText("tan-1("+a+")"+"\n"+s_Result);
	}


	public void getSquareRoot(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.sqrt(a);
		String f_result = Double.toString(result);
		textArea.setText(f_result);
	}


	public void getSquare(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = a * a;
		String f_result = Double.toString(result);
		textArea.setText(f_result);
	}


	public void getPie(TextArea textArea)
	{
		String s_Result = "";
		result = Math.PI;
		s_Result = Double.toString(result);
		textArea.setText(s_Result);	
	}

	public void getExponential(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.exp(a);
		String f_result = Double.toString(result);
		textArea.setText(f_result);
	}

	public void getPercentage(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = a/100;
		String f_result = Double.toString(result);
		textArea.setText(f_result);
	}

	public void addPlus(TextArea textArea)
	{
		a = Double.parseDouble(textArea.getText());
		operator = 1;
		textArea.setText("");	
	}

	public void storeAnswer(TextArea textArea)
	{	
		textArea.setText(Double.toString(result));	
	}

	public void addMinus(TextArea textArea)
	{
		if (textArea.getText().isEmpty())
			{
				textArea.appendText("-");
			}
			else
			{
				a = Double.parseDouble(textArea.getText());
				operator = 2;
				textArea.setText("");
			}	
	}


	public void addDivide(TextArea textArea)
	{
		a = Double.parseDouble(textArea.getText());
		operator = 4;
		textArea.setText("");	
	}

	public void addMultiply(TextArea textArea)
	{
		a = Double.parseDouble(textArea.getText());
		operator = 3;
		textArea.setText("");
		System.out.println("operator is " + operator);
	}

	public void equals(TextArea textArea) {

		b = Double.parseDouble(textArea.getText());
		System.out.println("Equal button pressed " + "a = " + a + ", b = " + b);
			
		// Setting up BigDecimals to handle high precision numbers
		String first = Double.toString(a);
		String second = Double.toString(b);
		BigDecimal biggerNum1 = new BigDecimal(first);
		BigDecimal biggerNum2 = new BigDecimal(second);

		handleOperation(textArea, b, biggerNum1, biggerNum2);
	}

	public void handleOperation(TextArea textArea, double b, BigDecimal reallyBig, BigDecimal reallyBig1) {

		String T_result = "";
		BigInteger intValue;
		BigDecimal decValue;

		switch(operator)
		{
		case 1:
			BigDecimal result1 = reallyBig.add(reallyBig1);
			intValue = result1.toBigInteger();
			T_result = intValue.toString();
			if (T_result.length() > 9)
			{
				T_result = result1.toString();
				textArea.setText(reallyBig +" + "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			}
			else
			{
				T_result = result1.toString();
				textArea.setText(reallyBig +" + "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			}
			break;
		
		case 2:
			BigDecimal result2 = reallyBig.subtract(reallyBig1);
			intValue = result2.toBigInteger();
			T_result = intValue.toString();
			if (T_result.length() > 9)
			{
				T_result = result2.toString();
				textArea.setText(reallyBig +" - "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			}
			else
			{
				T_result = result2.toString();
				textArea.setText(reallyBig +" - "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);

			}
			break;
	
		case 3:
			BigDecimal result3 = reallyBig.multiply(reallyBig1);
			intValue = result3.toBigInteger();
			T_result = intValue.toString();
			if (T_result.length() > 9)
			{
				T_result = result3.toString();
				textArea.setText(reallyBig +" * "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			}
			else
			{
				T_result = result3.toString();
				textArea.setText(reallyBig +" * "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			}
			break;
			
		case 4:
			result += a / b;

			Double f_result = result;
			String s = Double.toString(f_result);
			if (s.equals("Infinity"))
			{
				T_result = "Error";
				textArea.setText(T_result);
				result = Double.parseDouble(T_result);
			}
			else	
				T_result = Double.toString(result);
				textArea.setText(reallyBig +" / "+reallyBig1 +" = "+ T_result);
				result = Double.parseDouble(T_result);
			
		default:
			result = 0;
		}
	}


	public void addPrincipal(TextArea textArea) {
		p = Double.parseDouble(textArea.getText());
		textArea.setText("Principal:"+p);
	}

	public void addRate(TextArea textArea) {
		r = Double.parseDouble(textArea.getText());
		textArea.setText("Principal:"+p+", Rate:"+r+"%");
	}

	public void addTime(TextArea textArea) {
		t = Integer.parseInt(textArea.getText());
		textArea.setText("Principal:"+p+", Rate:"+r+"%"+", Payments:"+t);
	}

	public void getMortgage(TextArea textArea) {
		textArea.setText("");

		r = (r/100)/12;
		String format_r = df.format(r);
		t = t *12;

		Double pay = (p*r)/(1-Math.pow(1+r,-t));
		String format_pay = df.format(pay);

		textArea.setText(" ");

		textArea.setText("Principal:" + p + "\nRate:" + format_r
		+ "\nNo_payment:" + t + "\n" +"Mortgage:" + format_pay);
	}


}
