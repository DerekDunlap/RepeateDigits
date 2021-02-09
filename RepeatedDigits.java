//Name: Derek Dunlap
//Date: 2/5/21
//A Java program that counts the occurrences of each number that was entered by the user and displays the number of times each number appears.
//Program terminates if zero or negative number is entered by the user.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;//Imports Scanner
public class RepeatedDigits{
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//Creates an instace of the Scanner class called input
		System.out.print("Enter a number: ");//Displays a message to instruct the user to input a number.
		int number=input.nextInt();//Assigns the value input by the user to the variable number of type int.
		System.out.println();//Added for readability.
		
		//If-Else statement: Test whether the number entered by the user is greater than 0. If not then, terminates program.
		if(!(number>0)){
			terminateProgram(number);//Passes the users number to the terminateProgram() method. 
			input.close();//Closes scanner.
		}else {
			//While-loop that continues to execute while condition is met.
			while(number>0) {
				//Calls displayOccurrence() method and passes number into it.
				displayOccurrence(number);
				System.out.println();//Added for readability.
				System.out.println();//Added for readability.
				System.out.print("Enter a number: ");//Displays a message to instruct the user to input a number.
				number=input.nextInt();//Assigns the value entered by user to number variable.
				//If-Else statement: Test whether the number entered by the user is greater than 0. If not then, terminates program.
				if(!(number>0)){
					terminateProgram(number);//Passes the users number to the terminateProgram() method.
					input.close();//Closes Scanner.
				}
			}
		}
	}
	//Method to terminate program.
	public static void terminateProgram(int n) {
			System.exit(n);//Exits program.
	}
	//Method to display the occurrence of each number.
	public static void displayOccurrence(int n) {
		int length=(int)(Math.log10(n)+1);//Determines the length of the number by use of Math.log10.
		int []arr=new int[length];//Creates an array of length size.
		int digit=0;//Creates digit and assigns default value of 0.
		int i=1;//Creates i and assigns default value of 1.
		while(n>0) {
			digit=n%10;//Grabs the last digit of a given number.
			n=n/10;//Divides n by 10 and reassigns n with the new value for next iteration.
			arr[length-i]=digit;//Assigns digit to current array index.
			i++;//increments i by 1.
		}
		int result=0;//Creates result and assigns default value of 0.
		int j=0;//Creates j and assigns default value of 0;
		System.out.println("Digits:\t\t0 1 2 3 4 5 6 7 8 9");//Displays following message on console for user.
		System.out.print("Occurrences:\t");//Displays following message on console for user.
		//While-loop: continues to execute while condition is met.
		while(j<10){
			//For-loop: that iterates for length of array.
			for(int k=0;k<length;k++) {
				//Test whether j has the same value that is stored in current array index.
				if(j==arr[k]) {
					result++;//increments results by 1 each time statement is true.
				}
			}
			System.out.print(result+" ");//Displays following message on consle for user.
			result=0;//Resets result to value of 0.
		j++;//Increments j by 1 after each iteration.
	}
	}
}



