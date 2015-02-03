package information;

public class Student {
			
		private int studentId;
		private String studentName;
		private String major;
		private int mathScore;
		private int englishScore;
		
		
		Student(String studentName, int studentId, String major, int mathScore, int englishScore){
			this.studentName = studentName;
			this.studentId = studentId;
			this.major = major;
			this.mathScore = mathScore;
			this.englishScore = englishScore;
		}
		
		public String addGrade(String className, int Score){
			Grade grade;
			if(this.major.equals(className)) {
				grade = new MajorGrade();
			}
			else{
				grade = new NotMajorGrade();
			}
			return grade.GetGradeAlpabet(Score);
			
		}
			
		@Override
		public String toString() {
			return "|\t이름 : "+ studentName + " |\tId : " + studentId + " |\tMajor : " + major 
					+" |  \t수학점수 : " +mathScore + " |\t수학학점 : " + addGrade("수학", mathScore) + " |\t영어점수 : " + englishScore
					+ " |\t영어학점 : " + addGrade("영어", englishScore);   
		}
		

}
