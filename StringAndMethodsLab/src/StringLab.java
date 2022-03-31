
public class StringLab {

	public static void main(String[] args) {
		/* T est capitalize
		capitalize("test");
		capitalize("");
		capitalize("l");
		*/
		
		/* Test wheresWaldo
		wheresWaldo("test");
		wheresWaldo("waldowaldo");
		wheresWaldo("gggggggwaldo");
		*/
		
		/* Test firstThingsFirst
		firstThingsFirst("A", "C");
		firstThingsFirst("a", "A");
		firstThingsFirst("I don't know the alphabet", "and my name is Tim");
		firstThingsFirst("A", "A");
		*/
		
		/* Test reverse
		reverse("forward");
		reverse("");
		reverse("sdrawkcab");
		reverse("1");
		*/
		
		/* Test soLong
		soLong("bean", "pea");
		soLong("tart", "trap");
		*/
		
		/* Test afterMath
		afterMath("She aced the mathematics test!");
		afterMath("My floor mat is so keen!");
		afterMath("");
		afterMath("Math wooooo! mAtH");
		*/
		
		/* Test letterize
		letterize("Java");
		letterize("");
		letterize("one letter at a time");
		*/
	}
	
	public static void capitalize(String word) {
		if(word.length() < 2) {
			if(word.length() == 0) {
				return;
			}
			System.out.println(word.toUpperCase());
			return;
		}
		
		System.out.print(word.substring(0,1).toUpperCase());
		System.out.println(word.substring(1).toLowerCase());
	}
	
	public static void wheresWaldo(String phrase) {
		int location = phrase.toLowerCase().indexOf("waldo");
		if(location == -1) {
			System.out.println("Error: Waldo not found");
			return;
		}
		
		System.out.println(location);
	}
	
	public static void firstThingsFirst(String a, String b) {
		if(a.compareTo(b) < 0) {
			System.out.println(a + " " + b);
			return;
		}
		
		System.out.println(b + " " + a);
	}
	
	public static void reverse(String s) {
		for(int i = s.length() - 1; i > -1; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	}
	
	public static void soLong(String a, String b) {
		if(a.length() == b.length()) {
			System.out.println(a + " " + b);
			return;
		}
		else if(a.length() > b.length()) {
			System.out.println(a);
			return;
		}
		else {
			System.out.println(b);
		}
	}
	
	public static void afterMath(String phrase) {
		int index = (phrase.toLowerCase()).indexOf("math");
		
		if(index == -1) {
			System.out.println("dud");
			return;
		}
		
		System.out.println(phrase.substring(index));
	}
	
	public static void letterize(String word) {
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println();
	}

}
