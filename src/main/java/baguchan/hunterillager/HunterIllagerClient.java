package baguchan.hunterillager;

import baguchan.hunterillager.client.model.HunterModel;
import baguchan.hunterillager.client.render.BoomerangRender;
import baguchan.hunterillager.client.render.HunterIllagerRender;
import baguchan.hunterillager.init.HunterEntityRegistry;
import baguchan.hunterillager.init.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class HunterIllagerClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(HunterEntityRegistry.HUNTERILLAGER, HunterIllagerRender::new);
		EntityRendererRegistry.register(HunterEntityRegistry.BOOMERANG, BoomerangRender::new);

		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HUNTERILLAGER, HunterModel::createBodyLayer);
	}
}
