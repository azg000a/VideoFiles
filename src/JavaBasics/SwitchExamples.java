package JavaBasics;

public class SwitchExamples {

	public static void main(String[] args) {

		String role = "moderator";

		switch (role) {

		case "admin":
			System.out.println("You are an admin");
			break;

		case "moderator":
			System.out.println("You are a moderator");
			break;

		default:
			System.out.println("You are a guest");

		}

	}

}
