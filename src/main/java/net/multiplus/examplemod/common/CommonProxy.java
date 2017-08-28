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

package net.multiplus.examplemod.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.multiplus.examplemod.common.blocks.Blocks;
import net.multiplus.examplemod.common.items.Items;

/**
 * CommonProxy.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod.EventBusSubscriber
public class CommonProxy {

    /**
     * Pre init proxy
     *
     * @param event event triggered pre initialization
     * @see FMLPreInitializationEvent
     */
    public void preInit(FMLPreInitializationEvent event) {
    }

    /**
     * Init proxy
     *
     * @param event event triggered initialization
     * @see FMLInitializationEvent
     */
    public void init(FMLInitializationEvent event) {
    }

    /**
     * Post init proxy
     *
     * @param event event triggered post initialization
     * @see FMLPostInitializationEvent
     */
    public void postInit(FMLPostInitializationEvent event) {
    }

    /**
     * Register blocks in game.
     *
     * @param evt event triggered register block
     * @see RegistryEvent.Register<Block>
     * @since 1.0.0
     */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> evt) {
        IForgeRegistry<Block> r = evt.getRegistry();
        Blocks.getBlocks().forEach(r::register);
    }

    /**
     * Register items in game.
     *
     * @param evt event triggered register block
     * @see RegistryEvent.Register<Block>
     * @since 1.0.0
     */
    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();
        Blocks.getBlocks().forEach(b -> r.register(Items.createItemBlock(b, b.getUnlocalizedName().replace("tile.", ""))));
    }
}
