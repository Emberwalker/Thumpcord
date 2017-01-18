package io.drakon.thumpcord

import io.drakon.thumpcord.minecraft.ThumpcordCommand
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLServerStartingEvent
import org.apache.logging.log4j.LogManager

/**
 * Thumpcord - Discord adapter for Thump.
 *
 * @author Arkan <arkan@drakon.io>
 */
@Mod(modid = "thumpcord", name = "Thumpcord", modLanguage = "kotlin", modLanguageAdapter = "io.drakon.thumpcord.lib.KotlinAdapter", acceptableRemoteVersions = "*", acceptedMinecraftVersions = "[1.10]", dependencies = "required-after:Thump")
object Thumpcord {

    val log = LogManager.getLogger("Thumpcord")!!

    @Mod.EventHandler
    fun serverStarting(evt: FMLServerStartingEvent) {
        log.info("Registering Thumpcord command.")
        evt.registerServerCommand(ThumpcordCommand())
    }

}