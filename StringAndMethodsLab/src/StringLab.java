
/**
 * StringLab contains only a main method which tests all methods in StringMethods.java.
 * 
 * @author Tim Fierek
 *
 */
public class StringLab {

	public static void main(String[] args) {
		// Test capitalize
		System.out.println("**Test capitalize**");
		System.out.print("capitalize(\"all lowercase\"): " + StringMethods.capitalize("all lowercase"));
		System.out.print("\ncapitalize(\" \"): " + StringMethods.capitalize(""));
		System.out.print("\ncapitalize(\"l\"): " + StringMethods.capitalize("l")); 
		System.out.println("\n");
		
		// Test wheresWaldo
		System.out.println("**Test wheresWaldo**");
		System.out.print("wheresWaldo(\"test\"): " + StringMethods.wheresWaldo("test"));
		System.out.print("\nwheresWaldo(\"waldowaldo\"): " + StringMethods.wheresWaldo("waldowaldo"));
		System.out.print("\nwheresWaldo(\"gggggggwaldo\"): " + 		StringMethods.wheresWaldo("gggggggwaldo"));
		System.out.println("\n");
		
		// Test firstThingsFirst
		System.out.println("**Test firstThingsFirst**");
		System.out.print("firstThingsFirst(\"A\", \"C\"): " + StringMethods.firstThingsFirst("A", "C"));
		System.out.print("\nfirstThingsFirst(\"a\", \"A\"): " + StringMethods.firstThingsFirst("a", "A"));
		System.out.print("\nfirstThingsFirst(\"I don't know the alphabet\", \"and my name is Tim\"): "
						+ StringMethods.firstThingsFirst("I don't know the alphabet", "and my name is Tim"));
		System.out.print("\nfirstThingsFirst(\"A\", \"A\"): " + StringMethods.firstThingsFirst("A", "A"));
		System.out.println("\n");
		
		// Test reverse
		System.out.println("**Test reverse**");
		System.out.print("reverse(\"forward\"): " + StringMethods.reverse("forward"));
		System.out.print("\nreverse(\"\"): " + StringMethods.reverse(""));
		System.out.print("\nreverse(\"sdrawkcab\"): " + StringMethods.reverse("sdrawkcab"));
		System.out.print("\nreverse(\"1\"): " + StringMethods.reverse("1"));
		System.out.println("\n");
		
		// Test soLong
		System.out.println("**Test soLong**");
		System.out.print("soLong(\"bean\", \"pea\"): ");
		StringMethods.soLong("bean", "pea");
		System.out.print("\nsoLong(\"tart\", \"trap\"): ");
		StringMethods.soLong("tart", "trap");
		System.out.println("\n");
		
		// Test afterMath
		System.out.println("**Test afterMath**");
		System.out.print("afterMath(\"She aced the mathematics test!\"): "
						+ StringMethods.afterMath("She aced the mathematics test!"));
		System.out.print("\nafterMath(\"My floor mat is so keen!\"): "
						+ StringMethods.afterMath("My floor mat is so keen!"));
		System.out.print("\nafterMath(\"\"): " + StringMethods.afterMath(""));
		System.out.print("\nafterMath(\"Math wooooo! mAtH\"): " 
						+ StringMethods.afterMath("Math wooooo! mAtH"));
		System.out.println("\n");

		// Test letterize
		System.out.println("**Test letterize**");
		System.out.println("letterize(\"Java\"): ");
		StringMethods.letterize("Java");
		System.out.println("letterize(\"\"): ");
		StringMethods.letterize("");
		System.out.println("letterize(\"one letter at a time\"): ");
		StringMethods.letterize("one letter at a time");
		System.out.println("");
		
		// Test camelCase
		System.out.println("**Test camelCase**");
		System.out.print("camelCase(\"Camel case lol\"): ");
		StringMethods.camelCase("camel case lol");
		System.out.print("\ncamelCase(\"\"): ");
		StringMethods.camelCase("");
		System.out.print("\ncamelCase(\"alreadyInCamelCase\"): ");
		StringMethods.camelCase("alreadyInCamelCase");
		System.out.println("");

	}

}
