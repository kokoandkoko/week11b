package week11b;

public class Student {
	
	String name,grade,subject;
	int id;
	
	
	
	public Student() {
		super();
		System.out.println("Show");
		
	}
	
	
	
		Student(int i,String n,String g,String s){
			 id = i;
			 name = n;
			 grade = g;
			 subject = s;
		}

		
		Student(Student s){
			id = s.id;
			name = s.name;
			
		}
		
	
		
		
		void display() {
			System.out.println(id+" "+name+" "+grade+" "+subject);
		}
	
	public static void main(String[]arge) {
		
		Student std1 = new Student(3901001,"Karen","SSR","pasaC");
		Student std2 = new Student(3901001,"Garen","SR","pasaC");
		Student std3 = new Student(3901001,"Aren","R","pasaC");
		Student std4 = new Student(std3);
		std1.display();
		std2.display();
		std3.display();
		std4.display();
		
	}
}
