/* Decompiler 18ms, total 277ms, lines 35 */
package net.entertheboi.sporeatr.client.renderers;

import com.Harbinger.Spore.Client.Models.InfectedModel;
import com.Harbinger.Spore.Client.Special.BaseInfectedRenderer;
import net.entertheboi.sporeatr.client.models.InfectedPigModel;
import net.entertheboi.sporeatr.entities.basic_infected.InfPig;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class InfectedPigRenderer<Type extends InfPig> extends BaseInfectedRenderer<Type, InfectedPigModel<Type>> {
   private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("sporeatr", "textures/entity/inf_pig.png");
   private static final ResourceLocation EYES_TEXTURE = ResourceLocation.fromNamespaceAndPath("sporeatr", "textures/entity/eyes/pig_eyes.png");

   public InfectedPigRenderer(Context context) {
      super(context, new InfectedPigModel<>(), 0.5F);
   }

   public ResourceLocation getTextureLocation(Type entity) {
      return TEXTURE;
   }

   public ResourceLocation eyeLayerTexture() {
      return EYES_TEXTURE;
   }

   // $FF: synthetic method
   // $FF: bridge method

}
