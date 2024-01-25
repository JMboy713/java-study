package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	MemberConstruct(String name, int age ) { 
		this(name,age,50);	
	}

	MemberConstruct(String name, int age, int grade) { // 생성자
		System.out.println(name+"age"+age+"grade"+grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}	
}
