import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num, rem, rev=0; //creating the integers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: "); //Asking from the user to input value which he want to reverse.
        num = scan.nextInt();
     while (num!=0){ //while num is not equal to 0 this code will work
            rem =num%10; //Modulus for taking last digit from the given input
            rev =(rev*10) + rem; //This is for getting the reverse number in the middle.
            num = num/10; // This is how we can make last input to the back
        }
        System.out.println("Reverse of the Number is: " +rev); //Final output reversed version of input
    }}



