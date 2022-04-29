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

public class Utilities 

{

	int operator = 0;

	double a = 0;
	double b = 0;

	double result = 0;

	//For mortgage
	double p = 0;
	double r = 0;
	int t = 0;

	DecimalFormat df = new DecimalFormat("0.00");

	public void clear(TextArea textArea) {

		textArea.setText("");
		result = 0;
	}

	public void delete(TextArea textArea) {
		String s = textArea.getText();
		textArea.setText("");
		for(int i=0;i<s.length()-1;i++) {
			textArea.setText(textArea.getText()+s.charAt(i));
		}
	}

	public void getSin (TextArea textArea) 
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.sin(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("sin"+"("+a+")"+ "\n"+ s_Result);
	}

	public void getCos (TextArea textArea) 
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.cos(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("cos"+"("+a+")"+ "\n"+ s_Result);
	}

	public void getTan (TextArea textArea) 
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
		result = Math.tan(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("tan"+"("+a+")"+ "\n"+ s_Result);
	}


	public void getLog(TextArea textArea)
	{
		String s_Result = "";
	    a = Double.parseDouble(textArea.getText());
		result = Math.log10(a);
		s_Result = Double.toString(result);
		textArea.setText("log"+"("+a+")"+ "\n"+ s_Result);
	}

	public void getSinInverse(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
			if (a>1)
				textArea.setText("Math Error");
			else 
			{
				double result = Math.asin(a);
				result = Math.toDegrees(result);
				s_Result = Double.toString(result);
				textArea.setText("sin-1("+a+")"+"\n"+s_Result);
			}

	}

	public void getCosInverse(TextArea textArea)
	{
		String s_Result = "";
		a = Double.parseDouble(textArea.getText());
			if (a>1)
				textArea.setText("cos-1("+a+")"+"\n"+"Math Error");
			else
			{
				result = Math.acos(a);
				result = Math.toDegrees(result);
				s_Result = Double.toString(result);
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