/*
 * The MIT License (MIT)
 * Copyright (c) 2013 - 2017 MultiPlus
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.multiplus.examplemod.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.multiplus.examplemod.ExampleMod;

import java.util.ArrayList;

/**
 * Items.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(ExampleMod.MOD_ID)
public final class Items {

    /**
     * All blocks for mod.
     *
     * @see Item
     * @since 1.0.0
     */
    private static ArrayList<Item> items = new ArrayList<>();

    /**
     * Register item for mod.
     *
     * @see Item
     * @since 1.0.0
     */
    public static Item register(final Item item, final String name) {
        item.setRegistryName(ExampleMod.MOD_ID, name)
                .setUnlocalizedName(name);
        items.add(item);
        return item;
    }

    /**
     * Get all items for mod.
     *
     * @see Items
     * @since 1.0.0
     */
    public static ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Create dedicated item for block.
     *
     * @param block block needed item
     * @param name name to registered
     *
     * @see Item
     * @since 1.0.0
     */
    public static Item createItemBlock(final Block block, final String name) {
        final Item item = new ItemBlock(block).setRegistryName(name).setUnlocalizedName(name);
        items.add(item);
        return item;
    }
}
