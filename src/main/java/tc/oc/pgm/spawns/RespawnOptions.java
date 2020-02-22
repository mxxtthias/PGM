package tc.oc.pgm.spawns;

import javax.annotation.Nullable;
import org.joda.time.Duration;
import tc.oc.util.bukkit.component.Component;

public class RespawnOptions {
  public final Duration delay; // Minimum wait time between death and respawn
  public final long delayTicks;
  public final boolean auto; // Force dead players to respawn as soon as they can
  public final boolean blackout; // Blind dead players
  public final boolean spectate; // Allow dead players to fly around
  public final boolean bedSpawn; // Allow players to respawn from beds
  public final @Nullable Component message; // Message to show respawning players, after the delay

  public RespawnOptions(
      Duration delay,
      boolean auto,
      boolean blackout,
      boolean spectate,
      boolean bedSpawn,
      @Nullable Component message) {
    this.delay = delay;
    this.delayTicks = Math.max(delay.getMillis() / 50, 20);
    this.auto = auto;
    this.blackout = blackout;
    this.spectate = spectate;
    this.bedSpawn = bedSpawn;
    this.message = message;
  }
}
