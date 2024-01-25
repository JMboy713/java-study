package construct;

public class MemberInit {
		String name;
		int age;
		int grade;
	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		// this : 자기 자신의 객체를 가리키는 참조변수 (this.name : 멤버변수, name : 지역변수)
	}	
}
