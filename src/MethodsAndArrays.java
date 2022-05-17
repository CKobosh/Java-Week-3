import java.lang.reflect.Array;

public class MethodsAndArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Number Array
		
		int[] array = new int[6]; 
		array [0] = 1; 
		array[1] = 5; 
		array[2] = 2; 
		array[3] = 8; 
		array[4] = -3; 
		array[5] = 6; 
		
	// or: 	int[] array = {1, 5, 2, 8, 13, 6}; 
		
		
		System.out.println(array[0]);
		System.out.println(array[array.length-1]);
	//	System.out.println(array[6]);
	//	System.out.println(array[-1]);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(array[i]);
		}	
	for (int number : array) {
		System.out.println(number);
		}
	double sum = 0; 
	for (int number : array) { 
		sum += number; 
	} System.out.println(sum);
	
	double average = sum / array.length; 
	System.out.println(average);
	
	for (int number : array) {
		if (number % 2 != 0) {
			System.out.println(number);
		}
	}
	//New Name Array
	
	String[] names = new String[4]; 
	names[0] = "Sam"; 
	names[1] = "Sally"; 
	names[2] = "Thomas"; 
	names[3] = "Robert"; 
	//String[] names = ("Sam", "Sally", "Thomas", "Rober"); 
	
	int letters = 0; 
	for (String name : names) {
		letters += name.length();
	} System.out.println("Names Length");
	int[] nameLengths = extractStringLength(names); 
	for(int number : nameLengths) {
System.out.println(number);	
	}
	
greet("Casey"); 
String greeting = greeting("Scout"); 
System.out.println(greeting); 

System.out.println(isStringLongerThanNumber("Hello", 3)); 

System.out.println(isStringInArray(names, "Sam"));

System.out.println(findSmallestNumber(array)); 

double[] grades  = {99.0, 85.0, 90.5}; 
System.out.println(findAverage(grades));

System.out.println(sumEvenLetters(names));

System.out.println(isPalendrome("tomorrow"));

	}	
public static String greeting (String name) {
	return ("Hi " + name + "!"); 
}
public static void greet(String name) {
	System.out.println("Hello " + name + "!");
}	
public static boolean isStringLongerThanNumber(String string, int number) {
	return (string.length() > number);  	
}

public static boolean isStringInArray(String[] array, String string) {
for (String str : array) {
	if (str.equals(string)) {
		return true; 
	}
} return false; 
}

public static int findSmallestNumber(int[] numbers) {
int smallest = numbers[0]; 
for (int number : numbers) {
 if (number < smallest) {
	 smallest = number; 
 }
} return smallest; 
}

public static double findAverage(double[] grades) {
	double sum = 0; 
	for (double grade : grades) {
      sum += grade ;
      } return sum / grades.length; 
}
public static int[] extractStringLength (String[] strings) {
	int[] results = new int[strings.length];
	for (int i = 0; i < strings.length; i++) {
     results[i] = strings[i].length(); 
	}   return results; 
}
public static boolean sumEvenLetters (String[] a) {
	int evenLetters = 0; 
	int oddLetters = 0; 
	for (String b : a) {
	if (b.length() % 2 == 0)	{
	  evenLetters += b.length(); 
	} else {
		oddLetters += b.length(); 
	}	  
} return evenLetters > oddLetters; 
}
public static boolean isPalendrome (String string) {
	for (int i = 0; i < string.length() / 2; i++) {
	   if (string.charAt(i) != string.charAt(string.length() - i - 1)) { 
		    return false; 
	   }
	}  return true; 
}




}

