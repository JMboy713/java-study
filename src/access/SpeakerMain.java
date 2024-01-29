package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(100);
		speaker.showVolume();

		speaker.volumeup();
		speaker.showVolume();

		speaker.volumeup();
		speaker.showVolume();

		// speaker.volume=200; // 직접 접근.
		speaker.showVolume();
	}
}
