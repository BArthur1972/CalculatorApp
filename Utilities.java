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

	public static void getSin (TextArea textArea) {
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.sin(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("sin"+"("+a+")"+ "\n"+ s_Result);
	}

	public static void getCos (TextArea textArea) {
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.cos(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("cos"+"("+a+")"+ "\n"+ s_Result);
	}

	public static void getTan (TextArea textArea) {
		String s_Result = "";
		double a = Double.parseDouble(textArea.getText());
		double result = Math.tan(Math.toRadians(a));
		s_Result = Double.toString(result);
		textArea.setText("tan"+"("+a+")"+ "\n"+ s_Result);
	}
}