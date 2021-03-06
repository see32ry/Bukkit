/*
 * Copyright (c) 2016 Starlis LLC / Daniel Ennis (Aikar) - MIT License
 *
 *  Permission is hereby granted, free of charge, to any person obtaining
 *  a copy of this software and associated documentation files (the
 *  "Software"), to deal in the Software without restriction, including
 *  without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to
 *  permit persons to whom the Software is furnished to do so, subject to
 *  the following conditions:
 *
 *  The above copyright notice and this permission notice shall be
 *  included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 *  LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 *  OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 *  WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.empireminecraft.api;

import org.bukkit.NamespacedKey;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public interface EAPI_Misc {

    /**
     * Gets Registered Entity Type for this spawn egg.
     * @param bukkitItem
     * @return
     */
    EntityType getTypeForSpawnEgg(@Nonnull ItemStack bukkitItem);

    /**
     * Changes the type of a Spawn Egg and returns new itemstack. ALWAYS USE THE RETURNED STACK
     * @param bukkitItem
     * @param key
     * @return
     */
    ItemStack spawnEggAsType(@Nonnull ItemStack bukkitItem, @Nonnull NamespacedKey key);

    /**
     *
     * @param structure
     * @param center
     * @param undiscoveredOnly
     * @return
     */
    Location findNearestStructure(@Nonnull String structure, @Nonnull Location center, boolean undiscoveredOnly);

    /**
     *
     * @param mapType
     * @param loc
     * @return
     */
    ItemStack createTreasureMap(@Nonnull String mapType, int iconType, @Nonnull Location loc);


    /**
     * Returns if this is a shulker box with items in it.
     * @param shulker
     * @return Has items or not
     */
    boolean hasShulkerInventory(@Nonnull ItemStack shulker);

    /**
     * Returns a list of items inside of a Shulker Box Item Stack
     * @param shulker
     * @return List of Items, Not Mutable
     */
    @Nullable
    List<ItemStack> getShulkerInventory(@Nonnull ItemStack shulker);
}
