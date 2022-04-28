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
	public static void clear(TextArea textArea) {

		textArea.setText("");
		double result = 0;
	}


	// public static String del(String text){
	// 	StringBuilder builder = new StringBuilder();
	// 	for(int i = 0; i < text.length-1; i++){
	// 		builder.append(t[i]);

	// 	}
	// 	String joined = builder.toString();
	// 	return joined;
	// }

	public static void getSin (TextArea textArea) 
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.sin(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("sin"+"("+a+")"+ "\n"+ s_Result);
	}

	public static void getCos (TextArea textArea) 
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.cos(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("cos"+"("+a+")"+ "\n"+ s_Result);
	}

	public static void getTan (TextArea textArea) 
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.tan(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("tan"+"("+a+")"+ "\n"+ s_Result);
	}
	public static void getLog(TextArea textArea)
	{
		String s_Result = "";
	    double a = Double.parseDouble(textArea.getText());
		double result = Math.log10(a);
		s_Result = Double.toString(result);
		textArea.setText("log"+"("+a+")"+ "\n"+ s_Result);
	}

	public static void getSinInverse(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
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

	public static void getCosInverse(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			if (a>1)
				textArea.setText("cos-1("+a+")"+"\n"+"Math Error");
			else
			{
				double result = Math.acos(a);
				result = Math.toDegrees(result);
				s_Result = Double.toString(result);
				textArea.setText(s_Result);
			}

	}



	public static void getTanInverse(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			double result = Math.atan(a);
			result = Math.toDegrees(result);
			s_Result = Double.toString(result);
			textArea.setText("tan-1("+a+")"+"\n"+s_Result);
	}


	public static void getSquareRoot(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			double result = Math.sqrt(a);
			String f_result = Double.toString(result);
			textArea.setText(f_result);
	}


	public static void getSquare(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			double result = a * a;
			String f_result = Double.toString(result);
			textArea.setText(f_result);
	}


	public static void getPie(TextArea textArea)
	{
		String s_Result = "";
		double result = Math.PI;
			s_Result = Double.toString(result);
			textArea.setText(s_Result);
		
	}

	public static void getExponential(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			double result = Math.exp(a);
			String f_result = Double.toString(result);
			textArea.setText(f_result);
	}

	public static void getPercentage(TextArea textArea)
	{
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
			double result = a/100;
			String f_result = Double.toString(result);
			textArea.setText(f_result);
	}

	// public static void getDivide(TextArea textArea)
	// {
	// 	String s_Result = "";
	// 	double a =  Double.parseDouble(text.getText());
	// 		operator = 4;
	// 		text.setText("");
	// }






}