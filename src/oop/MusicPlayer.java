package oop;

public class MusicPlayer {
	int volume = 0;
	boolean isOn = false;

	void on() {
		isOn = true;
		System.out.println("MusicPlayer를 켭니다.");
	}
	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 끕니다.");
	}
	void volumeUp(){
		volume++;
		System.out.println("볼륨을 1 높힙니다. 현재 볼륨 : "+ volume);
	}
	void volumeDown(){
		volume--;
		System.out.println("볼륨을 1 낮춥니다. 현재 볼륨 : "+ volume);
	}
	void showStatus(){
		if(isOn){
			System.out.println("현재 음악 플레이어가 켜져있습니다. 볼륨은 : "+ volume+"입니다. ");	
		}else{
			System.out.println("현재 음악 플레이어가 꺼져있습니다.");	
		}
		
	}

}
