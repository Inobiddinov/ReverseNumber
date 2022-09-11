import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num, rem, rev=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = scan.nextInt();
     while (num!=0){
            rem =num%10;
            rev =(rev*10) + rem;
            num = num/10;
        }
        System.out.println("Reverse of the Number is: " +rev);
    }}



