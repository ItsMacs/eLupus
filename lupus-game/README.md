# lupus-game

## Game Design
In "Lupus in Fabula", ("Werewolf"), the game loop is divided into two phases: *day* and *night*, with players divided in just two competing categories: *villagers* and *wolves*.
During the *day*, all players, regardless of their category, are called to debate on who the wolves (or wolves allies) are. Wolves have to bluff and debate their way out of being lynched by popular vote, and can take advantage of the occasion by convincing villagers to kill a fellow villager.
During the *night*, while villagers are asleep, the wolves (and wolves allies) can act depending on their role. Some villagers can act at night too, depending on the role they have.

In eLupus, by default, cycles have a set maximum duration of 180 seconds (3 minutes). Players can vote at the start of each game to make this timespan larger or smaller, from 60s (1m) to 300s (5m). (Coming soon)
Players can also choose to play with the default rulebook, or a custom one, with custom roles. (Coming soon)

## Software Design
lupus-game takes an *Object-Oriented* approach, defining a **Game** class, managed by a **GameManager** class.
The plugin is all event-driven and employs only one asynchronous thread to tick games.