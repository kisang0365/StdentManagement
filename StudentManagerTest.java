package information;

public class StudentManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager manager = new StudentManager();
		
		Student student = new Student("이승기", 141213, "수학", 95, 20);
		manager.add(new Student("김수현", 141518, "영어", 90, 100));
		manager.add(new Student("주원", 141230, "수학", 76, 60));
		manager.add(new Student("김우빈", 141255, "수학", 85, 89));
		manager.add(new Student("이민호", 141590, "영어", 90, 95));
		
		System.out.println(manager);
	}
}
