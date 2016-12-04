/*
 * Copyright (c) 2015. Starlis LLC / dba Empire Minecraft
 *
 * This source code is proprietary software and must not be redistributed without Starlis LLC's approval
 *
 */

package com.empireminecraft.customevents;

import org.bukkit.Location;
import org.bukkit.entity.Bat;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

import java.util.Random;

public class BatMoveEvent extends EntityEvent implements Cancellable {
    private final Bat bat;
    private Location moveTarget;
    private static final Random random = new Random();

    public BatMoveEvent(Bat bat, Location moveTarget) {
        super(bat);
        this.bat = bat;
        this.moveTarget = moveTarget;
    }

    public Bat getBat() {
        return bat;
    }

    public Location getMoveTarget() {
        return moveTarget;
    }

    public void setMoveTarget(Location moveTarget) {
        this.moveTarget = moveTarget;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private boolean cancelled = false;

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public Location generateLoc() {
        return generateLoc(bat);
    }

    public static Location generateLoc(Bat bat) {
        Location loc = bat.getLocation();
        return new Location(bat.getWorld(),
            loc.getBlockX() + random.nextInt(15) - 7,
            loc.getBlockY() + random.nextInt(6) - 2,
            loc.getBlockZ() + random.nextInt(15) - 7
        );
    }
}
