import java.util.Map;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
	
		int result = catchThis("1", "2", "3");
		System.out.println(result);
		System.out.println( catchThis("3", "blah", "2") );
		System.out.println( catchThis("seven", "2", "125") );
		System.out.println( catchThis("1000", "2", "125") );
	
	
	
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		int inputTemp = scnr.nextInt();
		System.out.print("What type of temperature is this? (Enter F or C): ");
		String inputUnit = scnr.next();
		
		int outputTemp = convertTemp(inputTemp, inputUnit);
		System.out.println("That converts to " + outputTemp + ".");

		scnr.close();
	

		
/*	main method for --> pickOutfit --------
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Event type (casual, semi-formal, or formal): ");
		String eventType = scnr.next();
		System.out.print("Temperature (Fahrenheit): ");
		int temperature = scnr.nextInt();
		
		String outfit = pickOutfit(eventType, temperature);
		System.out.println("You should wear " + outfit + ".");

		scnr.close();		
		
*/	
	}

	
	public static boolean takeItAway(Map<String, String> map, String key) {
		boolean keyExists = map.containsKey(key);
		if (keyExists) {
			map.remove(key);
		}
		
		return keyExists;
	}	
	
	
	
	
	public static int catchThis(String a, String b, String c) {
		try {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			int numC = Integer.parseInt(c);
			
			return numA + numB + numC;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	
	
	public static int convertTemp(int inputTemp, String inputUnit) {
		if (inputUnit.equals("F")) { // convert F to C
			return (inputTemp - 32) * 5 / 9;
		} else { // convert to C to F
			return inputTemp * 9 / 5 + 32;
		}
	}
	
	
	public static String pickOutfit(String eventType, int temperature) {
		String base;
		String outer;
		if ("casual".equals(eventType)) {
			base = "something comfy";
		} else if ("semi-formal".equals(eventType)) {
			base = "a polo";
		} else {
			base = "a suit";
		}
		if (temperature < 54) {
			outer = "a coat";
		} else if (temperature <= 70) {
			outer = "a jacket";
		} else {
			outer = "no jacket";
		}
		return base + " and " + outer;
	}
	
	
	
	
	
	
	
	
	
}
