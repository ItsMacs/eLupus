package eu.macsworks.lupusGame.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class LupusGame {

	private final UUID gameID;


	public void tick(){

	}

	public static LupusGame build(){
		return new LupusGame(UUID.randomUUID());
	}

}
