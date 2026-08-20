package net.entertheboi.sporeatr.client;

import net.entertheboi.sporeatr.NoMoreRules;
import net.entertheboi.sporeatr.client.renderers.InfectedPigRenderer;
import net.entertheboi.sporeatr.core.ModEntities;
import net.entertheboi.sporeatr.entities.basic_infected.InfPig;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(value = NoMoreRules.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = NoMoreRules.MODID, value = Dist.CLIENT)

public class ClientBullshit {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.INF_PIG.get(), InfectedPigRenderer::new);
    }
}
