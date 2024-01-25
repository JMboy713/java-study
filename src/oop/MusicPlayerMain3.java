package oop;

public class MusicPlayerMain3 {
	public static void main(String[] args) {
		MusicPlayerData data = new MusicPlayerData();
		on(data);
		volUp(data);
		volUp(data);
		volDown(data);	
		off(data);
	}
	static void on(MusicPlayerData data) {
		data.isOn=true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	static void off(MusicPlayerData data) {
		data.isOn=false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	static void volUp(MusicPlayerData data) {
		data.vol++;
		System.out.println("볼륨을 1 올려서 " + data.vol + "로 변경합니다.");
	}
	static void volDown(MusicPlayerData data) {
		data.vol--;
		System.out.println("볼륨을 1 내려서 " + data.vol + "로 변경합니다.");
	}
}
