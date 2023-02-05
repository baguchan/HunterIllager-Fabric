package baguchan.hunterillager.init;

import baguchan.hunterillager.HunterIllager;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.stream.Stream;

public class ModCreativeTabEvents {
	private static final List<ItemStack> generalItems = Stream.of(
			HunterItems.BOOMERANG,
			HunterItems.SPAWNEGG_HUNTERILLAGER
	).map(ItemStack::new).toList();

	public static final CreativeModeTab TAB_MOB_ENCHANT = FabricItemGroup.builder(new ResourceLocation(HunterIllager.MODID, "general"))
			.icon(HunterItems.BOOMERANG::getDefaultInstance)
			.displayItems((featureFlagSet, output, operatorEnabled) -> {
				output.acceptAll(generalItems);
			})
			.build();

	public static void initModCreativeModeTabs() {
	}
}
