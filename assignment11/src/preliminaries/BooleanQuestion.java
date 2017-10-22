package preliminaries;
public class BooleanQuestion extends Question {

	private boolean answer;
	private int mark;
	
	public BooleanQuestion(boolean answer, int mark) {
		
		super(mark);
		this.answer = answer;
		
	}
	
	public boolean lookAtAnswer() {
		
		return answer;
		
	}
	

	
}
