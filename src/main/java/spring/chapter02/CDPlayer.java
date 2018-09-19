package spring.chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;

	@Override
	public void play() {
		cd.play();

	}

}
