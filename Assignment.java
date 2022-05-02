import java.util.Scanner;

public class Assignment {
	
	public int sum(int a, int b) {
		
		int sum = a+b;
		return sum;
	}
		
	public int sub(int a, int b) {
			
			int sub = a - b;
			return sub;
	}
	
	public int mult(int a, int b) {
		
		int mult = a * b;
		return mult;
	}
	
	public int div(int a, int b) {
		
		int div = a / b;
		return div;
	}
	
    public int mod(int a, int b) {
		
		int mod = a % b;
		return mod;
	}
    
    public double area(double rad) {
    	double area = Math.PI * rad * rad;
    	return area;
    }
    
    public double perimeter(double rad) {
    	double area = 2 * Math.PI * rad;
    	return area;
    }

    public double average(double sum,double totalNumbers) {
    	double average  = (sum / totalNumbers);
    	return average;
    }
    
    public double areaRect(double length,double width) {
    	double area  = length * width;
    	return area;
    }
    
    public double periRect(double length,double width) {
    	double area  = 2 * (length + width);
    	return area;
    }
    
    public int getLargest(int[] a, int total){  
    	int temp;  
    	for (int i = 0; i < total; i++){  
    	   for (int j = i + 1; j < total; j++){  
    	        if (a[i] > a[j]) {  
    	        temp = a[i];  
    	        a[i] = a[j];  
    	        a[j] = temp;  
    	       }  
    	      }  
    	     }  
    	     return a[total-1];  
    	}  
    
    
	public static void main(String[] args) {
		int userInput;
		Assignment c = new Assignment();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Press 1 and Enter for calculator.");
		System.out.println("Press 2 and Enter to get area and perimeter of circle.");
		System.out.println("Press 3 and Enter to get an average of numbers.");
		System.out.println("Press 4 and Enter to get area and perimeter of rectangle.");
		System.out.println("Press 5 and Enter to swap two numbers.");
		System.out.println("Press 6 and Enter to find binary of decimal.");
		System.out.println("Press 7 and Enter to compare two numbers.");
		System.out.println("Press 8 and Enter to reverse a string.");
		System.out.println("Press 9 and Enter to print odd numbers between any numbers.");
		System.out.println("Press 10 and Enter to check if number is odd or even.");
		System.out.println("Press 11 and Enter to lowercase a String.");
		System.out.println("Press 12 and Enter to concatinate two strings.");
		System.out.println("Press 13 and Enter to get character at given index in the string.");
		System.out.println("Press 14 and Enter to check if two strings are same or not.");
		System.out.println("Press 15 and Enter to get length of a string.");
		System.out.println("Press 16 and Enter to change characters of the string.");
		System.out.println("Press 17 and Enter to uppercase a String.");
		System.out.println("Press 18 and Enter to check if number is positive or negative.");
		System.out.println("Press 19 and Enter to check largest number from entered numbers.");
		System.out.println("Press 20 and Enter to get first 10 natural numbers.");
		System.out.println("Press 21 and Enter to get multiplication table of any table.");
		
		System.out.println("Please enter your choice and hit Enter, or 0 to Exit : ");
		userInput = sc.nextInt();	
		switch(userInput) {
		case 1 : 
			System.out.println("Perfect!. You want to Calculate numbers.");
			System.out.println("For that please enter your first number : ");
			int arg1 = sc.nextInt();
			System.out.println("Enter second number : ");
			int arg2 = sc.nextInt();
			System.out.println("Addition is = " + c.sum(arg1, arg2));
			System.out.println("Substraction is = " + c.sub(arg1, arg2));
			System.out.println("Multiplication is = " + c.mult(arg1, arg2));
			System.out.println("Division is = " + c.div(arg1, arg2));
			System.out.println("Modulo is = " + c.div(arg1, arg2));
			break;
			
		case 2 :
			System.out.println("Perfect!. You want to get area and permeter of circle.");
			System.out.println("For that please enter radius of the circle : ");
			double radius = sc.nextInt();
			System.out.println("Area is = " + c.area(radius));
			System.out.println("Peremeter is = " + c.perimeter(radius));
			break;
			
		case 3 :
			System.out.println("Perfect!. You want to get average of numbers");
			System.out.println("For howmany numbers you want to get average : ");
			int averageUserInput = sc.nextInt();
			int numbers [] = new int[averageUserInput];
			int sum = 0;
			for(int i= 1;i <= averageUserInput ;i++) {
				System.out.println("Enter " + i + " number :");
				numbers[i-1] = sc.nextInt();
				sum += numbers[i-1];
			}
			System.out.println("Average is = " + c.average(sum, averageUserInput));
			break;
			
		case 4 :
			System.out.println("Well!. You want to get area and perimeter of rectangle.");
			System.out.println("Enter length of a rectangle : ");
			double length = sc.nextDouble();
			System.out.println("Enter width of a rectangle :  ");
			double width = sc.nextDouble();
			System.out.println("Area is = " + c.areaRect(length, width));
			System.out.println("Peremeter is = " + c.periRect(length, width));
			break;
		
		case 5 : 
			System.out.println("Perfect!. You want to swipe 2 numbers.");
			System.out.println("Enter num1 value: ");
			int num1 = sc.nextInt();
			System.out.println("Enter num2 value: ");
			int num2 = sc.nextInt();
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("After swapping, num1 is now : " + num1 + ", num2 is now : " + num2);
			break;
		case 6 :
			
			System.out.println("Perfect!. You want to get decimal to binary.");
			System.out.println("Enter decimal value: ");
			int decimal = sc.nextInt();
			System.out.println("Binary value of " + decimal +" is : " + Integer.toBinaryString(decimal));
			break;
		case 7 : 
			System.out.println("Perfect!. You want to compare 2 numbers.");
			System.out.println("Enter num1 value: ");
			int number1 = sc.nextInt();
			System.out.println("Enter num2 value: ");
			int number2 = sc.nextInt();
			
			if(number1 == number2) {
				System.out.println("Both numbers are same!!.");
			}
			else {
				System.out.println("Numbers are not same.");
			}
			break;
		case 8 :
			System.out.println("Perfect!. You want to reverse a string.");
			System.out.println("Enter string value: ");
			String str = sc.next();
			String reverse = "";
			for(int i = str.length()-1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);
			}
			System.out.println("Reverse string of "+ str + " is : " + reverse);
			break;
		case 9 : 
			System.out.println("Perfect!. You want to get odd numbers between 2 numbers.");
			System.out.println("Enter first value: ");
			int firstNumber = sc.nextInt();
			System.out.println("Enter last value: ");
			int lastNumber = sc.nextInt();
			
			for(int i = firstNumber; i<= lastNumber ; i++) {
				if(i % 2 !=0) {
					System.out.println(i);
				}
				else {
					continue;
				}
			}
			break;
		
		case 10 :
			System.out.println("Perfect!. You want to know if number is even or no.");
			System.out.println("Enter number : ");
			int number = sc.nextInt();
			if(number % 2 !=0) {
				System.out.println("Number is Odd..");
			}
			else {
				System.out.println("Number is Even..");
			}
			break;
			
		case 11 :
			System.out.println("Perfect!. You want to lowercase a string.");
			System.out.println("Enter string value: ");
			String string = sc.next();
			System.out.println("lowercase string of "+ string + " is : " + string.toLowerCase());
			break;
			
		case 12 :
			System.out.println("Perfect!. You want to concate two strings.");
			System.out.println("Enter first string value: ");
			String firstString = sc.next();
			System.out.println("Enter second string value: ");
			String secondString = sc.next();
			System.out.println("New string is : " + firstString.concat(secondString));
			break;
			
		case 13 :
			System.out.println("Perfect!. You want to find a word within an index.");
			System.out.println("Enter string value: ");
			String stringInd = sc.next();
			System.out.println("Enter index value: ");
			int index = sc.nextInt();
			System.out.println("Character at index "+ index + " of string " + stringInd+ " is:  " + stringInd.charAt(index));
			break;
			
		case 14 :
			System.out.println("Perfect!. You want to compare two strings.");
			System.out.println("Enter first string value: ");
			String firstStringToCompare = sc.next();
			System.out.println("Enter second string value: ");
			String secondStringToCompare = sc.next();
			
			if(firstStringToCompare.equals(secondStringToCompare)) {
				System.out.println("Both strings are same");
			}else {
				System.out.println("Both strings are not the same");
			}
			break;
			
		case 15 :
			System.out.println("Perfect!. You want to get length of a string.");
			System.out.println("Enter string value: ");
			String stringForLength = sc.next();
			System.out.println("Length of the " + stringForLength + " is : " + stringForLength.length());
			break;
			
		case 16 : 
			System.out.println("Perfect!. You want to change charactors of a string.");
			System.out.println("Enter string value: ");
			String stringForCharChange = sc.next();
			char characterToChange;
			int count = 0;
			do {
				System.out.println("Enter character value you want to change : ");
			     characterToChange = sc.next().charAt(0);
				if(stringForCharChange.contains(""+characterToChange)) {
					System.out.println("Enter character value you want to change " + characterToChange + " with : ");
					count = 1;
				}
				else {
					System.out.println("String doesn't contain entered character");
				}
			}while(count == 0);
			
			
			char characterNewVal = sc.next().charAt(0);
			System.out.println("New string after character change is : " + stringForCharChange.replace(characterToChange, characterNewVal));
			break;
			
		case 17 :
			System.out.println("Perfect!. You want to uppercase a string.");
			System.out.println("Enter string value: ");
			String stringToUpperCase = sc.next();
			System.out.println("Upercase string of "+ stringToUpperCase + " is : " + stringToUpperCase.toUpperCase());
			break;
			
		case 18 :
			System.out.println("Perfect!. You want to know if number is positive or negative.");
			System.out.println("Enter number : ");
			int numberCheck = sc.nextInt();
			if(numberCheck >= 0) {
				System.out.println("Number is Positive..");
			}
			else {
				System.out.println("Number is Negative..");
			}
			break;
			
		case 19 :
			System.out.println("Perfect!. You want to know Largest number from entered numbers.");
			System.out.println("For howmany numbers you want to get greatest number from : ");
			int numberUserInput = sc.nextInt();
			int[] numbersToCheck = new int[numberUserInput];
			for(int i= 0;i < numberUserInput ;i++) {
				System.out.println("Enter " + i + " number :");
				numbersToCheck[i] = sc.nextInt();
			}
			System.out.println("Largest: " + c.getLargest(numbersToCheck,numberUserInput));
			break;
			
		case 20 :
			System.out.println ("The first 10 natural numbers are: ");
			for(int i=1; i<=10; i++) {
				System.out.println (i);
			}
			break;
		
		case 21 :
			System.out.println("Perfect!. You want to get multiplication table for any number.");
			System.out.println("Enter number : ");
			int numberForMult = sc.nextInt();
			for(int i=1; i<=10; i++) {
				System.out.println(numberForMult + " * " + i + " = "+(numberForMult * i));
			}
			break;
			
		default:
			if(userInput == 0) {
				break;
			}else {
				System.out.println("Sorry!!. Invalid number..");
			}
			
		}
		
		}while(userInput > 0);
		
	}

}
