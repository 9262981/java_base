import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int theNumber =  (int)(Math.random()*100+1);
		int guess = 0;
		System.out.println("Guess a number between 1 and 100 ! Type in next line !");
		guess = scan.nextInt();
		if(guess > theNumber)
			System.out.println("You entered " + guess + "this number is bigger than the Random number !");
		else if (guess<theNumber)
			System.out.println("You entered " + guess + "this number is smaller than the Random number !");
		else 
			System.out.println("You entered " + guess + "You guess right , You win the game !");
		guess = scan.nextInt();
		
		
	}

}
