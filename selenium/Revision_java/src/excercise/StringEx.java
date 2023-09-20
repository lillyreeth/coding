package excercise;

public class StringEx {

	public static void main(String[] args)
	{
		
		String txt="Hello world";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println("The length of the txt string is: " + txt.toUpperCase());
		System.out.println("The length of the txt string is: " + txt.toLowerCase());
		
		String find = "Please locate where occurs!";
		System.out.println(find.indexOf("loca"));
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		String special = "We are the so-called \"Vikings\" from the north.";
		
		System.out.println(special);
		
		String txt1 = "It\'s alright.";
		System.out.println(txt1);
		
		
		

	}

}
