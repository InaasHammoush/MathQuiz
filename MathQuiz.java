
public class MathQuiz {
	public static void main(String[] args) {
		System.out.println("Hello and welcome! What's your name?");
		String userName = TextIO.getln();
		System.out.println("Hello, " + userName + "!");
		while(true) {
			System.out.println("How many math questions would you like to get?");
			int n = TextIO.getInt();
			Quiz quiz = new Quiz(n);
			quiz.showResult();
			System.out.println("Would you like to take another quiz? y/n");
			boolean goAgain = TextIO.getBoolean();
			if (!goAgain) {
				System.out.println("Thank you for your time!");
				break;
			}
		}
	}
}
