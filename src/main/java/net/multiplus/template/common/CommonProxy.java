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

package net.multiplus.template.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.multiplus.template.common.blocks.Blocks;
import net.multiplus.template.common.items.Items;

/**
 * CommonProxy.
 * The main abstract proxy moralize all feature.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod.EventBusSubscriber
public abstract class CommonProxy {

    /**
     * Register all blocks in game.
     *
     * @param event event triggered register block
     * @see RegistryEvent.Register<Block>
     * @since 1.0.0
     */
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> r = event.getRegistry();
        Blocks.getBlocks().forEach(r::register);
    }

    /**
     * Register all items in game.
     *
     * @param event event triggered register block
     * @see RegistryEvent.Register<Block>
     * @since 1.0.0
     */
    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        Blocks.getBlocks().forEach(b -> Items.createItemBlock(b, b.getRegistryName().getResourcePath()));
        Items.getItems().forEach(r::register);
    }

    /**
     * Pre initialize proxy.
     *
     * @param event event triggered pre initialization
     * @see FMLPreInitializationEvent
     * @since 1.0.0
     */
    public void preInit(final FMLPreInitializationEvent event) {
    }

    /**
     * Initialize proxy.
     *
     * @param event event triggered initialization
     * @see FMLInitializationEvent
     * @since 1.0.0
     */
    public void init(final FMLInitializationEvent event) {
    }

    /**
     * Post initialize proxy.
     *
     * @param event event triggered post initialization
     * @see FMLPostInitializationEvent
     * @since 1.0.0
     */
    public void postInit(final FMLPostInitializationEvent event) {
    }
}
