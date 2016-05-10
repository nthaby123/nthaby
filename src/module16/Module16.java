package module16;
import java.util.Scanner;
//import topicsix.TestTopicSix;
/**
*
@author MAdskilss190
*/
public class Module16 {

// Private variables
private String name;
private int year;
private String gender;
public static int currentY;

//   constructors
public Module16(String name, int year, String gender, int currentY) {

//Parameterized constructor
this.name = name;
this.year = year;
this.gender = gender;
this.currentY= currentY;
}

//overload constructors
public Module16(String name, int year, String gender) {

//Parameterized constructor
this.name = name;
this.year = year;
this.gender = gender;

}

// default constructors 
public Module16() {

}

// Public getters for private variables
public String getName() {
return name;
}

public int getYear() {
return year;
}

public String getGender() {
return gender;
}

public int getCurretY() {
return currentY;
} //end get 

//setters for private variables
public void setName(String name) {
this.name = name;
}

public void setYear(int year) {
this.year = year;
}

public void setGender(String gender) {
this.gender = gender;
} //end set

// methods with arguments and return values; including overloaded methods
// static keyword  to methods
public static int calAge(int year) {
int age = currentY - year;
age = age + 1;//Determine the effect upon object references and primitive values when they are passed into methods that change the values
return age;

}

//overload method
public static int calAge(int year, int currentY) {
int age = currentY - year;
return age;

}
}	    

class TestModule16 {

//static variables   
static String name="";
static String gender="";
public static  int age=0; 

public static void main(String[] args) {  


//create new scanner class
Scanner sc = new Scanner(System.in); 

//gather name
System.out.println ("Enter your name" + name); 
name = sc.nextLine ();

//gather gender
System.out.println("Enter your gender" + gender); 
gender = sc.nextLine();

//gather Current year
System.out.println( "current year is :" ); 
int currentY = Integer.parseInt(sc.nextLine());


System.out.println("Enter The year you were born: " ); //gather year
int year = Integer.parseInt(sc.nextLine());
System.out.println();


//This object creation would call the  constructor
Module16 Six = new Module16( name,year,gender,currentY);

System.out.println("Hello"+" "+ name +"\n"+ "gender is" +" " + gender +"\n"+ "Current year" + " "+ currentY + "\n"+"year"
+" " + year +"\n"+ "your age is :"+ Six.calAge(year));
System.out.println();


//if statement
if (age <= 18) {
System.out.println("\n\n*******************Congratulation********************\n");    
System.out.println("you can now vote" );

}
else     {

System.out.println("Try Again next year");
}

}

}  
