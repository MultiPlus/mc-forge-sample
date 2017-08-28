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

package net.multiplus.examplemod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.multiplus.examplemod.ExampleMod;

import java.util.ArrayList;

/**
 * Blocks.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(ExampleMod.MOD_ID)
public final class Blocks {

    /**
     * All blocks for mod.
     *
     * @see Block
     * @since 1.0.0
     */
    private static ArrayList<Block> blocks = new ArrayList<>();

    /**
     * Required block for mod.
     *
     * @see Block
     * @since 1.0.0
     */
    public static final Block example = register(new ExampleBlock(Material.ROCK).setHardness(1.5F).setResistance(10.0F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS), "example");

    /**
     * Register block for mod.
     *
     * @see Block
     * @since 1.0.0
     */
    public static Block register(final Block block, final String name) {
        block.setRegistryName(ExampleMod.MOD_ID, name)
                .setUnlocalizedName(name);
        blocks.add(block);
        return block;
    }

    /**
     * Get all blocks for mod.
     *
     * @see Block
     * @since 1.0.0
     */
    public static ArrayList<Block> getBlocks() {
        return blocks;
    }

}
