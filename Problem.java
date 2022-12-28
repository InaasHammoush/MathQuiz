
public class Problem {
	protected int x, y, correctAnswer;
	protected String question;

	public Problem () {
		x = (int)(100*Math.random());
		y = (int)(100*Math.random());
	}

	public String askAndCheck(){
		System.out.println(this.question);
		int answer = TextIO.getInt();
		if (answer == correctAnswer) {
			System.out.println("Correct!");
			return "correct";
		} else {
			System.out.println("Incorrect! Please try again.");
			answer = TextIO.getInt();
			if (answer == correctAnswer) {
				System.out.println("Correct!");
				return "correct2";
			} else {
				System.out.println("Incorrect! The correct answer is: " + this.correctAnswer);
				return "incorrect!";
			}
		}
	}
}
