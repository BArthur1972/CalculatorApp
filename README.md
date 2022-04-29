# CalculatorApp

## Introduction
This is a java-fx based interactive program that will take that presents a screen to the user to enter values whether basic calculations or trigonomeic problems. We have provided buttons for each number, operation, and trigonometric identities.

When the program is initialized, it will pop up a window also known as a stage in this context thereby allowing interaction with the user. The program will store these inputs and pass them through the methods we have in place. After the inputs have passed through methods, the results would be displayed in a text box on the screen to the user as the output.

## How to Run
- To run the program, first download all the files and upload them to an IDE of your choice.
- Next, you need to go to the terminal or shell, then cd into the directory of where the project files are stored.
- Input and run the following code snippet which will compile the code:
```java
javac --module-path /<user path>/javafx-sdk-18/lib --add-modules javafx.controls,javafx.fxml CalculatorApp.java
```
- Input and run the following code snippet which will launch the calculator:
```java
java --module-path /<user path>/javafx-sdk-18/lib --add-modules javafx.controls,javafx.fxml CalculatorApp
```



## File Description
### 1. mystyles.css
- This is where the display/outlook code for the program is stored and executed from. 
- It also contains formatting codes to edit how the graphic user interface is presented to the user.
- Below we have few out of many classes that were created:

i. ```button``` - this is a class assigned to all buttons in the GUI that dictates the size and weight.

ii. ```multiply``` - this is a class assigned to dictate the backgroud color.

iii. ```sin```- this is a class assigned to dictate the padding.

iv. ```closebracket```- this is a class that dictates the border width.

### 2. CalculatorApp.java

In this file you will find all the helper fuctions for this program. They are listed below:    
i. ```main()```
    - This launches the whole program.

ii. ```start()```
    - This is where all the buttons are initialized and text file is prompted.


### 3. Utilities.java
In this file you will find the code which worked as a back hand for the program running. Also, in this file you will find all the additional helper fuctions for this program. They are listed below:  
i. ```clear()```
 - This clears out numbers or calculations visible on the screen. 
 
ii. ```delete()```
 - This allows for a user to delete certain numbers or signs that might have been clicked on in error.
 
iii. ```getSin()```
- This allows for calculations that involve getting the sine value of numbers to be accounted for.

iv. ```getLog()```
- This allows for calculations that involve getting the log value of numbers to be accounted for.

v. ```getCosInverse()```
- This allows for calculations that involve getting the inverse cos value of numbers to be accounted for.

