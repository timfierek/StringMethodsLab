
public class StringLab {

	public static void main(String[] args) {
		// Test capitalize
		System.out.println("**Test capitalize**");
		System.out.print("capitalize(\"all lowercase\"): ");
		capitalize("all lowercase");
		System.out.print("\ncapitalize(\" \"): ");
		capitalize("");
		System.out.print("\ncapitalize(\"l\"): "); 
		capitalize("l");
		System.out.println("\n");
		
		// Test wheresWaldo
		System.out.println("**Test wheresWaldo**");
		System.out.print("wheresWaldo(\"test\"): ");
		wheresWaldo("test");
		System.out.print("\nwheresWaldo(\"waldowaldo\"): ");
		wheresWaldo("waldowaldo");
		System.out.print("\nwheresWaldo(\"gggggggwaldo\"): ");
		wheresWaldo("gggggggwaldo");
		System.out.println("\n");
		
		// Test firstThingsFirst
		System.out.println("**Test firstThingsFirst**");
		System.out.print("firstThingsFirst(\"A\", \"C\"): ");
		firstThingsFirst("A", "C");
		System.out.print("\nfirstThingsFirst(\"a\", \"A\"): ");
		firstThingsFirst("a", "A");
		System.out.print("\nfirstThingsFirst(\"I don't know the alphabet\", \"and my name is Tim\"): ");
		firstThingsFirst("I don't know the alphabet", "and my name is Tim");
		System.out.print("\nfirstThingsFirst(\"A\", \"A\"): ");
		firstThingsFirst("A", "A");
		System.out.println("\n");
		
		// Test reverse
		System.out.println("**Test reverse**");
		System.out.print("reverse(\"forward\"): ");
		reverse("forward");
		System.out.print("\nreverse(\"\"): ");
		reverse("");
		System.out.print("\nreverse(\"sdrawkcab\"): ");
		reverse("sdrawkcab");
		System.out.print("\nreverse(\"1\"): ");
		reverse("1");
		System.out.println("\n");
		
		// Test soLong
		System.out.println("**Test soLong**");
		System.out.print("soLong(\"bean\", \"pea\"): ");
		soLong("bean", "pea");
		System.out.print("\nsoLong(\"tart\", \"trap\"): ");
		soLong("tart", "trap");
		System.out.println("\n");
		
		// Test afterMath
		System.out.println("**Test afterMath**");
		System.out.print("afterMath(\"She aced the mathematics test!\"): ");
		afterMath("She aced the mathematics test!");
		System.out.print("\nafterMath(\"My floor mat is so keen!\"): ");
		afterMath("My floor mat is so keen!");
		System.out.print("\nafterMath(\"\"): ");
		afterMath("");
		System.out.print("\nafterMath(\"Math wooooo! mAtH\"): ");
		afterMath("Math wooooo! mAtH");
		System.out.println("\n");

		// Test letterize
		System.out.println("**Test letterize**");
		System.out.println("letterize(\"Java\"): ");
		letterize("Java");
		System.out.println("letterize(\"\"): ");
		letterize("");
		System.out.println("letterize(\"one letter at a time\"): ");
		letterize("one letter at a time");
		System.out.println("");
		
		// Test camelCase
		System.out.println("**Test camelCase**");
		System.out.print("camelCase(\"Camel case lol\"): ");
		camelCase("camel case lol");
		System.out.print("\ncamelCase(\"\"): ");
		camelCase("");
		System.out.print("\ncamelCase(\"alreadyInCamelCase\"): ");
		camelCase("alreadyInCamelCase");
		System.out.println("");

	}
	
	public static void capitalize(String word) {
		if(word.length() < 2) {
			if(word.length() == 0) {
				return;
			}
			System.out.print(word.toUpperCase());
			return;
		}
		
		System.out.print(word.substring(0,1).toUpperCase());
		System.out.print(word.substring(1).toLowerCase());
	}
	
	public static void wheresWaldo(String phrase) {
		int location = phrase.toLowerCase().indexOf("waldo");
		if(location == -1) {
			System.out.print("Error: Waldo not found");
			return;
		}
		
		System.out.print(location);
	}
	
	public static void firstThingsFirst(String a, String b) {
		if(a.compareTo(b) < 0) {
			System.out.print(a + " " + b);
			return;
		}
		
		System.out.print(b + " " + a);
	}
	
	public static void reverse(String s) {
		for(int i = s.length() - 1; i > -1; i--) {
			System.out.print(s.charAt(i));
		}
		
	}
	
	public static void soLong(String a, String b) {
		if(a.length() == b.length()) {
			System.out.print(a + " " + b);
			return;
		}
		else if(a.length() > b.length()) {
			System.out.print(a);
			return;
		}
		else {
			System.out.print(b);
		}
	}
	
	public static void afterMath(String phrase) {
		int index = (phrase.toLowerCase()).indexOf("math");
		
		if(index == -1) {
			System.out.print("dud");
			return;
		}
		
		System.out.print(phrase.substring(index));
	}
	
	public static void letterize(String word) {
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static void camelCase(String word) {
		String[] separateWords = word.split(" ");
		String result = separateWords[0];
		
		for(int i = 1; i < separateWords.length; i++) {
			String cur = separateWords[i];
			if(cur.length() == 1) {
				result += cur.toUpperCase();
			}
			else {
				result += (cur.substring(0,1).toUpperCase());
				result += (cur.substring(1).toLowerCase());
			}
		}
		System.out.print(result);
	}

}
