package preliminaries;
public class Exam {
	
	private NumericalQuestion question1;
	private BooleanQuestion question2;
	private MultipleChoiceQuestion question3;
	private int totalMark;
	
	public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark) {
		
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.totalMark = totalMark;
		
	}
	/*
	 * In order to avoid breaking Demeter's law in the Marker class we replace the initial method lookAtQuestion1 with lookAtQuestion1Answer that returns the answer of the question 1
	 */
	public int lookAtQuestion1Answer() { 
		
		return question1.lookAtAnswer();
		
	}
	/*
	 * In order to avoid breaking Demeter's law in the Marker class we replace exam.lookAtQuestion1.lookAtAnswer with exam.lookAtQuestion1Answer

	 */
	public int lookAtQuestion1Mark(){ 
		return question1.readMark();
	}
	/*
	 * In order to avoid breaking Demeter's law in the Marker class we replace exam.lookAtQuestion1.giveMark(mark) with exam.giveQuestion1Mark(int mark)

	 */
	public void giveQuestion1Mark(int mark){ 
		question1.giveMark(mark);
	}
	
	public BooleanQuestion lookAtQuestion2() {
		
		return question2;
		
	}
	
	public MultipleChoiceQuestion lookAtQuestion3() {
		
		return question3;
		
	}
	
	public void writeTotalMark(int totalMark) {
		
		this.totalMark = totalMark;
				
	}
	
	public int readTotalMark() {
		
		return totalMark;
		
	}

}
