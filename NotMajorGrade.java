package information;

public class NotMajorGrade implements Grade{

	@Override
	public String GetGradeAlpabet(int score) {
		if(score<0 || score>100) return "error";
		else if(score<55) return "F";
		else if(score<70) return "D";
		else if(score<80) return "C";
		else if(score<90) return "B";
		else return "A";
	}
	

}
