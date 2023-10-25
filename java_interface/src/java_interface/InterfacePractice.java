package java_interface;

interface Playable {
	void play();

	void pause();

	void stop();
}

class MP3Player implements Playable {

	@Override
	public void play() {
		System.out.println("MP3 재생");
	}

	@Override
	public void pause() {
		System.out.println("MP3 일시정지");
	}

	@Override
	public void stop() {
		System.out.println("MP3 정지");
	}

}

class DVDPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("DVD 재생");
	}

	@Override
	public void pause() {
		System.out.println("DVD 일시정지");
	}

	@Override
	public void stop() {
		System.out.println("DVD 정");
	}

}

public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player();
		DVDPlayer dvd = new DVDPlayer();
		
		mp3.play();
		mp3.pause();
		mp3.stop();
		dvd.play();
		dvd.pause();
		dvd.stop();
	}

}
