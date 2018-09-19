package spring.chapter02;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "范特西";
	private String artist = "Joy";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
