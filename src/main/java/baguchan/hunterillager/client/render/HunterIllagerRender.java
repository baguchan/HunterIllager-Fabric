package baguchan.hunterillager.client.render;

import baguchan.hunterillager.HunterIllager;
import baguchan.hunterillager.client.model.HunterModel;
import baguchan.hunterillager.entity.Hunter;
import baguchan.hunterillager.init.ModModelLayers;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class HunterIllagerRender<T extends Hunter> extends MobRenderer<T, HunterModel<T>> {
	private static final ResourceLocation ILLAGER = new ResourceLocation(HunterIllager.MODID, "textures/entity/hunter.png");

	public HunterIllagerRender(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new HunterModel<>(renderManagerIn.bakeLayer(ModModelLayers.HUNTERILLAGER)), 0.5F);
		this.addLayer(new ItemInHandLayer<>(this, Minecraft.getInstance().getEntityRenderDispatcher().getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(T p_110775_1_) {
		return ILLAGER;
	}
}
