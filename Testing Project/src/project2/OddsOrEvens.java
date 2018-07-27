package project2;

import java.util.*;

public class OddsOrEvens {
	
	public static Scanner input = new Scanner(System.in);
	public static String username;
	
	public static void main(String[] args) {
		
		String choice = introduction();
		String result = playTheGame();
		results(choice, result);
		
	}
		
	public static String introduction() {
		
		String userChoice;
		String computerChoice;
		
		System.out.println("Let's play a game called \"Odds and Evens\"");
		System.out.print("What is your name?");
		
		username = input.next();
		
		System.out.print("Hi "+username+", which do you choose? (O)dds or (E)vens?");
		
		userChoice = input.next();
		
		if(userChoice.toLowerCase().startsWith("o")) {
			
			computerChoice = "evens";
			System.out.println(username + " has picked odds! The computer will be "+computerChoice);
			
		}else {
			
			computerChoice = "odds";
			System.out.println(username + " has picked evens! The computer will be "+computerChoice);
		
		}
		
		System.out.println("------------------------------\n");
		
		return userChoice;
	}
	
	public static String playTheGame() {
		
		int userFingers;
		Random rand = new Random();
		int computer = rand.nextInt(6);
		int sum;
		boolean oddOrEven;
		String sumResult;
		
		System.out.print("How many “fingers” do you put out?");
		
		userFingers = input.nextInt();
		
		System.out.println("The computer plays "+ computer +" \"fingers\".");
		System.out.println("------------------------------\n");
		
		sum = userFingers + computer;
		
		System.out.println(userFingers + " + " + computer + " = " + sum);
		
		oddOrEven = sum % 2 != 0;
		
		if(oddOrEven) {
			System.out.println(sum + " is ...odd");
			sumResult = "o";
		}else {
			System.out.println(sum + " is ...even");
			sumResult = "e";
		}
		
		return sumResult;
	}
	
	public static void results(String choice, String result) {
		
		if(choice.toLowerCase().startsWith(result.toLowerCase()))
			System.out.println("That means "+ username +" wins! :)");
		else
			System.out.println("Sorry you lose :(");
	}
	
}
