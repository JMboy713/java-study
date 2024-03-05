package generics.user;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void addPoint(){
        System.out.println(this.name + "님의 포인트가 추가되었습니다.");

    }
}
