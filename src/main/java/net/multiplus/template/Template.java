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

package net.multiplus.template;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.multiplus.template.common.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Template.
 * The main entry of forge mod.
 *
 * @author MultiPlus
 * @version 1.0.0
 * @since 1.0.0
 */
@Mod(modid = Template.MOD_ID, name = Template.MOD_NAME, version = Template.MOD_VERSION)
public class Template {

    /**
     * Properties of mod.
     *
     * @since 1.0.0
     */
    public static final String MOD_ID = "template";
    public static final String MOD_NAME = "template";
    public static final String MOD_VERSION = "1.0.0";
    /**
     * Mod Logger.
     *
     * @see Logger
     * @since 1.0.0
     */
    public static final Logger LOGGER = LogManager.getLogger(Template.MOD_ID);
    /**
     * Injected mod instance.
     *
     * @since 1.0.0
     */
    @Mod.Instance(Template.MOD_ID)
    public static Template instance;
    /**
     * Mod Proxy for manage resources (Distinct server and client).
     *
     * @see CommonProxy
     * @since 1.0.0
     */
    @SidedProxy(serverSide = "net.multiplus.template.common.CommonProxy", clientSide = "net.multiplus.template.client.ClientProxy")
    public static CommonProxy proxy;

    /**
     * Pre initialization on startup.
     *
     * @param event triggered event
     * @see FMLPreInitializationEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
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
    public void init(final FMLInitializationEvent event) {
        LOGGER.info("Init mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        proxy.init(event);
    }

    /**
     * Post initialization on startup.
     *
     * @param event triggered event
     * @see FMLPostInitializationEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        LOGGER.info("PostInit mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        proxy.postInit(event);
    }

    /**
     * When started server.
     *
     * @param event triggered event
     * @see FMLServerStartedEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void serverStarted(final FMLServerStartedEvent event) {
        LOGGER.info("ServerStarted mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
        //Get minecraft server instance
        //MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    /**
     * When stopped server.
     *
     * @param event triggered event
     * @see FMLServerStoppedEvent
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void serverStopped(final FMLServerStoppedEvent event) {
        LOGGER.info("ServerStopped mod " + MOD_NAME + "#" + MOD_ID + " " + MOD_VERSION);
    }

}
