package information;

import java.util.ArrayList;

public class StudentManager{
	
	//싱글톤 생성
	private static StudentManager instance = new StudentManager();
	//Student arrayList
	private ArrayList<Student> student = new ArrayList<Student>();
	//arrayList에 add함수
	public void add(Student student){
		this.student.add(student);
	}
	
	//toString Overiding
	public String toString() {
		String str= "";
		for(int i=0; i<student.size(); i++){
			str += student.get(i) +"\n";
		}
		return str;
	}

	
	
	
	
	//싱글톤 받아오기.
	public static StudentManager getInstance(){
		if (instance == null)
			instance = new StudentManager();

		return instance;
	}
		
}
