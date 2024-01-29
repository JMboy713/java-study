package access;

public class Speaker {
	private int volume;

	Speaker(int volume) {
		if (volume>100 || volume<0) {
			System.out.println("볼륨을 0~100 사이로 설정해주세요.");
			return;
		}else{
			this.volume = volume;
		}
		// this.volume = volume;
	}

	void volumeup() {
		if (volume >= 100) {
			System.out.println("볼륨을 더이상 높일 수 없습니다.");
		}else {
			volume+=10;
			System.out.println("볼륨을 10 올렸습니다. 현재 볼륨: " + volume);
		}
	}	
	void volumeDown() {
		if (volume <= 0) {
			System.out.println("볼륨을 더이상 낮출 수 없습니다.");
		}else {
			volume-=10;
			System.out.println("볼륨을 10 내렸습니다. 현재 볼륨: " + volume);
		}
	}
	void showVolume() {
		System.out.println("현재 볼륨: " + volume);
	}
}
