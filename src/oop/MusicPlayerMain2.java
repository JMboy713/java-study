package oop;

public class MusicPlayerMain2 {
	public static void main(String[] args) {
		MusicPlayerData data = new MusicPlayerData();
		data.isOn=true; // 해당 인스턴스의 필드에 접근.
		System.out.println("음악 플레이어를 시작합니다.");

		data.vol++;
		System.out.println("볼륨을 1 올려서 " + data.vol + "로 변경합니다.");

		data.vol++;
		System.out.println("볼륨을 1 올려서 " + data.vol + "로 변경합니다.");
		data.vol--;
		System.out.println("볼륨을 1 내려서 " + data.vol + "로 변경합니다.");

	}
	
}
