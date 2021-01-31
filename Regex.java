import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Regex {

	public void firstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		if(result == true)
			System.out.println("First Name is Valid...");
		else
			System.out.println("First Name is not valid...");
	}

	public static void main(String[] args) {
		Regex regex = new Regex();
		regex.firstName();
	}

}
