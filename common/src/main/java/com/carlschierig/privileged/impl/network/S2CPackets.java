package com.carlschierig.privileged.impl.network;

import net.minecraft.server.level.ServerPlayer;

public abstract class S2CPackets {
    public static S2CPackets INSTANCE;

    public S2CPackets() {
        INSTANCE = this;
    }

    public abstract void sendStages(ServerPlayer player);

    /**
     * Sends a stage update to the given player.
     *
     * @param player The player whose stage set was updated.
     * @param stage  The name of the stage.
     * @param added  if {@code true}, the stage is added, otherwise it is removed.
     */
    public abstract void sendStageUpdate(ServerPlayer player, String stage, boolean added);

    public abstract void sendProviders();

    public abstract void clearPrivileges();

    public abstract void sendProviders(ServerPlayer player);

    public abstract void clearPrivileges(ServerPlayer player);
}
