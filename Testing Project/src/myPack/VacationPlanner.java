package myPack;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VacationPlanner {
	public static Scanner input = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("#.###");
	
	public static void main(String[] args) {
		greeting();
		travelTimeAndBudget();
		timeDifference();
		countryArea();
	}
	
	public static void greeting() {
		String personName;
		String cityName;
		
		System.out.println("Welcome to Vacation Planner");
		System.out.print("What is your name?");
		
		personName = input.nextLine();
		
		System.out.print("Nice to meet you "+personName+", where are you travelling to?");
		
		cityName = input.nextLine();
		
		System.out.println("Great! "+cityName+" sounds like a great trip\n***********\n");
	}
	
	public static void travelTimeAndBudget() {
		int travelTime;
		int spendMoney;
		String countrySymbol;
		double conversionRate;
		double convertedMoney;
		
		System.out.print("How many days are you going to spend travelling?");
		
		travelTime = input.nextInt();
		
		System.out.print("How much money, in USD, are you planning to spend on your trip?");
		
		spendMoney = input.nextInt();
		
		System.out.print("What is the three letter currency symbol for your travel destination?");
		
		countrySymbol = input.next();
		
		System.out.print("How many "+countrySymbol+" are there in 1 USD?");
		
		conversionRate = input.nextDouble();
		convertedMoney = conversionRate * spendMoney;
		
		System.out.println("\nIf you are travelling for "+travelTime+" days that is the same as "+(24*travelTime)+" hours or "+(1440*travelTime)+" minutes");
		System.out.println("If you are goin to spend $"+spendMoney+" USD that means per day you can spend up to $"+df.format((double)spendMoney/travelTime)+" USD" );
		System.out.println("Your total budget in "+ countrySymbol +" is "+ convertedMoney+" "+countrySymbol+", which per day is "+df.format(convertedMoney/travelTime)+" "+countrySymbol+"\n***********\n");
		
	}
	
	public static void timeDifference() {
		
		int timeDifference;
		
		System.out.print("What is the time difference, in hours, between your home and your destination?");
		
		timeDifference = input.nextInt();
		
		System.out.println("That means that when it is midnight at home it will be "+(24+timeDifference)%24+":00 in your travel destination\nand when it is noon at home it will be "+(12+timeDifference)+":00\n***********\n");
		
		
	}
	
	public static void countryArea() {
		
		int squareArea;
		
		System.out.print("What is the square area of your destination in km^2?");
		
		squareArea = input.nextInt();
		
		System.out.println("In miles^2 that is "+df.format((double)squareArea*0.3861));
		
	}
}
