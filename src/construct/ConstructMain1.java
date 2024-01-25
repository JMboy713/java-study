package construct;

public class ConstructMain1 {
	public static void main(String[] args) {
		MemberConstruct member1=new MemberConstruct("김철수",20,2);// 생성하자 마자 안에 값을 할당. 
		MemberConstruct member2=new MemberConstruct("김영희",30);
		MemberConstruct[] members={member1,member2};	

		for (MemberConstruct member : members) {
			System.out.println("이름 : " + member.name);
			System.out.println("나이 : " + member.age);
			System.out.println("학년 : " + member.grade);
			System.out.println();
		}
	}
}