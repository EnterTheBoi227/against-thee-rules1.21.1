package net.entertheboi.sporeatr.core;

import net.entertheboi.sporeatr.NoMoreRules;
import net.entertheboi.sporeatr.entities.basic_infected.InfPig;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.Harbinger.Spore.core.Sentities.BASIC_INFECTED;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> DUMB_ENTITES = DeferredRegister.create(Registries.ENTITY_TYPE,
            NoMoreRules.MODID);
    public static void register(IEventBus eventBus) {
        DUMB_ENTITES.register(eventBus);
    }

    public static final Supplier<EntityType<InfPig>> INF_PIG = DUMB_ENTITES.register("inf_pig",
            () -> EntityType.Builder.of(InfPig::new, BASIC_INFECTED).sized(0.6f, 0.5f)
                    .build(ResourceLocation.fromNamespaceAndPath(NoMoreRules.MODID, "inf_pig").toString()));

    private static <T extends Entity> Supplier<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return DUMB_ENTITES.register(registryname, () -> entityTypeBuilder.build(registryname));
    }
}
