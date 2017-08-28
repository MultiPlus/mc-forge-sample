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

package net.multiplus.examplemod;

import net.minecraftforge.fml.common.event.*;
import net.multiplus.examplemod.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ExampleMod.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.MOD_NAME, version = ExampleMod.MOD_VERSION)
public class ExampleMod {

    /**
     * Properties of mod.
     *
     * @since 1.0.0
     */
    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "example";
    public static final String MOD_VERSION = "1.0.0";

    /**
     * Injected mod instance.
     *
     * @since 1.0.0
     */
    @Mod.Instance(ExampleMod.MOD_ID)
    public static ExampleMod instance;

    /**
     * Mod Proxy for manage ressources (Distinct server and client).
     *
     * @see CommonProxy
     * @since 1.0.0
     */
    @SidedProxy(serverSide = "net.multiplus.examplemod.common.CommonProxy", clientSide = "net.multiplus.examplemod.client.ClientProxy")
    public static CommonProxy proxy;

    /**
     * Mod Logger.
     *
     * @see Logger
     * @since 1.0.0
     */
    public static final Logger LOGGER = LogManager.getLogger(ExampleMod.MOD_ID);

    /**
     * PreInitialization on startup.
     *
     * @param event triggered event
     * @see FMLPreInitializationEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("PreInit mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        proxy.preInit(event);
    }

    /**
     * Initialization on startup.
     *
     * @param event triggered event
     * @see FMLInitializationEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("Init mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        proxy.init(event);
    }

    /**
     * PostInitialization on startup.
     *
     * @param event triggered event
     * @see FMLPostInitializationEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("PostInit mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        proxy.postInit(event);
    }

    /**
     * Stard server.
     *
     * @param event triggered event
     * @see FMLServerStartedEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void serverStarted(FMLServerStartedEvent event) {
        LOGGER.info("ServerStarted mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        //Get minecraft server instance
        //MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    /**
     * Stop server.
     *
     * @param event triggered event
     * @see FMLServerStoppedEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void serverStopped(FMLServerStoppedEvent event) {
        LOGGER.info("ServerStopped mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
    }

}
