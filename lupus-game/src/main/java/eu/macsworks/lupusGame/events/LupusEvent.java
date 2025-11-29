package eu.macsworks.lupusGame.events;

import eu.macsworks.lupusGame.game.LupusGame;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter @RequiredArgsConstructor
public class LupusEvent extends Event {

	private final LupusGame game;

	private final HandlerList HANDLERS_LIST = new HandlerList();

	@Override
	public @NotNull HandlerList getHandlers() {
		return HANDLERS_LIST;
	}
}
