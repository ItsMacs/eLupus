package eu.macsworks.lupusGame.game;

import eu.macsworks.lupusGame.LupusGamePlugin;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class LupusGameManager {

	private final LupusGamePlugin pluginInstance;
	private final Map<UUID, LupusGame> activeGames = new HashMap<>();

	public LupusGameManager(){
		pluginInstance = LupusGamePlugin.getInstance();

		pluginInstance.getServer().getAsyncScheduler().runAtFixedRate(pluginInstance, task -> this.tickGames(), 0, 500, TimeUnit.MILLISECONDS);
	}


	private void tickGames(){
		getGames().forEach(LupusGame::tick);
	}

	public LupusGame newGame(){
		LupusGame game = LupusGame.build();
		activeGames.put(game.getGameID(), game);
		return game;
	}


	public Optional<LupusGame> getGame(UUID uuid){
		return Optional.ofNullable(activeGames.get(uuid));
	}

	public Collection<LupusGame> getGames(){
		return activeGames.values();
	}

}
