package ref;

public class Method1 {

	public static void main(String[] args) {
		Student stu1=new Student();			
		initStudent(stu1,"홍길동",15,1);
		Student stu2=new Student();
		initStudent(stu2,"김길동",16,2);
		printStudent(stu2);

		printStudent(stu1);

	}
	static void initStudent(Student stu,String name, int age, int grade) {
		stu.name=name;
		stu.age=age;
		stu.grade=grade;
	}

	static void printStudent(Student stu) {
		System.out.println("이름 : "+stu.name);
		System.out.println("나이 : "+stu.age);
		System.out.println("학년 : "+stu.grade);
	}
		
}