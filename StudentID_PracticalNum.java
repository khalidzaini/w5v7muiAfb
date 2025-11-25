
import java.util.Scanner;

public class StudentID_PracticalNum {
    public static void main(String[] args) {
        
        //Q1();
        //Q2();
        //Q3();
    }

    public static void Q1(){
        // Q1: print numbers given a format
        // To print the number with fixed space, use the \t
        // \t means tab characters
        System.out.println("1\t2\t3\t4\t5");
        System.out.println("6\t7\t8\t9\t10");
    }

    public static void Q2(){
        // Q2: Enter two integer,  add them up and multiply by 100
        // display summation and final result
        // create two variables to store the two numbers
        // create additional variable to store the summation
        // print summation
        // print summation * result
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter num1: ");
        int num1 =  input.nextInt();
        input.nextLine(); //clear buffer
        System.out.print("Enter num2: ");
        int num2 =  input.nextInt();
        int sum =  num1+num2;
        System.out.println(num1 + " + " +num2+" ="+sum);
        System.out.println("summation * 100 is " +(sum*100));
        input.close();
    }

    public static void Q3(){

        //Q3: Enter a password, upon matching display welcome otherwise wrong password
        //initialize a variable to store password
        //create another variable to store user input
        //using the IF selection to detected is password is correct or otherwise
        //print suitable message
        Scanner input = new Scanner(System.in);  
        String password="ITP2026";
        System.out.print("Enter the password: ");
        String userPassword= input.nextLine();
        if(userPassword.equals(password)){
            System.out.println("Welcome! you are logged in");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
