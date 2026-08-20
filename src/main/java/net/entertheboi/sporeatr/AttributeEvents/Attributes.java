package net.entertheboi.sporeatr.AttributeEvents;

import net.entertheboi.sporeatr.core.ModEntities;
import net.entertheboi.sporeatr.entities.basic_infected.InfPig;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

public class Attributes {
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.INF_PIG.get(), InfPig.createAttributes().build());
    }
}
