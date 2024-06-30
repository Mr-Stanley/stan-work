import java.util.Scanner;
	public class Threedigits {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a three digit integer: ");
	int number = input.nextInt();

	int number1 = number / 100;
	int number2 = number % 10;

	if( number1 == number2 ){
	System.out.print("This is a parindrome."); 

	}else{
	System.out.print("This is not a parindrome."); 
     }
   }
}

