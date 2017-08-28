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

package net.multiplus.template.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.multiplus.template.common.CommonProxy;
import net.multiplus.template.common.items.Items;

/**
 * ClientProxy.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    /**
     * Register model for each item (inventory renderer).
     *
     * @param event Triggered event
     * @see ModelRegistryEvent
     * @since 1.0.0
     */
    @SubscribeEvent
    public static void registerModels(final ModelRegistryEvent event) {
        Items.getItems().forEach(i -> {
            ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
        });
    }

    /**
     * Pre initialize client proxy.
     *
     * @param event Triggered event
     * @see FMLPreInitializationEvent
     * @since 1.0.0
     */
    @Override
    public void preInit(final FMLPreInitializationEvent event) {
        super.preInit(event);
    }
}
