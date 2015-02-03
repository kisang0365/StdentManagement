package information;

public class MajorGrade implements Grade{

	@Override
	public String GetGradeAlpabet(int score) {
		if(score<0 || score>100) return "error";
		else if(score<60) return "F";
		else if(score<70) return "D";
		else if(score<80) return "C";
		else if(score<90) return "B";
		else if(score<95) return "A"; 
		else return "S";
	}
	
}
