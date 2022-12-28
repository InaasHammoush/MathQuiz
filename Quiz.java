
public class Quiz {
	double result;
	int totalQuestions;
	public Quiz (int n) {
		this.totalQuestions = n;

		for (int i = 0; i < n; i++) {
			int currentProblem = (int)(4*Math.random());
			switch (currentProblem) {
			case 0:
				Problem aProblem = new AdditionProblem();
				calculateResult(aProblem.askAndCheck());
				break;
			case 1:
				Problem sProblem = new subtractionProblem();
				calculateResult(sProblem.askAndCheck());
				break;
			case 2:
				Problem mProblem = new multiplicationProblem();
				calculateResult(mProblem.askAndCheck());
				break;
			default:
				Problem dProblem = new divisionProblem();
				calculateResult(dProblem.askAndCheck());
				break;
			}
		}
	}


	public void calculateResult(String point) {
		if(point.equals("correct")) {
			result++;
		} else if (point.equals("correct2")) {
			result += 0.5;
		}
	}


	public void showResult() {
		System.out.println("Your score is " + result + " out of " + totalQuestions);
	}
}
