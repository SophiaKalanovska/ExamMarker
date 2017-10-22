package preliminaries;
public class Marker {

	/*
	 * In order to respect Demeter's law we have made a few changes :
	 *  replace the initial method lookAtQuestion1 with lookAtQuestion1Answer 
	 *  replace exam.lookAtQuestion1.lookAtAnswer with exam.lookAtQuestion1Answer
	 *  replace exam.lookAtQuestion1.giveMark(mark) with exam.giveQuestion1Mark(int mark)
	 */
	public int markAttempt(Exam examAttempt, Exam markScheme) {
		
		if ( examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer()) {
			
			examAttempt.giveQuestion1Mark(markScheme.lookAtQuestion1Mark());
			
		} else if ( examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer() - 1 
				 || examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer() + 1  ) {
			
			examAttempt.giveQuestion1Mark(markScheme.lookAtQuestion1Mark() - 1);
			
		} else if ( examAttempt.lookAtQuestion1Answer() >= markScheme.lookAtQuestion1Answer() - 5 
				 && examAttempt.lookAtQuestion1Answer() <= markScheme.lookAtQuestion1Answer() + 5  ) {
		
			examAttempt.giveQuestion1Mark(1);
		
		} else {
			
			examAttempt.giveQuestion1Mark(0);
			
		}
		
		if ( examAttempt.lookAtQuestion2().lookAtAnswer() == markScheme.lookAtQuestion2().lookAtAnswer() ) {
			
			examAttempt.lookAtQuestion2().giveMark(markScheme.lookAtQuestion2().readMark());
			
		} else {
			
			examAttempt.lookAtQuestion2().giveMark(0);
			
		}
		
		if ( examAttempt.lookAtQuestion3().lookAtOption1Answer() == markScheme.lookAtQuestion3().lookAtOption1Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
	
		}
		
	    if ( examAttempt.lookAtQuestion3().lookAtOption2Answer() == markScheme.lookAtQuestion3().lookAtOption2Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
			
		}
		
	    if ( examAttempt.lookAtQuestion3().lookAtOption3Answer() == markScheme.lookAtQuestion3().lookAtOption3Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
			
		}
	    
	    int totalMark = examAttempt.lookAtQuestion1Mark() + examAttempt.lookAtQuestion2().readMark() + examAttempt.lookAtQuestion3().readMark();
	    		
	    examAttempt.writeTotalMark(totalMark);
	    
	    return totalMark;
	    
	}
	
	public double convertMarksToClassification(int mark, int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary) {
		
		if ( mark >= firstBoundary ) {
			
			return 1.1;
			
		} else if ( mark >= upperSecondBoundary ) {
			
			return 2.1;
			
		} else if ( mark >= lowerSecondBoundary ) {
			
			return 2.2;
			
		} else {
			
			return 0.0;
			
		}
	
	}
	
}
